"""
Shared by test code
"""
__author__ = 'Dan Gunter <dkgunter@lbl.gov>'
__date__ = '8/11/15'

# Stdlib
import os

# Local
from doekbase.data_api.core import ObjectAPI
from doekbase.data_api.util import get_logger
from doekbase.data_api import cache

genome = "8020/39/1"

try:
    token = os.environ["KB_AUTH_TOKEN"]
except KeyError:
    token = None

# Logging
_log = None
services = None

# Globals
g_ws_url = ""
g_shock_url = ""
g_handle_url = ""

g_redis_bin = os.environ.get('KB_REDIS_BIN', '/usr/local/bin/redis-server')
g_redis_conf = os.environ.get('KB_REDIS_CONF', 'redis.conf')
g_kbase_conf = os.environ.get('KB_DEPLOY_CFG', 'deployment.cfg')

# Functions and classes

def in_travis():
    return os.environ.get('TRAVIS', 'false') == 'true'

def get_services(stanza='dir_nocache'):
    if g_kbase_conf is not None:
        import ConfigParser
        deploy_config = ConfigParser.ConfigParser()
        deploy_config.read(g_kbase_conf)
    else:
        raise Exception("Unable to read from {}".format(g_kbase_conf))

    services = dict()

    global_stanza_name = 'data_api' + ".kbase." + os.environ.get("KB_DEPLOY_URL", stanza)
    services["shock_service_url"] = deploy_config.get(global_stanza_name, "shock_service_url")
    services["handle_service_url"] = deploy_config.get(global_stanza_name, "handle_service_url")
    services["workspace_service_url"] = deploy_config.get(global_stanza_name, "workspace_service_url")

    global g_ws_url, g_shock_url, g_handle_url
    g_ws_url = services["workspace_service_url"]
    g_shock_url = services["shock_service_url"]
    g_handle_url = services["handle_service_url"]

    try:
        services["redis_host"] = deploy_config.get(global_stanza_name, "redis_host")
        services["redis_port"] = deploy_config.get(global_stanza_name, "redis_port")
    except ConfigParser.NoOptionError:
        services["redis_host"] = None
        services["redis_port"] = None

    #print("@@ service URLs = {}".format(services))
    return services

def can_connect(ref=genome, deployment_config='dir_nocache'):
    """See if we can get a connection to the workspace and access the
    given reference.

    Args:
      ref (str): Workspace object reference
      deployment_config (str): Deployment configuration section
    Returns:
      (bool) if it can be accessed
    """
    try:
        _ = ObjectAPI(services=get_services(stanza=deployment_config), ref=ref)
    except Exception as err:
        _log.exception(err)
        _log.warn('Connect and fetch object failed: {}'.format(err))
        return False
    return True

def determine_can_connect(workspaces):
    """Replace value with connection status.
       Now we can simply refer to the dict entry in future tests. Also add
       a special 'all' to handle all features in a given workspace.

    Args:
      workspaces (dict): 2-level dict of {'name': {'name2': 'full-ws-id', .. }}
    """
    for num in workspaces:
        all_objects = True
        for ref in workspaces[num]:
            if isinstance(workspaces[num][ref], bool):
                continue # skip, already determined
            ok = can_connect(workspaces[num][ref])
            workspaces[num][ref] = ok
            all_objects = all_objects and ref
        workspaces[num]['all'] = all_objects
    return workspaces

# Print this when we skip a function due to inability to fetch
# required objects
connect_fail = 'Cannot fetch all required objects from workspace'

def setup():
    global _log, services
    _log = get_logger('doekbase.data_api.tests.shared')
    services = get_services()
    if services["redis_host"] is not None:
        cache.ObjectCache.cache_class = cache.RedisCache
        cache.ObjectCache.cache_params = {
            'redis_host': services["redis_host"],
            'redis_port': services["redis_port"]}

def teardown():
    pass

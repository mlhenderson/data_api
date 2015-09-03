"""
Test workspace mocking.
"""
__author__ = 'Dan Gunter <dkgunter@lbl.gov>'
__date__ = '9/3/15'

# Imports

# stdlib
import json
from StringIO import StringIO
# third-party
# local
from biokbase.data_api import wsmock

record_template = '''{{
        "ref": "{ref}",
        "type": "{type}",
        "name": "{name}",
        "metadata": {{ }},
        "data": {data}
}}'''

def foo_datum(n):
    d = {'index': n, 'value': n * 2.0,
        'muppets': {
            'colors': {
                'kermit': 'green',
                'animal': 'orange'
            },
            'actors': {
                'kermit': 'Jim Henson',
                'animal': 'Frank Oz',
            }
        }}
    return json.dumps(d)

_mock = None

def setup():
    global _mock
    print("Setting up mock DB")
    infile = StringIO('[' + ',\n'.join([
        record_template.format(**kw) for kw in [
            {'ref': '10/1', 'type': 'Foo',
             'name': 'first', 'data': foo_datum(1)},
            {'ref': '10/2', 'type': 'Foo',
             'name': 'second', 'data': foo_datum(2)},
        ]
    ]) + ']')
    _mock = wsmock.WorkspaceMock(infile)
    # note: run nosetests with '-s' to see this
    #print("@@ input data:")
    #print(infile.getvalue())

def test_get_object_history():
    # just make sure it doesn't crash.
    _mock.get_object_history({'ref': '10/1'})

def test_get_object_info_new():
    r = _mock.get_object_info_new({'objects': [{'ref': '10/1'}]})
    assert len(r) == 1
    obj = r[0]
    #print("@@ get_oin-obj: {}".format(obj))
    assert obj['workspace_name'] == 'first'
    assert obj['type_string'] == 'Foo'

def test_get_object_provenance():
    # just make sure it doesn't crash.
    _mock.get_object_provenance({'ref': '10/1'})

def test_get_object_subset():
    actors_1 = {'ref': '10/1', 'included': ['muppets.actors']}
    r = _mock.get_object_subset([actors_1])
    assert len(r) == 1
    obj = r[0]
    #print("@@ get_os-obj: {}".format(obj))
    assert 'muppets' in obj
    assert 'actors' in obj['muppets']
    assert 'colors' not in obj['muppets']
    # try again, this time with 2
    actors_2 = {'ref': '10/2', 'included': ['muppets.actors']}
    r = _mock.get_object_subset([actors_1, actors_2])
    assert len(r) == 2
    for obj in r:
        assert 'muppets' in obj
        assert 'actors' in obj['muppets']
        assert 'colors' not in obj['muppets']



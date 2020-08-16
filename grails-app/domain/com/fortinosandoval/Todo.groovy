package com.fortinosandoval

import grails.rest.Resource

@Resource(uri = '/api/todos', formats = ['json', 'xml'])
class Todo {
    Long id;
    String todoDesc;
    String username;

    static mapping = {
        version false
        table 'todos'
        id column: 'id', generator: 'native', params: [sequence: 'todo_seq']
    }

    static constraints = {
        todoDesc blank: false
    }
}

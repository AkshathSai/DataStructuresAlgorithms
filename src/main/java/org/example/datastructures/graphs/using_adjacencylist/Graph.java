package org.example.datastructures.graphs.using_adjacencylist;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.HashMap;

@Slf4j
public class Graph<E> {

    private HashMap<E, ArrayList<E>> adjList = new HashMap<>();

    public boolean addVertex(E vertex) {

        /**
         * Since, Map doesn't allow duplicate keys
         */
        if (adjList.get(vertex) == null) {
            adjList.put(vertex, new ArrayList<>());
            return true;
        }

        return false;
    }

    public boolean addEdge(E vertex1, E vertex2) {

        if (adjList.get(vertex1) != null && adjList.get(vertex2) !=null){
            adjList.get(vertex1).add(vertex2);
            adjList.get(vertex2).add(vertex1);
            return true;
        }
        return false;
    }

    public boolean removeVertex(E vertex) {

        if (adjList.isEmpty()) {
            return false;
        } else if (adjList.get(vertex) != null){

            for (E otherVertex: adjList.get(vertex)) {
                adjList.get(otherVertex).remove(vertex);
            }

            adjList.remove(vertex);
            return true;
        }

        return false;
    }

    public boolean removeEdge(E vertex1, E vertex2) {

        if (adjList.isEmpty()) {
            return false;
        } else if (adjList.get(vertex1) != null && adjList.get(vertex2) != null) {
            adjList.get(vertex1).remove(vertex2);
            adjList.get(vertex2).remove(vertex1);
            return true;
        }

        return false;
    }

    public void printGraph() {
        log.info("Current Graph Structure \n" + adjList);
    }

}

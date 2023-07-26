package org.example.graphs.using_adjacencylist;

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

    public void printGraph() {
        LOGGER.info("Current Graph Structure \n" + adjList);
    }

}

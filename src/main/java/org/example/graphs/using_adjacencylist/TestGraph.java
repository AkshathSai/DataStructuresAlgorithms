package org.example.graphs.using_adjacencylist;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class TestGraph {

    public static void main(String[] args) {

        Graph<String> testGraph = new Graph<>();
        testGraph.addVertex("A");
        testGraph.addVertex("B");
        testGraph.printGraph();

        testGraph.addVertex("C");
        testGraph.printGraph();

        testGraph.removeVertex("C");
        testGraph.printGraph();

        testGraph.addVertex("C");
        LOGGER.info("Remove D -> " + testGraph.removeVertex("D"));

        testGraph.addEdge("A", "B");
        testGraph.addEdge("A", "C");
        testGraph.addEdge("B", "C");
        testGraph.printGraph();

        testGraph.removeEdge("A", "B");
        testGraph.printGraph();

        testGraph.removeVertex("C");
        testGraph.printGraph();
    }

}

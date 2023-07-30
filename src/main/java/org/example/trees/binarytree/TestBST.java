package org.example.trees.binarytree;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class TestBST {

    public static void main(String[] args) {

        BinarySearchTree<Integer> bst = new BinarySearchTree<>();
        LOGGER.info("Is Empty? " + bst.isEmpty());
        bst.insert(25);
        bst.insert(15);
        bst.insert(30);
        bst.insert(45);
        bst.insert(11);
        LOGGER.info("Is BST empty: " + bst.isEmpty());
        bst.displayLinkStructure();
        LOGGER.info("Lookup: " + bst.lookup(11));
        LOGGER.info("Lookup: " + bst.lookup(45));
        LOGGER.info("Lookup: " + bst.lookup(43));
        LOGGER.info("Delete 11 ");
        bst.delete(11);
        bst.displayLinkStructure();
        LOGGER.info("Delete 45: ");
        bst.delete(45);
        bst.displayLinkStructure();
        LOGGER.info("Delete 47: ");
        bst.delete(47);
        bst.displayLinkStructure();
        bst.insert(21);
        bst.insert(67);
        bst.insert(5);
        bst.insert(29);
        bst.displayLinkStructure();
        bst.insert(7);
        bst.insert(22);
        bst.insert(34);
        bst.insert(37);
        bst.insert(27);
        bst.displayLinkStructure();
        LOGGER.info("Minimum: " + bst.getMinimum());
        LOGGER.info("Maximum: " + bst.getMaximum());
        bst.delete(15);
        bst.displayLinkStructure();
        bst.delete(25);
        bst.displayLinkStructure();
        LOGGER.info("Is Empty? " + bst.isEmpty());

        BinarySearchTree<Integer> bst2 = new BinarySearchTree<>();
        bst2.insert(47);
        bst2.insert(21);
        bst2.insert(76);
        bst2.insert(18);
        bst2.insert(27);
        bst2.insert(52);
        bst2.insert(82);
        LOGGER.info("BFS: " + bst2.breadthFirstSearch());
        LOGGER.info("DFS PreOrder: " + bst2.depthFirstSearchPreOrderTraversal());
        LOGGER.info("DFS InOrder: " + bst2.depthFirstSearchInOrderTraversal());
        LOGGER.info("DFS PostOrder: " + bst2.depthFirstSearchPostOrderTraversal());

    }

}

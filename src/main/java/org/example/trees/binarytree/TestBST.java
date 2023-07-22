package org.example.trees.binarytree;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class TestBST {

    public static void main(String[] args) {

        BinarySearchTree<Integer> bst = new BinarySearchTree<>();
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
    }

}

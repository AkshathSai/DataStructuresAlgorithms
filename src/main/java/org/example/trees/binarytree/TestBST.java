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
    }

}

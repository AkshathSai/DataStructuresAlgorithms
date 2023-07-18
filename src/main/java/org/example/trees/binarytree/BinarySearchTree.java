package org.example.trees.binarytree;

import lombok.extern.slf4j.Slf4j;


@Slf4j
public class BinarySearchTree<E extends Comparable<E>> {

    private Node<E> rootNode;

    private int height = -1;


    public boolean isEmpty() {
        return (height == -1);
    }

    /**
     * @return Height/Depth of the Binary Tree
     */
    public int getHeight() {
        return height;
    }

    public void insert(E value) {
        this.rootNode = insertRecursively(this.rootNode, value);
    }

    public Node<E> insertRecursively(Node<E> currentNode, E value) {

        if (currentNode == null) {
            return new Node<>(value);
        }

        int compare = value.compareTo(currentNode.getData());

        if (compare < 0) { //Left subtree
            currentNode.setLeftChild(insertRecursively(currentNode.getLeftChild(), value));
        } else { //(compare > 0) Right subtree
            currentNode.setRightChild(insertRecursively(currentNode.getRightChild(), value));
        }

        return currentNode;
    }

    public E lookup(E value) {

        Node<E> node = lookupRecursively(this.rootNode, value);
        if (node != null) {
            return node.getData();
        }

        return null;
    }

    private Node<E> lookupRecursively(Node<E> currentNode, E value) {

        if (currentNode == null) {
            return null;
        }

        int compare = value.compareTo(currentNode.getData());

        if (compare == 0) {
            return currentNode;
        } else if (compare < 0) { //Left
            LOGGER.debug(value + " < " + currentNode.getData() + " Looking in the left subtree");
            return lookupRecursively(currentNode.getLeftChild(), value);
        } else if (compare > 0) { //Right
            LOGGER.debug(value + " > " + currentNode.getData() + " Looking in the right subtree");
            return lookupRecursively(currentNode.getRightChild(), value);
        }

        LOGGER.info("Element not found!");

        return null;
    }

    public boolean delete(E value) {

       Node<E> currentNode = lookupRecursively(this.rootNode, value);

        if (currentNode != null) {
            currentNode = null;
            return true;
        } else {
          LOGGER.info("Element does not exist!!");
        }

        return false;
    }

    public void displayLinkStructure() {
        LOGGER.debug("BST:\n" + rootNode);
    }


}

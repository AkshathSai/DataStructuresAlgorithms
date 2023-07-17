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
        this.rootNode = insertRecursively(rootNode, value);
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

    public void displayLinkStructure() {
        LOGGER.debug("BST:\n" + rootNode);
    }

}

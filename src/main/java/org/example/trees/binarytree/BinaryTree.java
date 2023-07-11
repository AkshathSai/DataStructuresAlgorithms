package org.example.trees.binarytree;


public class BinaryTree<E> {

    private Node<E> rootNode;

    private int height = -1;

    public BinaryTree() {
        rootNode = new Node<>();
    }

    public boolean isEmpty() {
        return (height == -1);
    }

    /**
     * @return Height/Depth of the Binary Tree
     */
    public int getHeight() {
        return height;
    }

    public void add(E value) {
        rootNode = addRecursive(rootNode, value);
    }

    private Node<E> addRecursive(Node<E> current, E value) {

        if (current == null) {
            return new Node<>(value);
        }

        return null;
    }

}

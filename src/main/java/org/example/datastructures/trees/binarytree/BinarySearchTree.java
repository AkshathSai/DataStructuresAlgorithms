package org.example.datastructures.trees.binarytree;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;


@Slf4j
public class BinarySearchTree<E extends Comparable<E>> {

    private Node<E> rootNode;

    public boolean isEmpty() {
        return (this.rootNode == null);
    }

    public void insert(E value) {
        this.rootNode = insertRecursively(this.rootNode, value);
    }

    private Node<E> insertRecursively(Node<E> currentNode, E value) {

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
            LOGGER.info("Element not found!");
            return null;
        }

        int compare = value.compareTo(currentNode.getData());

        if (compare == 0) {
            return currentNode;
        } else if (compare < 0) { //Left
            LOGGER.debug(value + " < " + currentNode.getData() + " Looking in the left subtree");
            return lookupRecursively(currentNode.getLeftChild(), value);
        }

        //Right
        LOGGER.debug(value + " > " + currentNode.getData() + " Looking in the right subtree");
        return lookupRecursively(currentNode.getRightChild(), value);
    }

    public void delete(E value) {
        deleteRecursively(this.rootNode, value);
    }

    private Node<E> deleteRecursively(Node<E> currentNode, E value) {

        if (currentNode == null) {
            return null;
        }

        int compareTo = value.compareTo(currentNode.getData());

        if (compareTo < 0) { //Left
            currentNode.setLeftChild(deleteRecursively(currentNode.getLeftChild(), value));
        } else if (compareTo > 0) { //Right
            currentNode.setRightChild(deleteRecursively(currentNode.getRightChild(), value));
        } else {
            //For deleting a Node with no children
            if (currentNode.getLeftChild() == null && currentNode.getRightChild() == null) {
                return null;
            } else if (currentNode.getLeftChild() == null) {
                currentNode = currentNode.getRightChild();
            } else if (currentNode.getRightChild() == null) {
                currentNode = currentNode.getLeftChild();
            } else {
                E subTreeMinimum = minValue(currentNode.getRightChild());
                currentNode.setData(subTreeMinimum);
                currentNode.setRightChild(deleteRecursively(currentNode.getRightChild(), subTreeMinimum));
            }
        }

        return currentNode;
    }

    /**
     * Helper method
     */
    private E minValue(Node<E> currentNode) {

        while (currentNode.getLeftChild()!= null) {
            currentNode = currentNode.getLeftChild();
        }

        return currentNode.getData();
    }

    public void displayLinkStructure() {
        LOGGER.debug("BST:\n" + rootNode);
    }

    public E getMinimum() {

        if (this.rootNode == null) {
            LOGGER.info("No Elements found in the Tree");
            return null;
        }

        Node<E> currentNode = this.rootNode;

        while (currentNode.getLeftChild() != null) {
            currentNode = currentNode.getLeftChild();
        }

        return currentNode.getData();
    }

    public E getMaximum() {

        if (this.rootNode == null) {
            LOGGER.info("No Elements found in the Tree");
            return null;
        }

        Node<E> currentNode = this.rootNode;

        while (currentNode.getRightChild() != null) {
            currentNode = currentNode.getRightChild();
        }

        return currentNode.getData();
    }

    public ArrayList<E> breadthFirstSearch() {

        Node<E> currentNode = rootNode;

        Queue<Node> queue = new LinkedList<>();
        ArrayList<E> nodeList = new ArrayList<>();
        queue.add(currentNode);

        while (queue.size() > 0) {
            currentNode = queue.remove();
            nodeList.add(currentNode.getData());
            if (currentNode.getLeftChild() != null) {
                queue.add(currentNode.getLeftChild());
            }
            if (currentNode.getRightChild() != null) {
                queue.add(currentNode.getRightChild());
            }

        }

        return nodeList;
    }

    public ArrayList<E> depthFirstSearchPreOrderTraversal() {
        ArrayList<E> nodes = new ArrayList<>();

        depthFirstSearchPreOrderTraversalHelper(this.rootNode, nodes);
        /*class Traverse {
            Traverse(Node<E> currentNode) {
                nodes.add(currentNode.getData());
                if (currentNode.getLeftChild() != null) {
                    new Traverse(currentNode.getLeftChild());
                }
                if (currentNode.getRightChild() != null) {
                   new Traverse(currentNode.getRightChild());
                }
            }
        }
        new Traverse(this.rootNode);*/

        return nodes;
    }

    private void depthFirstSearchPreOrderTraversalHelper(Node<E> currentNode, ArrayList<E> nodes) {

        if (currentNode == null) {
            return;
        }

        nodes.add(currentNode.getData());
        depthFirstSearchPreOrderTraversalHelper(currentNode.getLeftChild(), nodes);
        depthFirstSearchPreOrderTraversalHelper(currentNode.getRightChild(), nodes);
    }

    /**
     * DFS - InOrder Traversal
     * will sort the elements in numerical order
     */
    public ArrayList<E> depthFirstSearchInOrderTraversal() {
        ArrayList<E> nodes = new ArrayList<>();

        depthFirstSearchInOrderTraversalHelper(this.rootNode, nodes);
        /*class Traverse {
            Traverse(Node<E> currentNode) {
                if (currentNode.getLeftChild() != null) {
                    new Traverse(currentNode.getLeftChild());
                }
                nodes.add(currentNode.getData());
                if (currentNode.getRightChild() != null) {
                    new Traverse(currentNode.getRightChild());
                }
            }
        }
        new Traverse(rootNode);*/

        return nodes;
    }

    private void depthFirstSearchInOrderTraversalHelper(Node<E> currentNode, ArrayList<E> nodes) {

        if (currentNode == null) {
            return;
        }

        depthFirstSearchInOrderTraversalHelper(currentNode.getLeftChild(), nodes);
        nodes.add(currentNode.getData());
        depthFirstSearchInOrderTraversalHelper(currentNode.getRightChild(), nodes);
    }

    public ArrayList<E> depthFirstSearchPostOrderTraversal() {
        ArrayList<E> nodes = new ArrayList<>();
        nodes.get(0);

        depthFirstSearchPostOrderTraversalHelper(this.rootNode, nodes);
        /*class Traverse {
            Traverse(Node<E> currentNode) {
                if (currentNode.getLeftChild() != null) {
                    new Traverse(currentNode.getLeftChild());
                }
                if (currentNode.getRightChild() != null) {
                    new Traverse(currentNode.getRightChild());
                }
                nodes.add(currentNode.getData());
            }
        }
        new Traverse(rootNode);*/
        return nodes;
    }

    private void depthFirstSearchPostOrderTraversalHelper(Node<E> currentNode, ArrayList<E> nodes) {

        if (currentNode == null) {
            return;
        }
        depthFirstSearchPostOrderTraversalHelper(currentNode.getLeftChild(), nodes);
        depthFirstSearchPostOrderTraversalHelper(currentNode.getRightChild(), nodes);
        nodes.add(currentNode.getData());
    }

}

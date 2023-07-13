package org.example.trees.binarytree;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
@NoArgsConstructor
public class Node<E> {

    private E data;
    private Node<E> leftChild;
    private Node<E> rightChild;

    public Node(E value) {
        this.data = value;
        this.leftChild = null;
        this.rightChild = null;
    }

}

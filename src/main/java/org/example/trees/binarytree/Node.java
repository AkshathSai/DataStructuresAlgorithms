package org.example.trees.binarytree;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
@NoArgsConstructor
public class Node<T> {

    private T data;
    private Node<T> leftChild;
    private Node<T> rightChild;

    public Node(T value) {
        this.data = value;
        leftChild = null;
        rightChild = null;
    }

}

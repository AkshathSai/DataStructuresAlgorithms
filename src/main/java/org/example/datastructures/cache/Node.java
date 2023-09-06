package org.example.datastructures.cache;

import lombok.Data;

@Data
public class Node<K, V> {

    private K key;
    private V value;
    private Node<K, V> childNode;

    public Node(K key, V value) {
        this.key = key;
        this.value = value;
    }

    @Override
    public String toString() {
        return "[ " + key + ", " + value + " ] ";
    }

}

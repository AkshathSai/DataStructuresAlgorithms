package org.example.datastructures.cache;

public class LRUCache<K , V> {

    private Node<K ,V> node;
    private Node<K, V> childNode;
    private int size;
    private int count = 0;

    public LRUCache(int size) {
        //node = new Node<>();
        this.size = size;
    }

    public void put(K key, V value) {

        if(size == count) {
            //Overwrite the first LRU node
            return;
        }

        if (node == null) {
            node = new Node<>(key, value);
        } else {
            childNode = new Node<>(key, value);
            node.setChildNode(childNode);
        }
        size++;
    }

    public V get(K key) {

        Node<K, V> currentNode = node;

        while (currentNode != null) {
            if (key.equals(currentNode.getKey())) {
                return currentNode.getValue();
            }
            currentNode = currentNode.getChildNode();
        }

        return null;
    }

    @Override
    public String toString() {
        return node.toString() + childNode.toString();
    }

}

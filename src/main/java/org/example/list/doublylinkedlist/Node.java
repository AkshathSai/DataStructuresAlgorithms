package org.example.list.doublylinkedlist;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;

@Getter
@Setter
@Accessors(chain = true)
@NoArgsConstructor
public class Node<E> {

    private Node<E> prev;
    private E data;
    private Node<E> next;

    public Node(E value) {
        this.data = value;
        this.prev = null;
        this.next = null;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[ Previous: ");
        if (prev != null) {
            sb.append(prev.data);
        } else {
            sb.append("null");
        }
        sb.append(" Data value: ").append(data);
        sb.append(" Next: ");
        if (next != null) {
            sb.append(next.data);
        } else {
            sb.append("null");
        }
        sb.append(" ]");
        return sb.toString();
    }

}

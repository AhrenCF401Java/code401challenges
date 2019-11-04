package code401challenges.graph;

import java.util.*;

class Node<E> {
    E value;
    List<Edge<E>> neighbors;

    public Node(E value) {
        this.value = value;
        this.neighbors = new LinkedList<>();
    }
}

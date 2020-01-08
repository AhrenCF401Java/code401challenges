package code401challenges.graph;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Graph<E> {
    Set<Node<E>> nodes;

    public Graph() {
        this.nodes = new HashSet<>();
    }

    public Node<E> add(E value){
        Node<E> newNode = new Node<>(value);
        nodes.add(newNode);
        return newNode;
    }

    public boolean addEdge(Node one, Node<E> two, int weight){
        if (nodes.contains(one) && nodes.contains(two)) {
            one.neighbors.add(new Edge<>(weight,two));
            two.neighbors.add(new Edge<>(weight,one));
            return true;
        }
        return false;
    }

    public Set<Node<E>> getNodes(){
        return nodes;
    }

    public List<Edge<E>> getNeighbors(Node<E> node){
        return node.neighbors;
    };

    public int Size(){
        return nodes.size();
    };
}
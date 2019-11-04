package code401challenges.graph;

import java.util.List;
import java.util.Set;

public class Graph<E> {
    Set<Node<E>> nodes;

    public Graph(Set<Node<E>> nodes) {
        this.nodes = nodes;
    }

    public Node<E> add(E value){
        Node<E> newNode = new Node<>(value);
        nodes.add(newNode);
        return newNode;
    }

    public boolean addEdge(Node<E> one, Node<E> two, int weight){
        if (nodes.contains(one) && nodes.contains(two)) {
            one.neighbors.add(new Edge<>(weight,two));
            two.neighbors.add(new Edge<>(weight,one));
            return true;
        }
        return false;
    }

    public Set<Node<E>> GetNodes(){
        return nodes;
    }

    public List<Edge<E>> GetNeighbors(Node<E> node){
        return node.neighbors;
    };

    public int Size(){
        return nodes.size();
    };
}
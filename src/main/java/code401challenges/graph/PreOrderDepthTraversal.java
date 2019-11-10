package code401challenges.graph;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class PreOrderDepthTraversal {

    public static <T> List<T> preDepth(Graph<T> graph, Node<T> node){
        Set<Node<T>> seen = new HashSet<>();
        List<T> values = new LinkedList<>();

        return preDepth(graph, node, seen, values);
    }

    public static <T> List<T> preDepth(Graph<T> graph, Node<T> node, Set<Node<T>> seen, List<T> values){
        if (node != null) {
            if (seen.add(node)) {
                values.add(node.value);
                List<Edge<T>> neighbs = graph.getNeighbors(node);
                for (Edge neighb : neighbs) {
                    preDepth(graph, neighb.nodePointingTo, seen, values);
                }
            }
        }
        return values;
    }
}

package code401challenges.graph;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class PreOrderDepthTraversal {

    Set<Node> seen = new HashSet<>();

    public Set preDepth(Graph graph, Node node){
        if (node != null) {
            if (seen.add(node)) {
                List<Edge> neighbs = graph.getNeighbors(node);
                for (Edge neighb : neighbs) {
                    preDepth(graph, neighb.nodePointingTo);
                }
            }
        }
        return seen;
    }
}

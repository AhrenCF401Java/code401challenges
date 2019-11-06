package code401challenges.graph;


import java.util.*;

public class BreadthTraverse {


    public Set<Node> traverseBreadth(Graph graph, Node node){
//      add the node to start with to the set
        Set<Node> toReturn = new HashSet<>();
        if(node != null) {
            toReturn.add(node);
            traverse(graph, node, toReturn);
        }
        return toReturn;
    }

    public void traverse(Graph graph, Node node, Set<Node> set) {
//        add the node to the set if it returns true add it to the queue
        if (node != null) {
            List<Edge> neighbs = graph.getNeighbors(node);
            for (Edge neighb: neighbs) {
                set.add(neighb.nodePointingTo);
            }
            for (Edge neighb: neighbs) {
                if(!set.contains(neighb))
                traverse(graph, neighb.nodePointingTo, set);
            }
        }
    }

}
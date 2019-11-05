package code401challenges.graph;

import java.util.Collections;
import java.util.HashSet;
import java.util.Queue;
import java.util.Set;

public class BreadthTraverse {
    public Set<Node> traverseBreadth(Graph graph, Node node){
//        add the node to start with to the set
        Set<Node> toReturn = new HashSet<>();
        return traverse(graph,node,toReturn);
    }

    public Set<Node> traverse(Graph graph, Node node, Set<Node> set){
//        add the node to the set if it returns true add it to the queue
        if(set.add(node)){

        }

    }

}
package code401challenges.graph;


import java.util.*;

public class BreadthTraverse {

    private static Queue<Node> nextNode = new LinkedList<>();
    public static String traverseBreadth(Graph graph, Node node){
//      add the node to start with to the set

//        does not return in order seen as hash sets are not ordered.
        Set<Node> seen = new LinkedHashSet<>();
        seen.add(node);
        nextNode.add(node);
        traverse(graph, nextNode.remove(), seen);
        StringBuilder str = new StringBuilder();
        for (Node val : seen) {
            System.out.println(val.value);
            str.append(val.value + ", ");
        }
        str.replace(str.length()-2,str.length(),"");
        return str.toString();
    }

    private static void traverse(Graph graph, Node node, Set<Node> set) {
//        add the node to the set if it returns true add it to the queue
        if (node != null) {
            List<Edge> neighbs = graph.getNeighbors(node);
            for (Edge neighb : neighbs) {

                if (set.add(neighb.nodePointingTo)){
                    nextNode.add(neighb.nodePointingTo);
                }
            }
            if (!nextNode.isEmpty()) {
//                System.out.println(nextNode.peek().value.toString());
//                System.out.println(nextNode.peek().value);
                traverse(graph, nextNode.remove(), set);
            }
            return;
        }
    }


        public static void main (String[]args){
            Graph<String> testGraph = new Graph<>();
            Node<String> Pandora = testGraph.add("Pandora");
            Node<String> Metroville = testGraph.add("Metroville");
            Node<String> Arendelle = testGraph.add("Arendelle");
            Node<String> Monstropolis = testGraph.add("Monstropolis");
            Node<String> Naboo = testGraph.add("Naboo");
            Node<String> Narnia = testGraph.add("Narnia");
            testGraph.addEdge(Pandora, Arendelle, 150);
            testGraph.addEdge(Pandora, Metroville, 82);
            testGraph.addEdge(Metroville, Arendelle, 99);
            testGraph.addEdge(Metroville, Monstropolis, 105);
            testGraph.addEdge(Metroville, Narnia, 37);
            testGraph.addEdge(Metroville, Naboo, 26);
            testGraph.addEdge(Monstropolis, Naboo, 73);
            testGraph.addEdge(Narnia, Naboo, 250);

            traverseBreadth(testGraph, Monstropolis);
        }

    }

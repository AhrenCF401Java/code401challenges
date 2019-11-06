package code401challenges.graph;

import org.junit.Before;
import org.junit.Test;

import java.util.LinkedList;

import static org.junit.Assert.*;

public class GetEdgesTest {
    Graph<Node<String>> testGraph;


    @Test
    public void possibleTripTest() {
        testGraph = new Graph<>();
        Node Pandora = testGraph.add(new Node("Pandora"));
        Node Metroville = testGraph.add(new Node("Metroville"));
        Node Arendelle = testGraph.add(new Node("Arendelle"));
        Node Monstropolis = testGraph.add(new Node("Monstropolis"));
        Node Naboo = testGraph.add(new Node("Naboo"));
        Node Narnia = testGraph.add(new Node("Narnia"));
        testGraph.addEdge(Pandora,Arendelle,150);
        testGraph.addEdge(Pandora,Metroville,82);
        testGraph.addEdge(Metroville,Arendelle,99);
        testGraph.addEdge(Metroville,Monstropolis,105);
        testGraph.addEdge(Metroville,Narnia,37);
        testGraph.addEdge(Metroville,Naboo,26);
        testGraph.addEdge(Monstropolis,Naboo,73);
        testGraph.addEdge(Narnia,Naboo,250);
        Node[] test1 = {Metroville, Pandora};
        Node[] test2 = {Arendelle, Monstropolis, Naboo};
        Node[] test3 = {Naboo, Pandora};
        Node[] test4 = {Narnia, Arendelle, Naboo};
        assertEquals( "True, $82", GetEdges.possibleTrip(testGraph, test1));

    }
}
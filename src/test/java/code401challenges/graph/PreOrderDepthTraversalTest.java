package code401challenges.graph;

import org.junit.Before;
import org.junit.Test;

import java.util.LinkedList;
import java.util.List;

import static org.junit.Assert.*;

public class PreOrderDepthTraversalTest {
    @Test
    public void preDepthTest() {
        Graph<String>testGraph = new Graph<>();
        Node Pandora = testGraph.add("Pandora");
        Node Metroville = testGraph.add("Metroville");
        Node Arendelle = testGraph.add("Arendelle");
        Node Monstropolis = testGraph.add("Monstropolis");
        Node Naboo = testGraph.add("Naboo");
        Node Narnia = testGraph.add("Narnia");
        testGraph.addEdge(Pandora,Arendelle,150);
        testGraph.addEdge(Arendelle,Naboo,82);
        testGraph.addEdge(Arendelle,Narnia,99);
        testGraph.addEdge(Pandora,Monstropolis,105);
        testGraph.addEdge(Monstropolis,Metroville,73);


        List<String> places = PreOrderDepthTraversal.preDepth(testGraph, Pandora);
        List<String> expectedPlaces = new LinkedList<>();
        expectedPlaces.add("Pandroa");
        expectedPlaces.add("Arendelle");
        expectedPlaces.add("Naboo");
        expectedPlaces.add("Narnia");
        expectedPlaces.add("Monstropolis");
        expectedPlaces.add("Metroville");
        assertEquals(expectedPlaces,places);

    }
    @Test
    public void preDepthTest2() {
        Graph<String>testGraph = new Graph<>();
        Node Pandora = testGraph.add("Pandora");
        Node Metroville = testGraph.add("Metroville");
        Node Arendelle = testGraph.add("Arendelle");
        Node Monstropolis = testGraph.add("Monstropolis");
        Node Naboo = testGraph.add("Naboo");
        Node Narnia = testGraph.add("Narnia");
        testGraph.addEdge(Pandora,Arendelle,150);
        testGraph.addEdge(Pandora, Naboo,82);
        testGraph.addEdge(Arendelle,Narnia,99);
        testGraph.addEdge(Pandora,Monstropolis,105);
        testGraph.addEdge(Monstropolis,Metroville,73);


        List<String> places = PreOrderDepthTraversal.preDepth(testGraph, Pandora);
        List<String> expectedPlaces = new LinkedList<>();
        expectedPlaces.add("Pandora");
        expectedPlaces.add("Arendelle");
        expectedPlaces.add("Narnia");
        expectedPlaces.add("Naboo");
        expectedPlaces.add("Monstropolis");
        expectedPlaces.add("Metroville");

        assertEquals(expectedPlaces,places);

    }
}
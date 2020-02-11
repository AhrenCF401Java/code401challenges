package code401challenges.graph;

import org.junit.Before;
import org.junit.Test;

import java.util.LinkedHashSet;
import java.util.Set;

import static org.junit.Assert.*;

public class BreadthTraverseTest {
    Graph<String> testGraph;

    @Test
    public void traverseBreadthTest() {
        testGraph = new Graph<>();
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

        assertEquals("Metroville, Pandora, Arendelle, Monstropolis, Narnia, Naboo",BreadthTraverse.traverseBreadth(testGraph,Metroville));
        assertEquals("Monstropolis, Metroville, Pandora, Arendelle, Monstropolis, Narnia, Naboo",BreadthTraverse.traverseBreadth(testGraph,Monstropolis));



    }

    @Test
    public void traverseTest() {
    }
}
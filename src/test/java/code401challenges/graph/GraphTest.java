package code401challenges.graph;

import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.Array;
import java.util.*;

import static org.junit.Assert.*;

public class GraphTest {
    Graph<Integer> testGraph;

    @Before
    public void setup(){
        testGraph = new Graph<>();
    }

    @Test
    public void addTest() {
        Node<Integer> testNode = testGraph.add(9);
        Node<Integer> testNode2 = new Node<>(10);
        assertTrue(testGraph.nodes.contains(testNode));
        assertFalse(testGraph.nodes.contains(testNode2));
    }

    @Test
    public void addEdgeTest() {
        Node<Integer> testNode = testGraph.add(9);
        Node<Integer> testNode2 = testGraph.add(10);
        Node<Integer> testNode3 = testGraph.add(12);
        testGraph.addEdge(testNode, testNode2, 20);
        System.out.println(testNode.neighbors);

        assertTrue(testNode.neighbors.iterator().next().nodePointingTo == testNode2);
        assertTrue(testNode2.neighbors.iterator().next().nodePointingTo == testNode);

    }

    @Test
    public void getNodesTest() {
        Node<Integer> testNode = testGraph.add(9);
        Node<Integer> testNode2 = testGraph.add(10);
        Node<Integer> testNode3 = testGraph.add(12);
        Set<Node> testArr = new HashSet<>();
        testArr.add(testNode);
        testArr.add(testNode2);
        testArr.add(testNode3);
        assertEquals( testArr, testGraph.getNodes());
    }

    @Test
    public void getNeighborsTest() {
        Node<Integer> testNode = testGraph.add(9);
        Node<Integer> testNode2 = testGraph.add(10);
        Node<Integer> testNode3 = testGraph.add(12);
        List<Edge<Integer>> testList = new LinkedList<>();

        assertEquals(testList,testGraph.getNeighbors(testNode));
        testGraph.addEdge(testNode, testNode2, 20);
        testGraph.addEdge(testNode,testNode3,10);
        for (Edge<Integer> edge: testNode.neighbors)
              {
            System.out.println(testNode.neighbors.iterator().next());
            testList.add(edge);
        }
        assertEquals( testList, testGraph.getNeighbors(testNode));
    }

    @Test
    public void sizeTest() {
        assertEquals(0,testGraph.Size());
        Node<Integer> testNode = testGraph.add(9);
        Node<Integer> testNode2 = testGraph.add(10);
        Node<Integer> testNode3 = testGraph.add(12);
        assertEquals(3,testGraph.Size());
    }
}
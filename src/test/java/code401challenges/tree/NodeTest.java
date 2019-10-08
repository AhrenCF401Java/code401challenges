package code401challenges.tree;

import org.junit.Test;

import static org.junit.Assert.*;

public class NodeTest {
    Node testNode = new Node(7);
    Node left = new Node(3);
    Node right = new Node(2);

    @Test
    public void getValue() {
        assertEquals(7,testNode.getValue());
    }


    @Test
    public void getLeft() {
        assertEquals(null,testNode.getLeft());
    }

    @Test
    public void getRight() {
        assertEquals(null,testNode.getRight());
    }
}
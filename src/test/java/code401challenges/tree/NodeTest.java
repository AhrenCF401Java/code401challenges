package code401challenges.tree;

import org.junit.Test;

import static org.junit.Assert.*;

public class NodeTest {
    Node testNode = new Node(7);

    @Test
    public void getValue() {
        assertEquals(7,testNode.getValue());
    }


    @Test
    public void getLeft() {
        assertEquals(null,testNode.getLeft());
    }

    @Test
    public void setLeft() {
        assertEquals(testNode.setLeft(new Node(5)));
    }

    @Test  
    public void getRight() {
        assertEquals(null,testNode.getRight());
    }

    @Test
    public void setRight() {
    }
}
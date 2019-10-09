package code401challenges.tree;

import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.Array;

import static org.junit.Assert.*;

public class TreeTest {
    Tree<Integer> tree;

    @Before
    public void setup(){
        Node<Integer> rootNode = new Node<>(1,
                new Node<Integer>( 5, new Node<Integer>( 6), new Node<Integer>( 10)),
                new Node<Integer>( 4, new Node<Integer>( 3), new Node<Integer>( 7)));
        tree = new Tree(rootNode);

    }

    @Test
    public void preOrder() {
        assertArrayEquals(new Integer[]{1,5,6,10,4,3,7},
                tree.preOrder().toArray());
    }

    @Test
    public void postOrder() {
    }

    @Test
    public void inOrder() {
    }
}
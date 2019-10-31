package code401challenges;

import code401challenges.tree.Node;
import code401challenges.tree.Tree;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

import static org.junit.Assert.*;

public class TreeIntersectTest {
    ArrayList<Integer> answer;
    ArrayList<Integer> expected;
    Tree<Integer> treeOne;
    Node<Integer> rootNode1;
    Tree<Integer> treeTwo;
    Node<Integer> rootNode2;


    @Before
    public void setup() {
        treeOne = new Tree<>(rootNode1);
        rootNode1 = new Node<Integer>(150,
                new Node<Integer>(100, new Node<Integer>(75),
                        new Node<Integer>(160, new Node<Integer>(125), new Node<Integer>(175))),
                new Node<Integer>(250,
                        new Node<Integer>(200),
                        new Node<Integer>(350, new Node<Integer>(300), new Node<Integer>(500))));


        treeTwo = new Tree<>(rootNode2);

        rootNode2 = new Node<Integer>(42, new Node<Integer>(100,
//                       left                         right
                        new Node<Integer>(15), new Node<Integer>(160,
//                                                   left                 right
                        new Node<Integer>(125), new Node<Integer>(175))),
//
//                                    right of root
                new Node<Integer>(600,
//                               left                        Right
                        new Node<Integer>(200), new Node<Integer>(350,
//                                                    left                      right
                        new Node<Integer>(4), new Node<Integer>(500))));



    }

    @Test
    public void sameValsTest() {
        TreeIntersect treeIntersect = new TreeIntersect();
        answer = treeIntersect.sameVals(treeOne,treeOne);
        expected = new ArrayList<>();
        Collections.addAll(expected,100,160,125,175,200,350,500);
        assertEquals(expected,answer);

    }
}
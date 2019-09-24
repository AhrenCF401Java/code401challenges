package code401challenges.linkedlist;

import org.checkerframework.common.value.qual.StaticallyExecutable;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class LinkedListTest {

    LinkedList test;
    @Before
    public void setup() {
        test = new LinkedList();
        test.prepend(3);
        test.prepend(5);
        test.prepend(7);
        test.prepend(9);
        test.prepend(10);
    }

    @Test
    public void linkedListTest() {
        LinkedList list = new LinkedList();
        assertNull(list.head);
    }



//    2.Can properly insert into the linked list
    @Test
    public void prependTest() {
        LinkedList test = new LinkedList();
        test.prepend(7);
        int actual = test.head.value;
//        check if head is pointing to node with value of 7
       assertEquals(7, actual);
    }



//    3.The head property will properly point to the first node in the linked list
//    @Test
//    public void



//    4.Can properly insert multiple nodes into the linked list
    @Test
    public void propPrepend() {
        Node current = test.head;
        int nodeCount=0;
        for(int i=0;i<5;i++){
            nodeCount++;
            current = current.next;
        }
        assertEquals( 5, nodeCount);
    }



//    5.Will return true when finding a value within the linked list that exists
    @Test
    public void includesTest(){
        LinkedList test = new LinkedList();
        Node current = test.head;
        assertTrue(test.includes(9) == true);
    }



//    6.Will return false when searching for a value in the linked list that does not exist
    @Test
    public void notIncludesTest(){
        Node current = test.head;
        assertTrue(test.includes(4) == false);
    }



//    7.Can properly return a collection of all the values that exist in the linked list
    @Test
    public void testToString() {
        assertEquals("This is all the values in the node from beginning to end\nNode Value = 10\nNode Value = 9\nNode Value = 7\nNode Value = 5\nNode Value = 3",
                test.toString()
        );
    }
}
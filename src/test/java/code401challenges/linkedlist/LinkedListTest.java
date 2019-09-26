package code401challenges.linkedlist;

import org.checkerframework.common.value.qual.StaticallyExecutable;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class LinkedListTest {

    LinkedList test;
    LinkedList testTwo;

    @Before
    public void setup() {
        test = new LinkedList();
        test.prepend(1);
        test.prepend(3);
        test.prepend(5);
        test.prepend(7);
        test.prepend(9);

        testTwo = new LinkedList();
        testTwo.prepend(2);
        testTwo.prepend(4);
        testTwo.prepend(6);
        testTwo.prepend(8);
        testTwo.prepend(10);

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
    @Test
    public void rightFirstNodeTest(){
            Node firstNode = test.head;
        assertTrue(test.head.value == 10
        );
    }



//    4.Can properly insert multiple nodes into the linked list
//    tests to see if the right number of nodes were made
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


//    checks to see if the correct value is being inserted at the end of the list.
    @Test
    public void appendTest(){
//        check to see if the to string method can see the new node at the end of the list\
        test.append(1);
        assertEquals("This is all the values in the node from beginning to end\nNode Value = 10\nNode Value = 9\nNode Value = 7\nNode Value = 5\nNode Value = 3\nNode Value = 1",
                test.toString());
    }



    @Test
    public void insertBeforeTest(){
        test.insertBefore(7,6);
        assertEquals("This is all the values in the node from beginning to end\nNode Value = 10\nNode Value = 9\nNode Value = 6\nNode Value = 7\nNode Value = 5\nNode Value = 3",
                test.toString());
    }



    @Test
    public void insertAfterTest(){
        test.insertAfter(7,6);
        assertEquals("This is all the values in the node from beginning to end\nNode Value = 10\nNode Value = 9\nNode Value = 7\nNode Value = 6\nNode Value = 5\nNode Value = 3",
                test.toString());
    }

    @Test
    public void kthvalTest(){
        assertEquals(
                7,
                test.kthFromTheLast(3)
        );

    }

    @Test
    public void mergeSameLengthTest(){
        LinkedList.mergeLists(test,testTwo);
        assertEquals(
                "This is all the values in the node from beginning to end\nNode Value = 1\nNode Value = 2\nNode Value = 3\nNode Value = 4\nNode Value = 5\nNode Value = 6\nNode Value = 7\nNode Value = 8\nNode Value = 9\nNode Value = 10",
                test.toString()
        );
    }

    @Test
    public void mergeLongerListOneLengthTest(){
        test.prepend(11);
        test.prepend(12);
        LinkedList.mergeLists(test,testTwo);
        assertEquals(
                "This is all the values in the node from beginning to end\nNode Value = 1\nNode Value = 2\nNode Value = 3\nNode Value = 4\nNode Value = 5\nNode Value = 6\nNode Value = 7\nNode Value = 8\nNode Value = 9\nNode Value = 10",
                test.toString()
        );

    }

    @Test
    public void mergeLongerListTwoLengthTest(){
        testTwo.prepend(11);
        testTwo.prepend(12);
        LinkedList.mergeLists(test,testTwo);
        assertEquals(
                "This is all the values in the node from beginning to end\nNode Value = 1\nNode Value = 2\nNode Value = 3\nNode Value = 4\nNode Value = 5\nNode Value = 6\nNode Value = 7\nNode Value = 8\nNode Value = 9\nNode Value = 10",
                test.toString()
        );

    }

//    https://www.baeldung.com/junit-assert-exception
    @Test (expected = NullPointerException.class)
    public void whenExceptionThrown_thenExpectationSatisfied() {
        test.prepend(3);
        test.kthFromTheLast(20);
    }


}
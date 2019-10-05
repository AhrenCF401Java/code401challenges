package code401challenges.stacksandqueues;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class QueueTest {
    Queue test;
    @Before
    public void setup(){
        test = new Queue();
        test.enqueue(1);
        test.enqueue(2);
        test.enqueue(3);
        test.enqueue(4);
        test.enqueue(5);
    }

    @Test
    public void size(){
        assertEquals(5,test.size());
    }

//this worsk and throws  null if i add anymore
    @Test
    public void dequeue(){
        assertEquals( 1, test.dequeue());
        assertEquals( 2, test.dequeue());
        assertEquals( 3, test.dequeue());
        assertEquals( 4, test.dequeue());
        assertEquals( 5, test.dequeue());
    }
//not sure how to test this
    @Test
    public void peek(){
        assertEquals( 1, test.peek());
    }


}
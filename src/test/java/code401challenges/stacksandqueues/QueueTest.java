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


    @Test
    public void dequeue(){
    }

    public void peek(){
    }


}
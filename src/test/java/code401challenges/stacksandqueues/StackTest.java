package code401challenges.stacksandqueues;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StackTest {
    Stack test;
    @Before
    public void setup() {
        test = new Stack();
        test.push(1);
        test.push(2);
        test.push(3);
        test.push(4);
        test.push(5);
    }
    @Test
    public void push() {
        test = new Stack();
        test.push(6);
        assertEquals(6, test.top.value);
    }

    @Test
    public void pop() {
        test.pop();
        assertEquals(
                4,
                test.pop()
        );
    }

    @Test
    public void peek() {
        assertEquals(
                5,
                test.peek()
        );
    }
}

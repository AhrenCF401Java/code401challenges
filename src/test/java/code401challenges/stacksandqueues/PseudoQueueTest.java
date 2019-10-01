package code401challenges.stacksandqueues;

import org.junit.Test;

import static org.junit.Assert.*;

public class PseudoQueueTest {
    @Test
    public void enQ() {
        PseudoQueue testQ = new PseudoQueue();
        testQ.enQ(1);
        assertEquals(1,
                testQ.enQstack.top.value
        );
    }

    @Test
    public void dQ() {
    }
}
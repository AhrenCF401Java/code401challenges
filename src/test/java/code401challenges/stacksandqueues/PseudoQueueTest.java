package code401challenges.stacksandqueues;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PseudoQueueTest {
    PseudoQueue testQ;
    @Before
    public void setup(){
        testQ = new PseudoQueue();
        testQ.enQ(0);
        testQ.enQ(1);
        testQ.enQ(2);
        testQ.enQ(3);

    }
    @Test
    public void enQ() {

        testQ.enQ(4);

        assertEquals(4,
                testQ.enQstack.top.value
        );
    }

    @Test
    public void dQ() {
        assertEquals(
                0,
                testQ.dQ()
        );
    }
}
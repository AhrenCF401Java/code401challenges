package code401challenges.Hashtable;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class HashtableTest {
    Hashtable testTable;
    @Before
    public void setup(){
        testTable = new Hashtable();
        testTable.add("pig","pig");
        testTable.add("pig2","bacon");
        testTable.add("cow","cow");
        testTable.add("cow2","beef");
    }

    @Test
    public void hashItTest() {
        assertEquals( 8, testTable.hashIt("onk"));
    }

    @Test
    public void get() {
        assertEquals("pig",testTable.get("pig"));
    }

    @Test
    public void contains() {
        assertEquals(true, testTable.contains("pig"));
    }
}
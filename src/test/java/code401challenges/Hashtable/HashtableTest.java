package code401challenges.Hashtable;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class HashtableTest {
    Hashtable testTable;
    @Before
    public void setup(){
        testTable = new Hashtable();
        testTable.add("1","pig");
        testTable.add("2","bacon");
        testTable.add("3","cow");
        testTable.add("4","beef");
    }

    @Test
    public void hashItTest() {
        assertEquals( 1, testTable.hashIt("1"));
    }

    @Test
    public void add() {
    }

    @Test
    public void get() {
    }

    @Test
    public void contains() {
    }
}
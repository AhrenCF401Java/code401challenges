package code401challenges;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class InsertionSortTest {
    @Before
    public void setup() {

    }
    @Test
    public void insertTest(){
        int[] testarr = {3,5,2,4,1,7,6};
        int[] answer = {1,2,3,4,5,6,7};
        assertArrayEquals(answer,
        InsertionSort.insertSort(testarr));
    }
}

package code401challenges;

import org.junit.Test;

import static code401challenges.MergeSort.mergeSort;
import static org.junit.Assert.*;

public class MergeSortTest {

    @Test
    public void mergeSortTest() {
        int[] test= {1,3,2,5,8,5,6,7,4};
        int[] ans = {1,2,3,4,5,5,6,7,8};
        assertArrayEquals(ans, mergeSort(test));
    }
    @Test
    public void mergeSortTest2() {
        int[] test= {3,1};
        int[] ans = {1,3};
        assertArrayEquals(ans, mergeSort(test));
    }
    @Test
    public void mergeSortTest3() {
        int[] test= {1,3,2,5,8,5,6,7,4,2};
        int[] ans = {1,2,2,3,4,5,5,6,7,8};
        assertArrayEquals(ans, mergeSort(test));
    }

}
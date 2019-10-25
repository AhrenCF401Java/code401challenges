package code401challenges;

import org.junit.Test;

import java.util.Arrays;

import static code401challenges.QuickSort.*;
import static org.junit.Assert.*;

public class QuickSortTest {

    @Test
    public void quickSortTest() {
        int[] test = {4,5,1,6,7,4,2,9,3,6};
        int[] ans = {1,2,3,4,4,5,6,6,7,9};
        System.out.println(Arrays.toString(quickSort(test, 0, test.length-1)));
        assertArrayEquals(ans, quickSort(test, 0, test.length-1));
    }

    @Test
    public void partitionTest() {
    }

    @Test
    public void swapTest() {
    }
}
package code401challenges;

import org.junit.Test;

import static code401challenges.Merge.merge;
import static org.junit.Assert.*;

public class MergeTest {
    int[] b = {1,3,6,8};
    int[] a = {2,3,4,5,7};
    @Test
    public void mergeTest() {
        int[]ans= {1,2,3,3,4,5,6,7,8};
        assertArrayEquals( ans, merge(a,b)
        );
    }
}
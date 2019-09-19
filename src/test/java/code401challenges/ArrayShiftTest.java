package code401challenges;

import org.junit.Test;
import static org.junit.Assert.*;

public class ArrayShiftTest {
    @Test
    public void testShiftArray(){
        int[] rightAnswer = {1,2,3,4};
//        should return a new arr [1,2,3,4]
//        assertEquals takes 3 args: human-readable message, expected answer, actual answer
        assertArrayEquals(
                "new array should look like this",
                rightAnswer,
                ArrayShift.shiftArray(new int[]{1,2,4}, 3 )
        );

    }
}



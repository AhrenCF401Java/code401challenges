package code401challenges;

import org.junit.Test;

import static code401challenges.MultiBracketValidation.multiBracketValidation;
import static org.junit.Assert.*;

public class MultiBracketValidationTest {
    String test1 = "{}()[]";
    String test2 = "{{{{[[[[]]]]}}}}";
    String ftest1 = "()}";
    String ftest2 = "](())";
    String ftest3 = "()()(}{}{]";
    String ftest4 = "(";

    @Test
    public void multiBracketValidationTest(){
        assertTrue(multiBracketValidation(test1));
        assertTrue(multiBracketValidation(test2));
    }

    @Test
    public void multiBracketValidationFailTest1(){
        assertFalse(multiBracketValidation(ftest1));
        assertFalse(multiBracketValidation(ftest2));
        assertFalse(multiBracketValidation(ftest3));
    }


}
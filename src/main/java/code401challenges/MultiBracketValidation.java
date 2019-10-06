package code401challenges;

import org.apache.commons.math3.exception.NullArgumentException;

import java.util.Stack;

public class MultiBracketValidation {
    public static boolean multiBracketValidation(String s) {
        //set a placeholder for the current string
        String curChar = null;
        if (s == null) {
            throw new NullArgumentException();
        }
//       create stacks for
        Stack<String> lBrackets = new Stack<>();

// ********************* how could i do this recursively?****************************
        for (int i = 0; i < s.length(); i++) {
//            take in the current char and convert it to string
            curChar = String.valueOf(s.charAt(i));
//            Check if the first bracket is a right side bracket return false if it is.
            if (curChar.equals("}") && lBrackets.empty() ||
                    curChar.equals("]") && lBrackets.empty() ||
                    curChar.equals(")") && lBrackets.empty()) {
                return false;
            }
//            Now that brackets may be matching push all brackets into their respective stack
            if (curChar.equals("[") || curChar.equals("{") || curChar.equals("(")) {
                lBrackets.push(curChar);
//                If current character makes a set of brackets with the top of the stack pop and continue
            } else if (curChar.equals(")") && lBrackets.peek() == "(") {
                lBrackets.pop();
            }
        }
        return true;
    }
}




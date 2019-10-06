package code401challenges;

import org.apache.commons.math3.exception.NullArgumentException;

import java.util.Stack;

public class MultiBracketValidation {
    public static boolean multiBracketValidation(String s){
        //set a placeholder for the current string
        String curChar = null;
        if(s == null){throw new NullArgumentException();}
//       create stacks for
        Stack<String> lBrackets= new Stack<>();
        Stack<String> rBrackets= new Stack<>();

// ********************* how could i do this recursively?****************************
        for(int i = 0; i < s.length(); i++) {
//            take in the current char and convert it to string
            curChar = String.valueOf(s.charAt(i));
//            Check if the first bracket is a right side bracket return false if it is.
            if (curChar.equals("}") && lBrackets.empty() ||
                    curChar.equals("]") && lBrackets.empty() ||
                    curChar.equals(")") && lBrackets.empty()) {
                return false;
            }
//            Now that brackets may be matching push all brackets into their respective stack
            if (curChar.equals("[") || curChar.equals("{") || curChar.equals("(")){
                lBrackets.push(curChar);
            }else if(curChar.equals("}") || curChar.equals("]") || curChar.equals(")")) {
                rBrackets.push(curChar);
            }
        }
//        Check the stacks against each other if they are the same size and not empty else return false
        while (!lBrackets.empty() && !rBrackets.empty() && lBrackets.size() == rBrackets.size()){
            System.out.println(lBrackets.peek());
            System.out.println(rBrackets.peek());
            if((lBrackets.peek().equals("[") && rBrackets.peek().equals("]")) ||
                    (lBrackets.peek().equals("{") && rBrackets.peek().equals("}")) ||
                    (lBrackets.peek().equals("(") && rBrackets.peek().equals(")"))){
                lBrackets.pop();
                rBrackets.pop();

                if(lBrackets.empty() && rBrackets.empty()){
                    return true;
                }
            }else {return false;}
        }

        return false;
    }
}

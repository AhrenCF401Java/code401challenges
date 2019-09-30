package code401challenges.stacksandqueues;

import java.io.IOException;
import java.util.EmptyStackException;

public class Stack {
    Node top;

    public Stack(){
        this.top = null;
    }

    public void push(int value){
        this.top = new Node(value, this.top);
    }

    public int pop() throws EmptyStackException {
//        if stack is empty throw error
        if(this.top == null){
           throw new EmptyStackException();
        }
//        Temp pointer
        Node cur = this.top;
//        reassign top to top.next
        this.top = top.next;
//        return our temp which is the old top
        return cur.value;


    }
}

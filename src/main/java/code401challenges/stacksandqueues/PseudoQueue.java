package code401challenges.stacksandqueues;

import java.util.NoSuchElementException;

public class PseudoQueue {
    Stack enQstack;
    Stack dQstack;

    public PseudoQueue() {
       enQstack = new Stack();
       dQstack = new Stack();
    }


    //considerded constructor would like to tal about the reasons why why not
    public void enQ(int value) {
        enQstack.push(value);
    }


    public int dQ() throws NoSuchElementException {
        if (dQstack.top == null && enQstack.top == null) {
            throw new NoSuchElementException();
        } else if (dQstack.top == null) {
//  peek push into new dQstack until enQstack.top.next == null
//  then pop the node whose next is null
            while (enQstack.top != null) {
                dQstack.push(enQstack.pop());
            }
        }
        return dQstack.pop();
    }
}
package code401challenges.stacksandqueues;

import java.util.NoSuchElementException;

public class PseudoQueue {
    Stack enQstack;
    Stack dQstack;

    //considerded constructor would like to tal about the reasons why why not
    public void enQ(int value) {
        enQstack.push(value);
    }


    public void dQ() throws NoSuchElementException {
        if (dQstack.top == null && enQstack.top == null) {
            throw new NoSuchElementException();
        } else if (dQstack.top == null) {
//  peek push into new dQstack until enQstack.top.next == null
//  then pop the node whose next is null
            Node enQtop = enQstack.peek();
            while (enQstack.top.next != null) {
                dQstack.push(enQstack.pop());
            }
            if (enQtop.next == null) {
//        check if next is null if it is return enQtop.value
                enQstack.pop();
            }
        }
    }
}
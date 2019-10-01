package code401challenges.stacksandqueues;

public class Node {
    Node next;
    int value;

    public Node(int value, Node next) {
        this.next = next;
        this.value = value;
    }
    public Node(int value) {
        this.value = value;
        this.next = null;
    }
}
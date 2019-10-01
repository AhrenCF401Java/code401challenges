package code401challenges.stacksandqueues;
//little help from james via frontRow
public class Queue {
    Node front;
    Node back;

    public void enqueue(int last) {
        if(front == null){
           front = new Node(last);
           back = front;
        } else {
            back = new Node(last);
        }
    }

    public int dequeue(){
        int temp = front.value;
        front = front.next;
        return temp;
    }

    public int peek(){
        return front.value;
    }
}

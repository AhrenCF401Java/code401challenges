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
            back.next = new Node(last);
            back = back.next;
        }
    }

    public int dequeue() throws NullPointerException{
        if(front != null) {
            int temp = front.value;
            front = front.next;
            return temp;
        }
        throw new NullPointerException("Queue Empty");
    }


    public Node peek() throws NullPointerException{
        if(front != null) {
        return front;
        }
        throw new NullPointerException("Queue Empty");
    }


    public int size(){
        int count = 0;
        Node next = front;
        while(next != null){
            count++;
            next = next.next;

        }
        return count;
    }
}

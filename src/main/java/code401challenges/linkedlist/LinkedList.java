package code401challenges.linkedlist;

public class LinkedList {
    //Got help form Jessica comments are my notes to show understanding
    //declares head will be Node type does not instantiate
    Node head;

    //constructor for new linked list
    LinkedList (){
        this.head = null;
    }



    //prepends doesnt really insert so changed method name
    public void prepend(int value){
        //call constructor for node and sets value
        Node newHead = new Node(value);
        //Sets this.Head instance to what this.head currently equals
        newHead.next = this.head;
        //Sets this.head to value of newHead
        this.head = newHead;
    }



    public boolean includes(int value){
    //get next and check if value matches node value
        Node current = this.head;
        while(current != null) {
            if (current.value == value) {
                return true;
            }
            current = current.next;
        }
        return false;
    }
//    Define a method called toString which takes in no arguments and returns a string representing
//    all the values in the Linked List.
    //overrides parent classes and allows it to print to string

    @Override
    public String toString(){
        StringBuilder allValues = new StringBuilder("This is all the values in the node from beginning to end");
//        set the start node
        Node current = this.head;
//        iterate through the List
        while(current != null){
            allValues.append("\nNode Value = " + current.value);
            current = current.next;
        }
        return allValues.toString();
    }



    public void append(int value){

    }



    public void insertBefore(int value,int newVal){

    }



    public void insertAfter(int value,int newVal) {

    }
}

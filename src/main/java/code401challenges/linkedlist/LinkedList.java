package code401challenges.linkedlist;

public class LinkedList {
    //Got help form Jessica comments are my notes to show understanding
    //declares head will be Node type does not instantiate
    Node head;
    //constructor for new linked list
    LinkedList () {this.head = null;}



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
//        check to make sure the list has stuff in it
        if(head == null || head.next == null){
            System.out.println("Sad eagle screams in sorrow :( the action is not possible.");
        }else if(head.value == value){
            prepend(newVal);
        }
        else{
//       Track node current and next looking for the right place to insert
//            instantiate here as prepend will make a new node and place at beginning if it is called
            Node newNode = new Node(newVal);

            Node prevNode = head;
            Node currNode = prevNode.next;

            while (currNode != null && currNode.value != value){
                prevNode = prevNode.next;
                currNode = currNode.next;
            }
            if(currNode == null){
                System.out.println("Sad eagle screams in sorrow :( the action is not possible.");
            }else{
                newNode.next = currNode;
                prevNode.next = newNode;
            }
        }
    }



    public void insertAfter(int value,int newVal) {
//       create a new node to insert
        Node newNode = new Node(newVal);
//        check to make sure the list has stuff in it
        if(head == null || head.next == null){
            System.out.println("Sad eagle screams in sorrow :( the action is not possible.");
        }
        else{
//            Track
            Node currNode = head;
            Node nextNode =currNode.next;
            while (nextNode != null && currNode.value != value){
                currNode = currNode.next;
                nextNode = nextNode.next;
            }
            if(nextNode == null){
                System.out.println("Sad eagle screams in sorrow :( the action is not possible.");
            }else{

                newNode.next = nextNode;
                currNode.next = newNode;
            }
        }
    }



    public int size(){
         int size = 0;
         Node currNode = this.head;
         while(currNode != null){
             currNode = currNode.next;
             size++;
         }
         return size;
    }



    public int kthFromTheLast(int k){
        int size = this.size();
        if(k > size){
            throw new NullPointerException("Not a valid node index, list size is " + size);
        }
        Node currNode = this.head;
       int stepper = 0;
       while(stepper < k){
           stepper++;
           currNode = currNode.next;
       }
        return currNode.value;
    }



    public static LinkedList mergeLists(LinkedList one, LinkedList two){
        //create variables to hold each nodes. next
        Node cnl1 = one.head;
        Node cnl2 = two.head;
        Node cnl1Next = cnl1.next;
        Node cnl2Next = cnl2.next;

//        check if any of the current next values are null
        if(cnl1Next != null) {cnl1 = one.head.next;}
        if(cnl2Next != null) {cnl2 = two.head.next;}

//         merge lists while next of each node list is not null
        while(cnl1Next != null){
            cnl1.next = cnl2;
            cnl2.next = cnl1Next;
            cnl1Next = cnl1Next.next;
            cnl2Next = cnl2Next.next;
            if(cnl2Next == null){return one;}
        }
//        check if the rest of the nodes from list 2 might be trying to escape and point the last node in list one to the current node in list 2 idf not null
        if(cnl2 != null) {cnl1.next = cnl2;}
        return one;
    }
}

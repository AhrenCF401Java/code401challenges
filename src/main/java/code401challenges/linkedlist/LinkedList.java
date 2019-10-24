package code401challenges.linkedlist;

public class LinkedList {
    //Got help form Jessica comments are my notes to show understanding
    //declares head will be Node type does not instantiate
    Node head;

    //constructor for new linked list
    LinkedList() {
        this.head = null;
    }


    //prepends doesnt really insert so changed method name
    public void prepend(int value) {
        //call constructor for node and sets value
        Node newHead = new Node(value);
        //Sets this.Head instance to what this.head currently equals
        newHead.next = this.head;
        //Sets this.head to value of newHead
        this.head = newHead;
    }


    public boolean includes(int value) {
        //get next and check if value matches node value
        Node current = this.head;
        while (current != null) {
            if (current.value == value) {
                return true;
            }
            current = current.next;
        }
        return false;
    }


    @Override
    public String toString() {
        StringBuilder allValues = new StringBuilder("This is all the values in the node from beginning to end");
//        set the start node
        Node current = this.head;
//        iterate through the List
        while (current != null) {
            allValues.append("\nNode Value = " + current.value);
            current = current.next;
        }
        return allValues.toString();
    }


    public void append(int value) {

    }


    public void insertBefore(int value, int newVal) {
//        check to make sure the list has stuff in it
        if (head == null || head.next == null) {
            System.out.println("Sad eagle screams in sorrow :( the action is not possible.");
        } else if (head.value == value) {
            prepend(newVal);
        } else {
//       Track node current and next looking for the right place to insert
//            instantiate here as prepend will make a new node and place at beginning if it is called
            Node newNode = new Node(newVal);

            Node prevNode = head;
            Node currNode = prevNode.next;

            while (currNode != null && currNode.value != value) {
                prevNode = prevNode.next;
                currNode = currNode.next;
            }
            if (currNode == null) {
                System.out.println("Sad eagle screams in sorrow :( the action is not possible.");
            } else {
                newNode.next = currNode;
                prevNode.next = newNode;
            }
        }
    }


    public void insertAfter(int value, int newVal) {
//       create a new node to insert
        Node newNode = new Node(newVal);
//        check to make sure the list has stuff in it
        if (head == null || head.next == null) {
            System.out.println("Sad eagle screams in sorrow :( the action is not possible.");
        } else {
//            Track
            Node currNode = head;
            Node nextNode = currNode.next;
            while (nextNode != null && currNode.value != value) {
                currNode = currNode.next;
                nextNode = nextNode.next;
            }
            if (nextNode == null) {
                System.out.println("Sad eagle screams in sorrow :( the action is not possible.");
            } else {

                newNode.next = nextNode;
                currNode.next = newNode;
            }
        }
    }


    public int size() {
        int size = 0;
        Node currNode = this.head;
        while (currNode != null) {
            currNode = currNode.next;
            size++;
        }
        return size;
    }


    private int size(Node n) {
        if (n == null) {
            return 0;
        } else {
            return 1 + size(n.next);
        }
    }


    public int kthFromTheLast(int k) {
        int size = this.size();
        if (k > size) {
            throw new NullPointerException("Not a valid node index, list size is " + size);
        }
        Node currNode = this.head;
        int stepper = 0;
        while (stepper < k) {
            stepper++;
            currNode = currNode.next;
        }
        return currNode.value;
    }


    public static Node mergeLists(Node one, Node two) {
        //create variables to hold each nodes. next
//        Michells solution
        if (one == null) {
            System.out.println(two + "if one null return two");
            return two;
        } else {
            one.next =mergeLists(two, one.next);
            return one;
        }
    }
}



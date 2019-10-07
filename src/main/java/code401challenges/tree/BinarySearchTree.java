package code401challenges.tree;
//https://www.baeldung.com/java-binary-tree
public class BinarySearchTree {

    Node root;

    public void add(int value) {
        root = addRecursive(root,value);
    }

    private Node addRecursive(Node current, int value) {
        if (current == null) {
            return new Node(value);
        }
        if (value < current.value){
            current.left = addRecursive(current.left, value);
        } else if (value > current.value){
            current.right = addRecursive(current.right,value);
        } else {
            return current;
        }
        return current;
    }

    private boolean contains(Node current,int value){
        if (current == null){
            return false;
        }
        if (current.value == value){
            return true;
        }
        return value < current.value
                ? contains(current.left, value)
                : contains(current.right, value);

    }

}

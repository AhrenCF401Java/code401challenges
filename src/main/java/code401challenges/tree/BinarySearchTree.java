package code401challenges.tree;
//https://www.baeldung.com/java-binary-tree
public class BinarySearchTree<E extends Comparable<E>> {

    Node<E> root;

    public void add(E value) {
        root = addRecursive(root,value);
    }

    private Node<E> addRecursive(Node<E> current, E value) {
        if (current == null) {
            return new Node(value);
        }
        if (value.compareTo(current.value) < 0){
            current.left = addRecursive(current.left, value);
        } else if (value.compareTo(current.value) > 0){
            current.right = addRecursive(current.right,value);
        } else {
            return current;
        }
        return current;
    }

    private boolean contains(Node<E> current,E value){
        if (current == null){
            return false;
        }
        if (current.value == value){
            return true;
        }
        return (value.compareTo(current.value) < 0)
                ? contains(current.left, value)
                : contains(current.right, value);

    }

}

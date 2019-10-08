package code401challenges.tree;
//https://www.baeldung.com/java-binary-tree
public class Node<E> {
    E value;
    Node<E> left;
    Node<E> right;

    public Node(E value, Node<E> left, Node<E> right){
        this.value = value;
        this.left = left;
        this.right = right;
    }

    public Node(E value){
        this.value = value;
    }

    public E getValue() {
        return value;
    }

    public void setValue(E value) {
        this.value = value;
    }

    public Node<E> getLeft() {
        return left;
    }

    public void setLeft(Node<E> left) {
        this.left = left;
    }

    public Node<E> getRight() {
        return right;
    }

    public void setRight(Node<E> right) {
        this.right = right;
    }
}

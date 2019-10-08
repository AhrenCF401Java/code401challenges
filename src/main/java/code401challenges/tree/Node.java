package code401challenges.tree;
//https://www.baeldung.com/java-binary-tree
public class Node<E> {
    E value;
    E left;
    E right;

    public Node(E value, E left, E right){
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

    public E getLeft() {
        return left;
    }

    public void setLeft(E left) {
        this.left = left;
    }

    public E getRight() {
        return right;
    }

    public void setRight(E right) {
        this.right = right;
    }
}

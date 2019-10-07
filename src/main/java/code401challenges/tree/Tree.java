package code401challenges.tree;
//https://www.baeldung.com/java-binary-tree
public class Tree {

    public void preOrder(Node node){
        if (node != null) {
            System.out.print(" " + node.value);
            preOrder(node.left);
            preOrder(node.right);
        }
    }

    public void postOrder(Node node){
        if(node != null){
            postOrder(node.left);
            postOrder(node.right);
            System.out.println(" " + node.value);
        }
    }

    public void inOrder(Node node){
        if (node != null) {
            inOrder(node.left);
            System.out.print(" " + node.value);
            inOrder(node.right);
        }
    }

}
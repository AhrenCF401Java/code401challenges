package code401challenges.tree;
//https://www.baeldung.com/java-binary-tree
public class Tree<T>{
    Node root;

    public void preOrder(Node node){
        if (node != null) {
            System.out.print(" " + node.value);
            preOrder((Node) node.left);
            preOrder((Node) node.right);
        }
    }

    public void postOrder(Node node){
        if(node != null){
            postOrder((Node) node.left);
            postOrder((Node) node.right);
            System.out.println(" " + node.value);
        }
    }

    public void inOrder(Node node){
        if (node != null) {
            inOrder((Node) node.left);
            System.out.print(" " + node.value);
            inOrder((Node) node.right);
        }
    }

}
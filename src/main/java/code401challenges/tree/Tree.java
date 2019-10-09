package code401challenges.tree;

import java.util.ArrayList;

//https://www.baeldung.com/java-binary-tree
public class Tree<E>{
    Node<E> root;

    public Tree(Node<E> root) {
        this.root = root;
    }

    public Tree(){};

    private ArrayList<E> preOrder(Node<E> cur, ArrayList<E> treeContents){
        if (cur == null) {
            return treeContents;
        }
        treeContents.add(cur.value);
        preOrder(cur.left, treeContents);
        preOrder(cur.right, treeContents);
        return treeContents;
    }

    public ArrayList<E> preOrder(){
        ArrayList<E> treeContents = new ArrayList<>();
        if (this.root != null) {
            preOrder(this.root, treeContents);
        }
        return treeContents;
    }




    public ArrayList postOrder(Node<E> cur, ArrayList<E> treeContents) {
        if (cur == null) {
            return treeContents;
        }
        preOrder(cur.left, treeContents);
        treeContents.add(cur.value);
        preOrder(cur.right, treeContents);
        return treeContents;
    }

    public ArrayList<E> postOrder(){
        ArrayList<E> treeContents = new ArrayList<>();
        if (this.root != null) {
            postOrder(this.root, treeContents);
        }
        return treeContents;
    }



    public ArrayList inOrder(Node<E> cur, ArrayList<E> treeContents) {
        if (cur == null) {
            return treeContents;
        }
        inOrder(cur.left, treeContents);
        treeContents.add(cur.value);
        inOrder(cur.right, treeContents);
        return treeContents;
    }

    public ArrayList<E> inOrder(){
        ArrayList<E> treeContents = new ArrayList<>();
        if (this.root != null) {
            inOrder(this.root, treeContents);
        }
        return treeContents;
    }
}
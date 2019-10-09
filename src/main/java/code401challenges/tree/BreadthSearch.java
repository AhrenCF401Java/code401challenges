package code401challenges.tree;


import java.util.LinkedList;
import java.util.Queue;

public class BreadthSearch {
    Queue<Node> t = new LinkedList();

    private void bTrav(Tree tree) {
        if (tree.root != null) {
            t.add(tree.root);
        }
        while (!t.isEmpty()) {
            Node n = t.remove();
            System.out.println(n.value);
            if (n.left != null) {
                t.add(n.left);
            }
            if (n.right != null) {
                t.add(n.right);
            }
        }
    }
}

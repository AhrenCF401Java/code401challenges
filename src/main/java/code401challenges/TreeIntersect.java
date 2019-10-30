package code401challenges;

import code401challenges.Hashtable.Hashtable;
import code401challenges.tree.Node;
import code401challenges.tree.Tree;

import java.util.ArrayList;

public class TreeIntersect {
    Hashtable treeOneVals = new Hashtable();
    ArrayList<Integer> seenVals = new ArrayList();

    public ArrayList<Integer> sameVals(Tree<Integer> treeOne, Tree<Integer> treeTwo){
        if(treeOne.root != null){
            addToHM(treeOne.root);
        }
        if(treeTwo.root != null){
            checkHM(treeTwo.root);
        }
        return seenVals;
    }

    private void checkHM(Node cur){
        if(cur != null) {
            if (treeOneVals.contains(cur.toString())) {
                seenVals.add((Integer) cur.getValue());
            }
            checkHM(cur.getLeft());
            checkHM(cur.getRight());
        }
    }

    private void addToHM(Node cur){
        if(cur != null){
            treeOneVals.add(cur.getValue().toString(),cur.getValue().toString());
        }
        addToHM(cur.getRight());
        addToHM(cur.getLeft());
    }
}
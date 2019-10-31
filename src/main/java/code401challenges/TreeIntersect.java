package code401challenges;

import code401challenges.Hashtable.Hashtable;
import code401challenges.tree.Node;
import code401challenges.tree.Tree;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class TreeIntersect {
    Set<Integer> treeOneVals = new HashSet<>();
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



    private void addToHM(Node cur){
        if(cur != null){
            treeOneVals.add((Integer) cur.getValue());
            System.out.println(treeOneVals.toString()+"hello");
        }
        addToHM(cur.getRight());
        addToHM(cur.getLeft());
    }



    private void checkHM(Node cur){
        if(cur != null) {
            if (treeOneVals.contains(cur.getValue())) {
                seenVals.add((Integer) cur.getValue());
                System.out.println(seenVals.toString()+"hello");
            }
            checkHM(cur.getLeft());
            checkHM(cur.getRight());
        }
    }
}
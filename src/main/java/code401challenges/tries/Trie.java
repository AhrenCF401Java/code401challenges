package code401challenges.tries;

import java.util.HashMap;
import java.util.Iterator;

public class Trie {
    protected TrieNode root;

    public Trie(){
        root = new TrieNode();
    }

    public void insert(String word){
//        create a hashmap to
        HashMap<Character,TrieNode> children = root.getChildren();
        for(int i = 0; i< word.length(); i++){
//            instantiate but not initialize a TriNode, decide later if it doesnt exist.
            char c = word.charAt(i);
            TrieNode node;
//            see if children has the current char
            if(children.containsKey(c)){
//                if it does set node to the same
                node = children.get(c);
            }else{
//                if it does not contain the char node gets a new Trinode and children gets c and node
//                hashmap acts as the pointer to the next node.
                node = new TrieNode(c);
                children.put(c,node);
            }
//            children gets nodes hashmap.
            children = node.getChildren();

//            set nodes boolean to true if it is the last letter in the word.
            if (i == word.length()-1){
                node.setEndOfWord(true);
            }
        }
    }

    public boolean search(String word){
//        instantiate a Hashmap to hold each nodes hashmap starting with the root
        HashMap<Character,TrieNode> children = root.getChildren();
//        Instantiate a TriNode as null
        TrieNode node = null;
        for (int i = 0; i < word.length(); i++){
            char c = word.charAt(i);
            if(children.containsKey(c)){
//                set node to the next node
                node = children.get(c);
//                then change the hashmap to the next nodes
                children = node.getChildren();
            }else {
//                If no more trinodes, break out
                node = null;
                break;
            }
        }
        if(node != null && node.isEndOfWord()) {
            return true;
        }else {
            return false;
        }
    }


//
    public void printAllNodeValues(TrieNode root){
        if(root != null){
            HashMap<Character,TrieNode> children = root.getChildren();
            Iterator<Character> itr = children.keySet().iterator();
            TrieNode node = null;
            while (itr.hasNext()) {
                char c = itr.next();
                System.out.println(c);
                printAllNodeValues(children.get(c));
            }
        }


    }
}
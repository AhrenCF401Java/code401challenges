package code401challenges.tries;

import java.util.HashMap;

public class TrieNode {
    private char c;
    private HashMap<Character,TrieNode> children = new HashMap<>();
    private boolean isEndOfWord;

    public TrieNode(){}

    public TrieNode(char c){
        this.c = c;
    }

    public HashMap<Character, TrieNode> getChildren() {
        return children;
    }


    public boolean isEndOfWord() {
        return isEndOfWord;
    }

    public void setEndOfWord(boolean isEndOfWord) {
        this.isEndOfWord = isEndOfWord;
    }
}

package code401challenges.tries;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TrieTest {
    Trie testTrie = new Trie();

//    @Before
//    public void setUp(){
//    }

    @Test
    public void insertTest() {
        testTrie.insert("llama");
        testTrie.insert("long");

        System.out.println(testTrie.root.getChildren().toString());

    }

    @Test
    public void search() {
        testTrie.insert("llama");
        testTrie.insert("long");
        assertTrue(testTrie.search("llama"));
    }

    @Test
    public void printAllNodeValues() {
        testTrie.insert("llama");
        testTrie.insert("long");
        testTrie.printAllNodeValues(testTrie.root);
    }
}
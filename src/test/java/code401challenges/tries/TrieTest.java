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
        testTrie.insert("pulley");
        assertFalse(testTrie.search("pull"));
        testTrie.insert("pull");
        assertTrue(testTrie.search("pull"));
    }

    @Test
    public void printAllNodeValues() {
        testTrie.insert("llama");
        testTrie.insert("long");
        testTrie.insert("pulley");
        testTrie.insert("pull");
        testTrie.insert("armory");
        testTrie.printAllNodeValues(testTrie.root);
    }

    @Test
    public void startsWith() {
        testTrie.insert("llama");
        testTrie.insert("long");
        assertTrue(testTrie.startsWith("l"));
        assertFalse(testTrie.startsWith("p"));
    }

}
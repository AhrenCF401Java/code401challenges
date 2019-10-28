package code401challenges.Hashtable;


import java.util.LinkedList;

public class Hashtable {

    public static void main(String[] args){
        Hashtable testTable = new Hashtable();
        System.out.println("cat".hashCode());
        System.out.println("cat".hashCode());
        System.out.println(testTable.hashIt("cat"));
        System.out.println(testTable.hashIt("cat"));

        System.out.println(testTable.toString());
        testTable.add("blah", "test");
        testTable.add("blah", "test");
        testTable.add("3", "monkies");
        testTable.get("monkies");


        System.out.println(testTable.get("3"));
    }

    LinkedList<Item>[]  hashTable = new LinkedList[5];

    public int hashIt(String key ){
       return key.hashCode() % hashTable.length;
    }

    public void add(String key, String value) {
//  add the new item to the array at the hash of the key
        if (hashTable[hashIt(key)] == null) {
            hashTable[hashIt(key)] = new LinkedList<Item>();
        }
            hashTable[hashIt(key)].add(new Item(key, value));
        }

    public LinkedList<Item> get(String key){
        System.out.println(hashIt(key) + "Hash key get");
        return hashTable[hashIt(key)];
    }
    public void contains(String key){

    }
}
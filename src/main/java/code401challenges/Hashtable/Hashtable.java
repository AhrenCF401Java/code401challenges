package code401challenges.Hashtable;


import java.util.LinkedList;

public class Hashtable {
    LinkedList<Item>[] hashTable = new LinkedList[5];

    public int hashIt(String key) {
        Integer hash =0;
       for(int i=0;i<key.length();i++){
          hash = hash + (int)key.charAt(i);
          if(i == key.length()-1){
//              https://www.mkyong.com/java/java-convert-string-to-int/
              System.out.println(hash + "Hash as integer");
              hash = hash % hashTable.length;
           }
        }
       return  hash;
    }


    public void add(String key, String value) {
//  add the new item to the array at the hash of the key
        int i = hashIt(key);
        if ( hashTable[i] == null) {
            hashTable[i] = new LinkedList<Item>();
        }
        if (contains(key)) {
            for (Item item : hashTable[i]) {
                if (item.key.equals(key)) {
                    item.value = value;
                }
            }
        }else{
                hashTable[i].add(new Item(key, value));
            }
}

    public String get(String key) {
        System.out.println(hashIt(key) + " Hash key get");
        for (Item item : hashTable[hashIt(key)]) {
            if (item.key.equals(key))
            {
                return item.value;
            }
        }
        return null;
    }

    public boolean contains(String key){
        for(Item item: hashTable[hashIt(key)]){
            if(item.key.equals(key)){
                return true;
            }
        }
        return false;
    }
}
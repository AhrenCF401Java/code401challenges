package code401challenges;

import code401challenges.Hashtable.Hashtable;

public class RepeatedWord {
    public String dupWords(String txt){
        Hashtable txtTable = new Hashtable();
        for(String word : txt.split(" ")){
            int key = 0;
            String keyString=""+key;
            word.replace("[^a-zA-Z0-9","");
            if (txtTable.contains(word)){
                return word;
            }else{
                txtTable.add(keyString, word);
                key++;
            }
        }
        return null;
    }
}

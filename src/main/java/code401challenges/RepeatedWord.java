package code401challenges;

import code401challenges.Hashtable.Hashtable;

public class RepeatedWord {
    public String dupWords(String txt){
        Hashtable txtTable = new Hashtable();
//        split each
        for(String word : txt.split(" ")){
            word = word.replace("[^a-zA-Z0-9","").toLowerCase();
            if (txtTable.contains(word)){
                return word;
            }else{
                txtTable.add(word, word);
            }
        }
        return null;
    }
}

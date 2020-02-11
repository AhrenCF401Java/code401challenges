package code401challenges;


import com.google.common.io.Resources;

import java.util.Arrays;

public class ArrayReverse{
    
    public static void main(String[]args){
        int[] llama = new int[]{1,2,3,4,5,6};
        llama = reverse(llama);
        System.out.println(Arrays.toString(llama));
    }
    public static int[] reverse(int[] array){
            int[] reverseArray = new int[array.length];
            for(int i = 0; i < array.length; i++){
                reverseArray[i] = array[array.length-1-i];
            }
            return reverseArray;
    }

} 
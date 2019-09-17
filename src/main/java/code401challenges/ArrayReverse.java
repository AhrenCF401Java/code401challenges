import java.util.Arrays;
public class ArrayReverse{
    
    public static void main(String[]args){
        int[] llama = new int[]{1,2,3,4,5,6};
        int[] arr2 = reverse(llama);
        System.out.println(Arrays.toString(arr2));
    }
    public static int[] reverse(int[] array){
            int[] reverseArray = new int[array.length];
            //cannot use for each as it does not remember index
            for(int i = 0; i < array.length; i++){
                reverseArray[i] = array[array.length-1-i];
            }
            return reverseArray;
    }

} 
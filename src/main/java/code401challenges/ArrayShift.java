package code401challenges;

public class ArrayShift {
    public static void main(String[]args){
    }

    public static int[] shiftArray(int[] arr, int num){
        int midIndex = 0;
        int[] newArr = new int[arr.length];
        if(arr.length %2==0) {
            midIndex = arr.length / 2;
        }else{
            midIndex = (arr.length+1)/2;
        }

        for(int i=0; i<arr.length; i++){
            if(i < midIndex){
                newArr[i]=arr[i];
            }else if(i == midIndex){
                newArr[i]=num;
                newArr[i+1]=arr[i];
            }else{
                newArr[i+1]=arr[i];
            }
        }
        return newArr;
    }

}

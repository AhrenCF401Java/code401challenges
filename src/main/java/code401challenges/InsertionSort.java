package code401challenges;

public class InsertionSort {

    public static int [] insertSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
//            Set j as the first standard to be checked against
//            this is the first int in the sorted part of the array
            int j = i - 1;
//            set a holder that holds the value of the value that will be checked against te sorted part of the arr.
            int temp = arr[i];
//            see if the current temp is greater than or less each value in the sorted part of the array.
            while(j >= 0 && temp < arr[j]) {
//
                arr[j + 1] = arr[j];
                j = j - 1;

                arr[j + 1] = temp;
            }
        }
        return arr;
    }

    public void toString(int[] arr){
        StringBuilder str = new StringBuilder();
        for (int num : arr) {
            str.append(num + "|");
        }
       System.out.println(str.toString());
    }
}

package code401challenges;

public class InsertionSort {
    public int [] InsertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int j = i - 1;
            int temp = arr[i];
//see if the current temp is greater than or less each value in th sorted part of the array.
            while(j >= 0 && temp < arr[j]) {
                arr[j + 1] = arr[j];
                j = j - 1;

                arr[j + 1] = temp;
            }
        }
        return arr;
    }
}

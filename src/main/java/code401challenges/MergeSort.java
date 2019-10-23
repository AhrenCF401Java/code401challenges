package code401challenges;

import java.util.Arrays;

import static code401challenges.InsertionSort.insertSort;
import static code401challenges.Merge.merge;

public class MergeSort {
    public static int [] mergeSort(int[] arr1){
        if(arr1.length < 2){
            return arr1;
        }else{
            int arrlength = arr1.length;
            int[] leftArr = mergeSort(Arrays.copyOfRange(arr1, 0,arrlength/2));
            int[] rightArr = mergeSort(Arrays.copyOfRange(arr1, arrlength/2 , arrlength));
             return merge(leftArr,rightArr);

//             sorted left left arr = mergeSort(lefthalf)
//            sorted right array = mergeSort(righthalf)
//            return merge(leftarr,righarr)
        }

    }
}


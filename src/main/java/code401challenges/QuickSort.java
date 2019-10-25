package code401challenges;
//help From geeks for geeks
public class QuickSort {
    public static int[] quickSort(int[]arr, int left,int right) {
        if(left < right) {
            // Partition the array by setting the position of the pivot value
            int pi = partition(arr, left, right);
            // Sort the left
            quickSort(arr, left, pi - 1);
            // Sort the right
            quickSort(arr, pi + 1, right);
        }
        return arr;
    }


   protected static int partition(int[]arr, int left,int right){
       int pivot = arr[right];
       // create a variable to track the largest index of numbers lower than the defined pivot
       int low = left-1;
       for(int i=left; i<= right-1; i++){
           if (arr[i] <= pivot){
               low++;
//               swap(arr, i, low);
               int temp =arr[low];
               arr[low] = arr[i];
               arr[i] = temp;
           }
       }
//       swap( arr, right, low + 1);
       int temp = arr[low+1];
       arr[low+1] = arr[right];
       arr[right] = temp;
       return low+1;
   }




}

package code401challenges;

public class BinarySearch {
    public static void main(String[]args){

    }

    public static int search(int[] arr,int target) {
        int length = arr.length;

//        keep track of the left and right
        int l = 0;
        int r = length - 1;

        while (l <= r) {
            int mid = (l + r) / 2;
            if (arr[mid] < target) {
                l = mid + 1;
            } else if (arr[mid] > target) {
                r = mid - 1;
            } else {
                return mid;
            }

        }
        return -1;
    }
}

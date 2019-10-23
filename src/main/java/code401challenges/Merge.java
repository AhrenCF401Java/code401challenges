package code401challenges;

public class Merge {
    public static int[] merge(int[] a, int[] b){
//        make a new arr the length of both arrays given combined as length
        int[] mergedArr = new int[a.length + b.length];
            int i = 0;
            int j = 0;
            while(i+j < mergedArr.length){
//                if arr a at the index of i is greater than or equal to arr b index of ja, add arr a at the index of i to mergedArr
                if(j==b.length || (i < a.length && a[i] <= b[j])){
                    mergedArr[i+j] = a[i];
                    i++;
                }else if(j < b.length) {
//                    if the above is not tru add the current arr b[j] to mergedArr
                    mergedArr[i+j] = b[j];
                    j++;
                }
            }
        return mergedArr;
    }
}

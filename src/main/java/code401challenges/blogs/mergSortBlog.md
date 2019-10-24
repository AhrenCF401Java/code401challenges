###Blog Notes: Merge Sort
Merge sort is a sorting algorithm that breaks an array in half and merges them back together in ascending order.
It uses  O(n log n) time

####Wiki on merge sort says

    "In the worst case, merge sort does about 39% fewer comparisons than quicksort method does in the average case. 
    In terms of moves, merge sort's worst case complexity is O(n log n)—the same complexity as quicksort's best case,
    and merge sort's best case takes about half as many iterations as the worst case."


###Learning Objectives
Recursion 
Merge and MergeSort algorithms

##Diagram
<img src="https://en.wikipedia.org/wiki/Merge_sort#/media/File:Merge_sort_algorithm_diagram.svg"/>

##Algorithm
* MergeSort returns any array that's length is less than 2 because by default it is already sorted
* MergeSort then breaks larger arrays in half and then calls a MergeSort on each of the two halves breaking them again. this happens until all array's are < 2 in length. 
* then Merge a merge happens for each piece.
    * Merge takes in 2 arrays and creates an array equal to array1.length + array2.length.
    * Merge then orders them in accending order and sends them back to MergeSort
    
##Pseudocode
    ALGORITHM Mergesort(arr)
        DECLARE n <-- arr.length
               
        if n > 1
          DECLARE mid <-- n/2
          DECLARE left <-- arr[0...mid]
          DECLARE right <-- arr[mid...n]
          // sort the left side
          Mergesort(left)
          // sort the right side
          Mergesort(right)
          // merge the sorted left and right sides together
          Merge(left, right, arr)
    
    ALGORITHM Merge(left, right, arr)
        DECLARE i <-- 0
        DECLARE j <-- 0
        DECLARE k <-- 0
    
        while i < left.length && j < right.length
            if left[i] <= right[j]
                arr[k] <-- left[i]
                i <-- i + 1
            else
                arr[k] <-- right[j]
                j <-- j + 1
                
            k <-- k + 1
    
        if i = left.length
           set remaining entries in arr to remaining values in right
        else
           set remaining entries in arr to remaining values in left


##Video
[Vid on Merge Sort](https://www.youtube.com/watch?v=TzeBrDU-JaY)

##Read
[Wiki on Merge Sort](https://en.wikipedia.org/wiki/Merge_sort)


#Blog Notes: Quick Sort
Quick sort is an algorithm that sorts int arrays by choosing a pivot, and swapping the ints less than it to the left of it and swapping the ints greater than it to the right
Its worst case is O(n²), Its best case is O(n log n) and so is its average case.
While it may not always be the best method to sort especially on partly sorted arrays. 
Competitors to this sort are HeapSport, MergeSort, and BucketSort.

##Learning Objectives
* History
    * Quicksort was developed in 1959 by Tony Hoare.
* Things to learn about QuickSort are:
    * how to chose a pivot and what an optimal piviot is.

##Information Flow
Quick sort is great for large data sets
performance is dependant on a well selected pivot.

##Diagram

<img src="https://en.wikipedia.org/wiki/File:Quicksort-diagram.svg">

##Algorithm
* Select a pivot as well as a left and a right
* Check to see if the left is greater than the pivot if it is swap it with the right as long as the the one on the right is less than the pivot if it is not move the right pointer in and check again.
* Likewise if the left is smaller than the pivot advance it and if its bigger move it to the right following procedure above.
* call this recursively

##Pseudocode
    ALGORITHM QuickSort(arr, left, right)
        if left < right
            // Partition the array by setting the position of the pivot value 
            DEFINE position <-- Partition(arr, left, right)
            // Sort the left
            QuickSort(arr, left, position - 1)
            // Sort the right
            QuickSort(arr, position + 1, right)
    
    ALGORITHM Partition(arr, left, right)
        // set a pivot value as a point of reference
        DEFINE pivot <-- arr[right]
        // create a variable to track the largest index of numbers lower than the defined pivot
        DEFINE low <-- left - 1
        for i <- left to right do
            if arr[i] <= pivot
                low++
                Swap(arr, i, low)
    
         // place the value of the pivot location in the middle.
         // all numbers smaller than the pivot are on the left, larger on the right. 
         Swap(arr, right, low + 1)
        // return the pivot index point
         return low + 1
    
    ALGORITHM Swap(arr, i, low)
        DEFINE temp;
        temp <-- arr[i]
        arr[i] <-- arr[low]
        arr[low] <-- temp
    Requirements
    Ensure your complete solution follows the standard requirements.
    
    Write unit tests
    Follow the template for a well-formatted README
    Submit the assignment following these instructions
    Implementation

##Readings and References
* [QuickSort wiki](https://en.wikipedia.org/wiki/Quicksort)
* [QuickSort by Geeks For Geeks](https://www.geeksforgeeks.org/quick-sort/)

###Video
[Java: QuickSort Explained](https://www.youtube.com/watch?v=Fiot5yuwPAg)

###Read


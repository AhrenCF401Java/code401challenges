# Merge Sort

##
##Problem Domain
given two arrays merge and sort the data from in ascending order.

#
##Solution
* MergeSort returns any array that's length is less than 2 because by default it is already sorted
* MergeSort then breaks larger arrays in half and then calls a MergeSort on each of the two halves breaking them again. this happens until all array's are < 2 in length. 
* then Merge a merge happens for each piece.
     * Merge takes in 2 arrays and creates an array equal to array1.length + array2.length.
     * Merge then orders them in accending order and sends them back to MergeSort
## Approach & Efficiency
recursive approach
O(nlg(n))
##Blog link:
[MergeSort Blog](../blogs/mergSortBlog.md)

##
[Return to all README's](../README.md)
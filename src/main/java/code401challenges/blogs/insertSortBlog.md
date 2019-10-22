Blog Notes: Insertion Sort
This algorithm sorts an unsorted array of int's from least to greatest. It is slightly more efficient than a bubble and selection sort however it is not the most efficient.

###Learning Objectives
* How to sort an array of unsorted values and how to think about moving things in an array.

###Information Flow
Think about a hand of cards, starting from the second from the left check to see it the one to the left of it is bigger or smaller. 
If it is smaller move it to the left. Now the first two cards should be sorted. now do this for the third card. THis time it will need to be checked against cards until it is the bigger of the two and inserted to the right of the first card smaller than it.
See the below diagram from geeks for geeks for a visual reference.
<img src="https://media.geeksforgeeks.org/wp-content/uploads/insertionsort.png">

###Algorithm



###Pseudocode

    InsertionSort(int[] arr)
        FOR i = 1 to arr.length
        
          int j <-- i - 1
          int temp <-- arr[i]
          
          WHILE j >= 0 AND temp < arr[j]
            arr[j + 1] <-- arr[j]
            j <-- j - 1
            
          arr[j + 1] <-- temp
##
###References

Video
* <a href="https://www.youtube.com/watch?v=i-SKeOcBwko">Insertion Sort</a>
    

 ## Insertion Sort
  ###InsertionSort Class
  <!-- Description-->
  
  ##   Lecture Notes: Insertion Merge Sort 
  Insertion sort is a simple sorting algorithm, it builds the final sorted array one item at a time. It is much less efficient on large lists than other sort algorithms
  
  Advantages of Insertion Sort: 
  1) It is very simple.
  2) It is very efficient for small data sets.
  3) It is stable; i.e., it does not change the relative order of elements with equal keys.
  4) In-place; i.e., only requires a constant amount O(1) of additional memory space.
  
  
## Lecture Flow:
- Main point:
  - sorts are methods to organize data that is passed into the method. 
- Another Main Point:
  - there are many different kinds of sorts. Each has its strengths and weaknesses.
  - this particular sort will be very efficient Big O on time, if the array is already organized. If the array is not, it will take an O(n) operation to sort the array. 
  - Insertion sort is mainly used when the size of the array is small. It can be very useful if the array is "almost" organized.
  
  ## Algorithm
  - check that array is not empty, if so throw error
  - start a for loop with i at 1 and going to the end of the array.
  - inside the for loop, initialize two new variables, one to hold the current value, one to act as the advancing variable.
  - inside the while loop, check that the advancing variable is greater than zero, and also that the current value is less than arr value at idex of advancing variable (arr[<advancing variable>])
  
  ## PsuedoCode
  ```  InsertionSort(int[] arr)
    
      FOR i = 1 to arr.length
      
        int j <-- i - 1
        int temp <-- arr[i]
        
        WHILE j >= 0 AND temp < arr[j]
          arr[j + 1] <-- arr[j]
          j <-- j - 1
          
        arr[j + 1] <-- temp
     ```
     
     ## Diagram
     [Whiteboard](../images/InsertionSortWB.jpg)
  
  ### Approach & Efficiency
   
  Time – O(n^2) Runtime grows directly in proportion to n
  Space - only requires a constant amount O(1) of additional memory space.
   
  
   Learning Objectives
   
   Insertion sort iterates through the list by consuming one input element at each repetition, and growing a sorted output list. On a repetition, insertion sort removes one element from the input data, finds the location it belongs within the sorted list, and inserts it there. It repeats until no input elements remain.
   
   Insertion Sort  Algorithm
   Image source: “Introduction to Algorithms”, The MIT Press
   The best case input is an array that is already sorted. In this case insertion sort has a linear running time (i.e., Θ(n)). During each iteration, the first remaining element of the input is only compared with the right-most element of the sorted subsection of the array. The simplest worst case input is an array sorted in reverse order. The set of all worst case inputs consists of all arrays where each element is the smallest or second-smallest of the elements before it. In these cases every iteration of the inner loop will scan and shift the entire sorted subsection of the array before inserting the next element. This gives insertion sort a quadratic running time (i.e., O(n2)). The average case is also quadratic, which makes insertion sort impractical for sorting large arrays. However, insertion sort is one of the fastest algorithms for sorting very small arrays, even faster than quicksort; indeed, good quicksort implementations use insertion sort for arrays smaller than a certain threshold, also when arising as subproblems; the exact threshold must be determined experimentally and depends on the machine, but is commonly around ten.
      
  ##Readings and References
  ### Watch Video
  
  https://www.youtube.com/watch?v=lCDZ0IprFw4
   
   
  ### Read And Resources 
  
  https://www.geeksforgeeks.org/insertion-sort/
  
  http://www.java2novice.com/java-sorting-algorithms/insertion-sort/
   
  
  ### Bookmark
  
  https://www.w3resource.com/java-exercises/sorting/java-sorting-algorithm-exercise-7.php
   

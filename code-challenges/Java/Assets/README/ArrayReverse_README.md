## Reverse an Array
###ArrayReverse.class
<!-- Description of the challenge -->
Write a function called reverseArray which takes an array as an argument. Without utilizing any of the built-in methods available to your language, return an array with elements in reversed order.

### Approach & Efficiency
<!-- What approach did you take? Why? What is the Big O space/time for this approach? -->
I used for loop method to access each element and swap current element at index [i]  with the element at -i -1 <last element>

A linear algorithm – O(n) Runtime grows directly in proportion to n

### Solution   
 ```static void rvereseArray(int startArr[]) { 
    for(int i = 0; i < startArr.length / 2; i++)
    {
        int temp = startArr[i];
        startArr[i] = startArr[startArr.length - i - 1];
        startArr[startArr.length - i - 1] = temp;
    } 
        }
  ```
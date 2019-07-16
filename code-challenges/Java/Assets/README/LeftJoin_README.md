# Left Join

 ## Challenge
- Write a function that LEFT JOINs two hashmaps into a single data structure.
- The first parameter is a hashmap that has word strings as keys, and a synonym of the key as values.
- The second parameter is a hashmap that has word strings as keys, and antonyms of the key as values Combine the key and corresponding values (if they exist) into a new data structure according to LEFT JOIN logic
 ## Approach & Efficiency
- Time efficiency would be O(n*k)
- Space efficiency would be O(n)

 ## API 
 - leftJoin(HashMap<String, String> leftHashMap, HashMap<String, String> rightHashMap)
 
 ## Acknowledgements
- Stephen Chu for Regex assistance

## Whiteboard Picture
![](../images/LeftJoin.jpg)
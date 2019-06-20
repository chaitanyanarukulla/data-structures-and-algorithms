 ##  Binary Search
  ###BinarySearchTree.class
  <!-- Description of the challenge -->
Create a Node class that has properties for the value stored in the node, the left child node, and the right child node.
Create a BinaryTree class
Define a method for each of the depth first traversals called preOrder, inOrder, and postOrder which returns an array of the values, ordered appropriately.
   
 ## Approach & Efficiency
 <!-- What approach did you take? Why? What is the Big O space/time for this approach? -->
 * `preOrder` - O(n)
 * `inOrder` - O(n)
 * `postOrder` - O(n)
 * `add` - O(lg(n))
 * `contains` - O(lg(n))
 * `breadth_first`-O(n)
 * `find-maximum-value`-O(n)
 
 
  
 ### Solution for BinaryTree | BinarySearchTree
  - [BinaryTree : Code](../../src/main/java/Tree/BinaryNode.java)
  - [BinaryTree : Test ](../../src/test/java/Tree/BinaryNodeTest.java)
  
  - [BinarySearchTree : Code](../../src/main/java/Tree/BinarysearchTree.java)
  - [BinarySearchTree : Test ](../../src/test/java/Tree/BinarysearchTreeTest.java)
  
  ### Code Challanges 17 Whiteboard
  - [BinaryTree : breadth_first](/Assets/images/mergeLists.jpg)
  ```traversed the tree level, by level. A tree with input 1-5, filling left child first would produce an out put of: 1,2,3,4,5.```
  
   ### Code Challanges 18 Whiteboard
  - [BinaryTree : find_maximum_binary_tree](/Assets/images/maxVal.jpeg)
  ```traversed the tree level, by level and change the value of the Node if its greater```
## Stack And Queues
  ###Queue.class | Stack.class
  Create a Node class that has properties for the value stored in the Node, and a pointer to the next node.
  Create a Stack class that has a top property. It creates an empty Stack when instantiated.
  This object should be aware of a default empty value assigned to top when the stack is created.
  Define a method called push which takes any value as an argument and adds a new node with that value to the top of the stack with an O(1) Time performance.
  Define a method called pop that does not take any argument, removes the node from the top of the stack, and returns the node’s value.
  Define a method called peek that does not take an argument and returns the value of the node located on top of the stack, without removing it from the stack.
  Create a Queue class that has a front property. It creates an empty Queue when instantiated.
  This object should be aware of a default empty value assigned to front when the queue is created.
  Define a method called enqueue which takes any value as an argument and adds a new node with that value to the back of the queue with an O(1) Time performance.
  Define a method called dequeue that does not take any argument, removes the node from the front of the queue, and returns the node’s value.
  Define a method called peek that does not take an argument and returns the value of the node located in the front of the queue, without removing it from the queue.
  
  ### Approach & Efficiency
  <!-- What approach did you take? Why? What is the Big O space/time for this approach? -->
  
 
  A linear algorithm – O(n) Runtime grows directly in proportion to n
  
  ### Solution for Stack
  - [Stack Code](../../src/main/java/stacksandqueues/Stack.java)
  - [Stack Test ](../../src/test/java/stacksandqueues/StackTest.java)

    ##API
    ```
    Stack.peek 
    ```
    ```
    Stack.size
     ```
    ```
    Stack.push
    ```
    ```
    Stack.pop
    ```
  
  ### Solution For Queue
  - [Queue Code](../../src/main/java/stacksandqueues/Queue.java)
  - [Queaue Test ](../../src/test/java/stacksandqueues/QueueTest.java)
  
    ##API
    
    ```
    Queue.peek
    ```
    ```
    Queue.size
    ```
    ```
    Queue.dequeue
    ```
    ```
    Queue.enqueue
    ```
    

package QueueWithStacks;

import stacksandqueues.Stack;

public class PseudoQueue {
Stack main;
Stack temp;

public PseudoQueue(){
    this.main = new Stack();
    this.temp = new Stack();
};

public void enqueue (int data){
    main.push(data);
}

public int dequeue(){
    while(main.isEmpty() == false){
        temp.push(main.pop());
    }
    int dequeueOutput = temp.pop();
    while(temp.isEmpty() == false){
        main.push(temp.pop());
    }
    return dequeueOutput;

}

}

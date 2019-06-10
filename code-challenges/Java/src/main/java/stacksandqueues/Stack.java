package stacksandqueues;

public class Stack {
    Node head = null;
    int size = 0;

    public Stack() {
    }

    public int peek() {
        if (this.head == null) {
            throw new RuntimeException("Unable to peek element for an empty stack");
        }
        return this.head.getData();
    }

    public void push(int data) {
        if(this.head == null){
        this.head = new Node(data);
        size ++;
        }else{
             Node temp = head;
             head = new Node(data);
             temp =head.prev;
            size ++;
        }
    }

    public int pop() {
        if (this.head == null) {
            throw new RuntimeException("Unable to remove element from an empty stack");
        }
        int temp = this.head.data;
        this.head = this.head.getPrev();
        size --;
        return temp;
    }

}
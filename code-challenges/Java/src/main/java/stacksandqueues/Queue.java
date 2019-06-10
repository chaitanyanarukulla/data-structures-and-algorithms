package stacksandqueues;

public class Queue {
    Node front = null;
    Node last = null;
    int size = 0;

    public Queue() {
    }

    public int peek() {
        if (this.front == null) {
            throw new RuntimeException("Unable to peek element for an empty stack");
        }
        return this.front.data;
    }


    public boolean isEmpty() {
        return front == null;
    }

    public int dequeue() {
        if (isEmpty()) {
            throw new RuntimeException("Queue underflow");
        } else if (front == last) {
            int temp = front.data;
            front = null;
            last = null;
            size--;
            return temp;
        }

        int temp = front.data;
        front = front.prev;
        size--;
        return temp;

    }
    public void enqueue(int data) {
        Node temp = new Node(data);
        if (front == null && last == null) {
            front = temp;
            last = temp;
            size++;
            return; // return back when first node is enqueued
        }
        last.prev = temp;
        last = temp;
        size++;
    }

}
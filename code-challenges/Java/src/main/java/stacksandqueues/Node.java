package stacksandqueues;

public class Node {

    public int data;
    public Node prev;
    // Constructor to create a new node
    public Node(int data) {
        this.data = data;
        this.prev = null;

    }
    public int getData() {
        return data;
    }

    public Node getPrev() {
        return prev;
    }
}
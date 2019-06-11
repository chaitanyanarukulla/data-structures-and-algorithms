package LinkedList;

public class LinkedList {
    public  Node head;
//  Linkedlist class
    public void insert(int data){
        Node olH = this.head;
        Node newHead = new Node(data);
        this.head = newHead;
        this.head.next = olH;
    }

// getter to get head
    public Node getHead() {
        return this.head;
    }
// method to look up includes
    public boolean Includes(int data){
        Node current = this.head;
        while(current.next != null){
            if(current.data == data){
                return true;
            }
            current = current.next;

        }

        return false;
    }
// method to print
    public String prints(){
        Node current = this.head;
        String answer = "";
        while(current != null){
            answer += current.data + ", ";
            current = current.next;
            if(current == null){
                answer += "null";

            }
        }
        return answer;
    }
// mrthod to append
    public Node append(int data) {
        Node newNode = new Node(data);
        if (this.head == null) {
            this.head = newNode;
            return newNode;
        }
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
        return newNode;
    }
// method to insert before
    public void insertBefore(int x, int data) {
        Node current = this.head;
        Node prev = null;
        if (head != null) {
            while (current != null) {
                if (current.data == x) {
                    Node n = new Node(data);
                    n.next = current;
                    if (prev != null) {
                        prev.next = n;
                    }
                    if(head.data == x){
                        this.head = n;
                    }
                    return;
                }
                prev = current;
                current = current.next;
            }
        }
    }
// method to insert After
    public void insertAfter(int x, int data) {
        Node current = this.head;
        if (head != null) {
            while (current != null) {
                if (current.data == x) {
                    Node n = new Node(data);
                    n.next = current.next;
                    current.next = n;
                    return;
                } else {
                    current = current.next;
                }

            }
        }
    }
// method to check for empty List
    public boolean checkForEmptyLL(){
        if(head == null){
            return true;
        } else {
            return false;
        }
    }
// method to return  node from nth term
    public int returnNfromTheEnd(int k){
        Node current = head;
        if (k < 0){
            throw new IllegalArgumentException("k must be postitive");
        }
        if(checkForEmptyLL()){
            throw new NullPointerException("nothing in the linked list");
        } else {
            int counter = 0;
            while(current != null){
                counter++;
                current = current.next;
            }
            current = head;
            for(int i = 0; i < counter - k - 1; i++){
                current = current.next;
            }
            return current.data;
        }
    }
// merger Two linked List
    public static LinkedList mergeLists(LinkedList one, LinkedList two) {
        Node oneCurrent = one.getHead();
        Node twoCurrent = two.getHead();
        Node temp1;
        Node temp2;
        // if list are empty
        if (oneCurrent == null) return two;
        if (twoCurrent == null) return one;
        while(true){
            temp1 = oneCurrent.next;
            temp2 = twoCurrent.next;
            oneCurrent.next = twoCurrent;
            oneCurrent = temp1;
            if (oneCurrent == null) break;
            twoCurrent.next = oneCurrent;
            twoCurrent = temp2;
            if (twoCurrent == null) break;
        }
        return one;
        }
    }






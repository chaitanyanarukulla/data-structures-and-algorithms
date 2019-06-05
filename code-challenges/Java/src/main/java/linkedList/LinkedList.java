package linkedList;

import java.io.*;

public class LinkedList {
    public  Node head;

    public void insert(int data){
        Node olH = this.head;
        Node newHead = new Node(data);
        this.head = newHead;
        this.head.next = olH;
    }

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

    public boolean checkForEmptyLL(){
        if(head == null){
            return true;
        } else {
            return false;
        }
    }

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
    }





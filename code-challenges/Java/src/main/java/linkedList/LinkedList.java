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

    public boolean Includes(int d){
        Node current = this.head;
        while(current.next != null){
            if(current.data == d){
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

}


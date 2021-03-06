package fifoAnimalShelter;

// creating AnimalShelter class
public class  AnimalShelter<T> {
    Node<T> front, rear;
    private int size;

// Animal Constructor
    public AnimalShelter() {
        this.front = null;
        this.rear = null;
        this.size = 0;
    }
        static class Node<T> {
        Node<T> next;
        T data;
        public Node(T data){
            this.data = data;
        }
    }
    // method to ENQUEUE
    public void enq(T t) {
        Node a = new Node(t);
            if (front == null) {
               front = a;
                rear = a;
                size++;
            } else {
                rear.next = a;
                rear = a;
                size++;
            }
        }
   // Method To Dequeue
    public Object dequeue(String animal){
        Node prev = this.front;
        Node current = this.front;
        while(current != null){
            if(current.data.toString() == animal) {
                if(current == prev && current.next == null){
                    this.front = null;
                    this.rear = null;
                } else if (current == prev && current.next != null){
                    this.front = this.front.next;
                } else if(current == this.rear){
                    this.rear = prev;
                }
                size--;
                return current.data;
            }
            if(prev != current){
                prev = prev.next;
            }
            current = current.next;
        }
        return null;
    }
    public int getSize()
    {
        return size;
    }

}


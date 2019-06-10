package stacksandqueues;

import org.junit.Test;

import static org.junit.Assert.*;

public class QueueTest {

    @Test
    public void test_Queue() {
        Queue classUnderTest = new Queue();
        assertEquals(null, classUnderTest.front);
        assertEquals(0, classUnderTest.size);
    }

    @Test
    public void test_enqueue() {
        Queue classUnderTest = new Queue();
        classUnderTest.enqueue(18);
        assertEquals(18, classUnderTest.peek());
    }

    @Test
    public void test_enqueue_multiple_times() {
        Queue classUnderTest = new Queue();
        classUnderTest.enqueue(18);
        classUnderTest.enqueue(78);
        classUnderTest.enqueue(168);
        classUnderTest.enqueue(148);
        assertEquals(18, classUnderTest.peek());
        assertEquals(4, classUnderTest.size);
    }


    @Test
    public void test_Queue_size() {
        Queue classUnderTest = new Queue();
        classUnderTest.enqueue(12);
        classUnderTest.enqueue(18);
        classUnderTest.enqueue(19);
        assertEquals(3, classUnderTest.size);
    }

    @Test(expected=RuntimeException.class)
    public void test_dequeu_empty() {
        Queue classUnderTest = new Queue();
        classUnderTest.dequeue();
    }

    @Test
    public void test_dequeue() {
        Queue classUnderTest = new Queue();
        classUnderTest.enqueue(12);
        classUnderTest.enqueue(18);
        classUnderTest.enqueue(19);
        assertEquals(12, classUnderTest.dequeue());
        assertEquals(2, classUnderTest.size);
    }

    @Test
    public void test_dequeue_enqueue() {
        Queue classUnderTest = new Queue();
        classUnderTest.enqueue(12);
        classUnderTest.enqueue(18);
        classUnderTest.enqueue(19);
        assertEquals(12, classUnderTest.dequeue());
        assertEquals(18, classUnderTest.dequeue());
        assertEquals(1, classUnderTest.size);
    }
}
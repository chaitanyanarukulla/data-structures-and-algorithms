package QueueWithStacks;
import org.junit.Test;
import static org.junit.Assert.*;

public class PseudoQueueTest {
    @Test
    public void test_PseudoQueueTest() {
        PseudoQueue classUnderTest = new PseudoQueue();
        assertEquals(null, classUnderTest.main.head);
        assertEquals(null, classUnderTest.temp.head);
    }

    @Test
    public void test_PseudoQueueTest_enqueue_one_val() {
        PseudoQueue classUnderTest = new PseudoQueue();
        classUnderTest.enqueue(10);
        assertEquals(10,classUnderTest.main.peek());
    }

    @Test
    public void test_PseudoQueueTest_enqueue_multi_val() {
        PseudoQueue classUnderTest = new PseudoQueue();
        classUnderTest.enqueue(10);
        classUnderTest.enqueue(16);
        classUnderTest.enqueue(101);
        assertEquals(101,classUnderTest.main.peek());
    }

    @Test
    public void test_PseudoQueueTest_dequeue() {
        PseudoQueue classUnderTest = new PseudoQueue();
        classUnderTest.enqueue(10);
        classUnderTest.enqueue(16);
        assertEquals(16,classUnderTest.dequeue());
    }

    @Test
    public void test_PseudoQueueTest_dequeue_enqueue() {
        PseudoQueue classUnderTest = new PseudoQueue();
        classUnderTest.enqueue(10);
        classUnderTest.enqueue(16);
        classUnderTest.enqueue(161);
        assertEquals(161,classUnderTest.main.peek());
    }

}

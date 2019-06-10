package stacksandqueues;

import org.junit.Test;

import static org.junit.Assert.*;

public class StackTest {

    @Test
    public void test_Node() {
        Stack classUnderTest = new Stack();
        assertEquals(null, classUnderTest.head);
        assertEquals(0, classUnderTest.size);

    }
    @Test
    public void test_Stack_size() {
        Stack classUnderTest = new Stack();
        classUnderTest.push(12);
        classUnderTest.push(18);
        classUnderTest.push(20);
        assertEquals(3, classUnderTest.size);

    }

    @Test
    public void test_push() {
        Stack classUnderTest = new Stack();
        classUnderTest.push(12);
        assertEquals(12, classUnderTest.peek());
    }

    @Test
    public void tet_multiple_push() {
        Stack classUnderTest = new Stack();
        classUnderTest.push(12);
        classUnderTest.push(18);
        classUnderTest.push(20);
        assertEquals(20, classUnderTest.peek());
        assertEquals(3, classUnderTest.size);
    }

    @Test
    public void test_pop() {
        Stack classUnderTest = new Stack();
        classUnderTest.push(12);
        classUnderTest.push(18);
        classUnderTest.push(20);
        assertEquals(20, classUnderTest.pop());
        assertEquals(2, classUnderTest.size);
    }

    @Test(expected=RuntimeException.class)
    public void tet_pop_Stack_empty() {
        Stack classUnderTest = new Stack();
        classUnderTest.pop();
    }

}
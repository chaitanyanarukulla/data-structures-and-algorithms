package linkedListTest;

import linkedList.LinkedList;
import linkedList.Node;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class LinkedListTest {
    @Test
    public void test_LinkedList() {
        LinkedList classUnderTest = new LinkedList();

    }


    @Test
    public void test_Insert_single_node() {
        LinkedList classUnderTest = new LinkedList();
        classUnderTest.insert(6);
        assertEquals(6, classUnderTest.head.data);

    }

    @Test
    public void test_Insert_multiple_nodes() {
        LinkedList classUnderTest = new LinkedList();
        classUnderTest.insert(4);
        classUnderTest.insert(3);
        classUnderTest.insert(2);
        assertEquals(3, classUnderTest.head.next.data);
    }

    @Test
    public void test_Insert_multiple_nodes_check_head() {
        LinkedList classUnderTest = new LinkedList();
        classUnderTest.insert(4);
        classUnderTest.insert(3);
        classUnderTest.insert(2);
        assertEquals(2, classUnderTest.head.data);
    }

    @Test
    public void test_include_nodes() {
        LinkedList classUnderTest = new LinkedList();
        classUnderTest.insert(4);
        classUnderTest.insert(5);
        classUnderTest.insert(8);
    assertTrue(classUnderTest.Includes(5));

    }
    @Test
    public void test_prints() {
        LinkedList classUnderTest = new LinkedList();
        classUnderTest.insert(4);
        classUnderTest.insert(5);

        assertEquals("4, 5 null",classUnderTest.prints());
    }


}

package linkedListTest;

import linkedList.LinkedList;
import linkedList.Node;
import org.junit.Test;

import static org.junit.Assert.*;

public class LinkedListTest {
    @Test
    public void test_LinkedList() {
        LinkedList classUnderTest = new LinkedList();
        assertEquals(null, classUnderTest.head);
    }

    @Test
    public void test_Insert_single_node() {
        LinkedList classUnderTest = new LinkedList();
        classUnderTest.insert(6);
        assertEquals(6, classUnderTest.head.data);
    }

    @Test
    public void test_Insert_nodes() {
        LinkedList classUnderTest = new LinkedList();
        classUnderTest.insert(4);
        assertEquals(4, classUnderTest.head.data);
    }

    @Test
    public void test_Insert_nodes_next() {
        LinkedList classUnderTest = new LinkedList();
        classUnderTest.insert(4);
        assertEquals(null, classUnderTest.head.next);
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
    public void test_include_nodes_true() {
        LinkedList classUnderTest = new LinkedList();
        classUnderTest.insert(4);
        classUnderTest.insert(5);
        classUnderTest.insert(8);
    assertTrue(classUnderTest.Includes(5));
    }
    @Test
    public void test_include_nodes_false() {
        LinkedList classUnderTest = new LinkedList();
        classUnderTest.insert(4);
        classUnderTest.insert(5);
        classUnderTest.insert(8);
        assertFalse(classUnderTest.Includes(9));
    }

    @Test
    public void test_prints_one_value() {
        LinkedList classUnderTest = new LinkedList();
        classUnderTest.insert(5);
        assertEquals("5, null",classUnderTest.prints());
    }
    @Test
    public void test_prints_all_value_inserted() {
        LinkedList classUnderTest = new LinkedList();
        classUnderTest.insert(4);
        classUnderTest.insert(5);
        assertEquals("5, 4, null",classUnderTest.prints());
    }

    @Test
    public void test_Append_with_one() {
        LinkedList classUnderTest = new LinkedList();
        classUnderTest.append(4);
        assertEquals("4, null", classUnderTest.prints());
    }

    @Test
    public void test_Append_with_multiple_append() {
        LinkedList classUnderTest = new LinkedList();
        classUnderTest.append(6);
        classUnderTest.append(3);
        classUnderTest.append(4);
        classUnderTest.append(2);
        classUnderTest.append(1);
        classUnderTest.insert(8);
        assertEquals("8, 6, 3, 4, 2, 1, null", classUnderTest.prints());
    }

    @Test
    public void test_Append_with_insert() {
        LinkedList classUnderTest = new LinkedList();
        classUnderTest.insert(10);
        classUnderTest.append(4);
        classUnderTest.append(2);
        classUnderTest.append(1);
        classUnderTest.insert(8);
        assertEquals("8, 10, 4, 2, 1, null", classUnderTest.prints());
    }
    @Test
    public void test_Insert_Before_with_one_val() {
        LinkedList classUnderTest = new LinkedList();
        classUnderTest.insert(6);
        assertEquals("6, null", classUnderTest.prints());
    }

    @Test
    public void test_Insert_Before() {
        LinkedList classUnderTest = new LinkedList();
        classUnderTest.insert(6);
        classUnderTest.insert(3);
        classUnderTest.insertBefore(6, 15);
        assertEquals("3, 15, 6, null", classUnderTest.prints());
    }
    @Test
    public void test_Insert_Before1_multiple_times() {
        LinkedList classUnderTest = new LinkedList();
        classUnderTest.insert(7);
        classUnderTest.insert(18);
        classUnderTest.insertBefore(18,14);
        classUnderTest.insert(2);
        classUnderTest.insert(1);
        classUnderTest.insertBefore(2,12);
        assertEquals("1, 12, 2, 18, 7, null", classUnderTest.prints());
    }


    @Test
    public void test_Insert_Before_at_head() {
        LinkedList classUnderTest = new LinkedList();
        classUnderTest.insert(6);
        classUnderTest.insertBefore(6, 15);

        assertEquals("15, 6, null", classUnderTest.prints());
    }

    @Test
    public void test_Insert_Before_at_last() {
        LinkedList classUnderTest = new LinkedList();
        classUnderTest.insert(6);
        classUnderTest.insert(3);
        classUnderTest.insert(7);
        classUnderTest.insertBefore(6, 15);

        assertEquals("7, 3, 15, 6, null", classUnderTest.prints());
    }

    @Test
    public void test_Insert_After_one_val() {
        LinkedList classUnderTest = new LinkedList();
        classUnderTest.insert(6);;
        classUnderTest.insertAfter(6,12);
        assertEquals("6, 12, null", classUnderTest.prints());
    }
    @Test
    public void test_Insert_After_many_val() {
        LinkedList classUnderTest = new LinkedList();
        classUnderTest.insert(6);
        classUnderTest.insert(3);
        classUnderTest.insert(4);
        classUnderTest.insert(2);
        classUnderTest.insert(1);
        classUnderTest.insertAfter(4,12);
        assertEquals("1, 2, 4, 12, 3, 6, null", classUnderTest.prints());
    }

    @Test
    public void test_Insert_After_head() {
        LinkedList classUnderTest = new LinkedList();
        classUnderTest.insert(6);
        classUnderTest.insertAfter(6,12);
        assertEquals("6, 12, null", classUnderTest.prints());
    }
    @Test
    public void test_Insert_After_end() {
        LinkedList classUnderTest = new LinkedList();
        classUnderTest.insert(6);
        classUnderTest.insert(3);
        classUnderTest.insert(4);
        classUnderTest.insert(2);
        classUnderTest.insertAfter(6,15);
        assertEquals("2, 4, 3, 6, 15, null", classUnderTest.prints());
    }


}

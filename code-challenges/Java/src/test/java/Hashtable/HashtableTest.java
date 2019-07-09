package Hashtable;

import org.junit.Test;

import static org.junit.Assert.*;

public class HashtableTest {

    @Test
    public void test_hash() {
        Hashtable ClassUnderTest = new Hashtable(1);
        assertEquals(0, ClassUnderTest.hash("test"));

    }

    @Test
    public void test_hash_multiple() {
        Hashtable ClassUnderTest = new Hashtable(2);
        ClassUnderTest.add("12","Chai");
        ClassUnderTest.add("13","Luke");
        assertEquals(1, ClassUnderTest.hash("Chai"));
        assertEquals(1, ClassUnderTest.hash("Luke"));
    }

    @Test
    public void test_add() {
        Hashtable ClassUnderTest = new Hashtable(2);
        ClassUnderTest.add("12","Chai");
        assertEquals("Chai", ClassUnderTest.get("12"));
    }

    @Test
    public void test_add_multiple() {
        Hashtable ClassUnderTest = new Hashtable(2);
        ClassUnderTest.add("12","Chai");
        ClassUnderTest.add("13","Luke");
        ClassUnderTest.add("14","Will");
        ClassUnderTest.add("18","christian");
        assertEquals("Chai", ClassUnderTest.get("12"));
        assertEquals("Luke", ClassUnderTest.get("13"));
    }

    @Test
    public void test_contains_single(){
        Hashtable ClassUnderTest = new Hashtable(1);
        ClassUnderTest.add("12", "chai");
        assertTrue(ClassUnderTest.contains("12"));
    }

    @Test
    public void test_contains_multiple() {
        Hashtable ClassUnderTest = new Hashtable(2);
        ClassUnderTest.add("12","Chai");
        ClassUnderTest.add("13","Luke");
        ClassUnderTest.add("14","Will");
        ClassUnderTest.add("18","christian");
        assertTrue(ClassUnderTest.contains("14"));
    }
}
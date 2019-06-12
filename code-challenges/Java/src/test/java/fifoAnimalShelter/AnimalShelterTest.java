package fifoAnimalShelter;

import org.junit.Test;

import static org.junit.Assert.*;

public class AnimalShelterTest {

    @Test
    public void test_enq_one() {
        AnimalShelter classUndertest = new AnimalShelter();
        classUndertest.enq(new Animal("cat"));
        assertEquals("cat",classUndertest.front.data.toString());
    }

    @Test
    public void test_Enqueue_multiple(){
        AnimalShelter classUnderTest = new AnimalShelter();
        classUnderTest.enq(new Animal("Dog"));
        classUnderTest.enq(new Animal("Cat"));
        classUnderTest.enq(new Animal("Bird"));
        assertEquals("Should return 3", 3, classUnderTest.getSize());
    }

    @Test
    public void test_Dequeue_single(){
        AnimalShelter classUnderTest = new AnimalShelter();
        classUnderTest.enq(new Animal("Dog"));
        classUnderTest.enq(new Animal("Cat"));
        classUnderTest.enq(new Animal("Bird"));
        assertEquals("should return 'Dog", "Cat", classUnderTest.dequeue("Cat").toString());
        assertEquals("should return 2", 2, classUnderTest.getSize());
    }

    @Test
    public void test_Dequeue_multiple(){
        AnimalShelter classUnderTest = new AnimalShelter();
        classUnderTest.enq(new Animal("Dog"));
        classUnderTest.enq(new Animal("Cat"));
        classUnderTest.enq(new Animal("Bird"));
        assertEquals("should return 'Bird'.", "Bird", classUnderTest.dequeue("Bird").toString());
        assertEquals("should return 'Dog'.", "Dog", classUnderTest.dequeue("Dog").toString());
        assertEquals("should return 'Cat'.", "Cat", classUnderTest.dequeue("Cat").toString());
        assertEquals("should return 0", 0, classUnderTest.getSize());
    }
}
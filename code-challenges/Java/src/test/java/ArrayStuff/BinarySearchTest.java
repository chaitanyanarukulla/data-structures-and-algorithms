package ArrayStuff;

import ArrayStuff.BinarySearch;
import org.junit.Test;
import static org.junit.Assert.*;


public class BinarySearchTest {
    int inputArray[] = new int[]{1,2,3,4,5,6,17,18,19,20,100};
    @Test
    public void test_return_index_of_array_equal_to_search_key() {
        assertEquals(2, BinarySearch.binarySearch(inputArray, 3));
    }

    @Test
    public void test_return_index_of_array_search_key_at_end() {
        assertEquals(10, BinarySearch.binarySearch(inputArray, 100));
    }
    @Test
    public void test_return_index_of_array_search_key_at_first_element() {
        assertEquals(0, BinarySearch.binarySearch(inputArray, 1));

    }

    @Test
    public void test_given_key_not_in_array() {
        assertEquals(-1, BinarySearch.binarySearch(inputArray, 99));
    }

}





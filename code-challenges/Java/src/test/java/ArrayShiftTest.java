

import org.junit.Test;

import static org.junit.Assert.*;
// testing
public class ArrayShiftTest {
    @Test
    public void test_ArrayShift_If_Array_Is_Empty() {
        ArrayShift classUnderTest = new ArrayShift();
        int inputArray[] = new int[0];
        int value = 10;
        int newArray[] = classUnderTest.insertShiftArray(inputArray, value);
        assertArrayEquals(new int[]{10}, newArray);
    }

    @Test
    public void test_ArrayShift_has_one_value() {
        ArrayShift classUnderTest = new ArrayShift();
        int inputArray[] = new int[]{1};
        int value = 10;
        int newArray[] = classUnderTest.insertShiftArray(inputArray, value);
        assertArrayEquals(new int[]{1,10}, newArray);
    }

    @Test
    public void test_ArrayShift_If_Array_lenght_is_Even() {
        ArrayShift classUnderTest = new ArrayShift();
        int inputArray[] = new int[]{1,2,3,4};
        int value = 20;
        int newArray[] = classUnderTest.insertShiftArray(inputArray, value);
        assertArrayEquals(new int[]{1,2,20,3,4}, newArray);
    }

    @Test
    public void test_ArrayShift_If_Array_length_is_Odd() {
        ArrayShift classUnderTest = new ArrayShift();
        int inputArray[] = new int[]{1,2,3,4,5};
        int value = 10;
        int newArray[] = classUnderTest.insertShiftArray(inputArray, value);
        assertArrayEquals(new int[]{1,2,3,10,4,5}, newArray);
    }





}
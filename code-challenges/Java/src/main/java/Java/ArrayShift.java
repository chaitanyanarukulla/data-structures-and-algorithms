package Java;

public class ArrayShift {
    public static int[] insertShiftArray(int[] inputArray, int value) {
        int newArray[] = new int[inputArray.length + 1];

        int i;
        int odd = inputArray.length % 2;
        int midPoint = inputArray.length / 2 + odd;

        for ( i = 0; i < midPoint; i++) {
            newArray[i] = inputArray[i];
        }
        newArray[i] = value;
        i++;

        for (; i < inputArray.length + 1; i++) {
            newArray[i] = inputArray[i - 1];
        }

        return newArray;
    }
}
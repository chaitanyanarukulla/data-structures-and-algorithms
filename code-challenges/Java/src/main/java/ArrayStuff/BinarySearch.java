package ArrayStuff;


public class BinarySearch {
    public static int binarySearch(int[] arry, int key) {
        int lo = 0;
        int hi = arry.length - 1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if(key < arry[mid]) hi = mid - 1;
            else if (key > arry[mid]) lo = mid + 1;
            else return mid;
        }
        return -1;
    }
}

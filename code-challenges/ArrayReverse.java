import java.util.Arrays;

public class ArrayReverse {
    public static void main (String[] args) {
  // create the array to test your code on later
    int[] startArr = new int[] {1,2,3,4,5,10};

  // print it out, nicely
    System.out.println(Arrays.toString(startArr));
    rvereseArray(startArr); 

  // print out the result, nicely
        System.out.println("Reversed array is"); 
        System.out.println(Arrays.toString(startArr));
         
    }
  static void rvereseArray(int startArr[]) { 
    for(int i = 0; i < startArr.length / 2; i++)
    {
        int temp = startArr[i];
        startArr[i] = startArr[startArr.length - i - 1];
        startArr[startArr.length - i - 1] = temp;
    } 
        }  
    }
    


//11. Create a boolean[] of size 5, set alternate values to true, and print it.
import java.util.*;
public class BoolArray {
    public static void main(String[] args)
    {
        boolean[] arr = new boolean[5];

        System.out.println(Arrays.toString(arr));

        //set alternate values to true
        for(int i = 0; i<arr.length; i+=2){
           arr[i] = true;
        }

        //print the array
        System.out.println(Arrays.toString(arr));
    }
}

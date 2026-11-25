//Copy an array into another one in three ways: a manual loop, Arrays.copyOf and System.arraycopy.
import java.util.*;
public class CopyArray {
    public static void main(String[] args)
    {
        int[] arr = {10,20,30,40};

        int[] copy1 = new int[arr.length];

        int[] copy3 = new int[arr.length];

        //manual loop
        for(int i = 0;i < arr.length; i++){
            copy1[i] = arr[i];
        }

        System.out.println("Copies array using manual loop: " + Arrays.toString(copy1));

        //Arrays.copyOf
        int[] copy2 = Arrays.copyOf(arr,arr.length);

        System.out.println("Copied array using Arrays.copyOf(): " + Arrays.toString(copy2));

        //using System.arraycopy
        System.arraycopy(arr,0,copy3,0,arr.length);
        System.out.println("Copies array using System.arraycopy():" + Arrays.toString(copy3));
    }
}

import java.util.*;
public class PositionInsert{

    public static int[] insertAt(int[] arr,int pos,int value)
    {
        int n = arr.length;
        if(pos < 0 || pos > n){
            throw new IllegalArgumentException("Invalid Position");
        }

        //step 1: create a new array one extra slot
        int[] result = new int[n + 1];


        //step 2: add element upto position
        for(int i = 0; i < pos; i++){
            result[i] = arr[i];
        }

        //step 3: add value at position
        result[pos] = value;

        //step 4: add remaining elements 

        for(int  i = pos; i < n; i++){
            result[i+1] = arr[i];
        }

        return result;
    }
    public static void main(String[] args)
    {
       int[] arr = {1,2,3,4,5};

       System.out.println(Arrays.toString(arr));

       arr = insertAt(arr, 2, 9);

       System.out.println(Arrays.toString(arr));
    }
}
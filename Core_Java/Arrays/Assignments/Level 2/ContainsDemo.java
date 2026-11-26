// Check whether an array contains a given value, using a method that returns a boolean.
import java.util.*;

public class ContainsDemo {

    static boolean isContain(int[] arr, int target){
        for(int i = 0; i<arr.length; i++){
            if(arr[i] == target){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args)
    {
        int[] arr = {1,2,3,4,5};

        System.out.println(isContain(arr,3));
    }
}

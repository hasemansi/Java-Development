//Check whether two arrays contain the same elements in the same order, writing your own method (no Arrays.equals).
import java.util.*;
public class ArrayEquals {

    static boolean arrayEqual(int[] arr1, int[] arr2){
        if(arr1.length != arr2.length){
            return false;
        }
        for(int i = 0; i<arr1.length; i++){
            if(arr1[i] != arr2[i]){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args)
    {
        int[] a = {1,2,3,4,5};
        int[] b = {1,2,3,4,5};
        int[] c = {4,3,6};
        int[] d = {};

        System.out.println(arrayEqual(a,b));//true
        System.out.println(arrayEqual(a,c));//false
        System.out.println(arrayEqual(c,d));//false
        System.out.println(arrayEqual(c,b));//false
    }
}

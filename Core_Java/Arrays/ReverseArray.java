//Print the array in reverse order without creating a new array.
import java.util.Scanner;
import java.util.Arrays;

public class ReverseArray{

    static void reversearraydemo(int[] arr){
        int left = 0;
        int right = arr.length-1;

        while(left < right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        } 
    }
    public static void main(String[] args){
        int[] a = {52,3,1,45,32};
        reversearraydemo(a);
        System.out.println(Arrays.toString(a));

        int[] b = {1,2,3,4,5,6};
        reversearraydemo(b);
        System.out.println(Arrays.toString(b));

        int[] c = {9};
        reversearraydemo(c);
        System.out.println(Arrays.toString(c));

    }
}
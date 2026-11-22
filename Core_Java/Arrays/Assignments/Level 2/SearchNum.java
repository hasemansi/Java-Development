//	1. Search for a number entered by the user and print its index, or "not found".
import java.util.*;

public class SearchNum{
    public static void main(String[] args)
    {
        int[] arr = {10,20,30,40,50,60,30};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number to find index : ");
        int num = sc.nextInt();

        int index  = -1;

        for(int i = 0; i<arr.length; i++){
            if(arr[i] == num){
                index = i;
                break;
            }
        }

        if(index == -1){
            System.out.println("Element not found...");
        }
        else{
            System.out.println("Element found at index : " + index);
        }
    }
}
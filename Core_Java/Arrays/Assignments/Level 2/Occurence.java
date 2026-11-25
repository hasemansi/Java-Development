//find first and last occurence of 
import java.util.*;
public class Occurence {
    public static void main(String[] args)
    {
        int[] arr = {1,2,4,3,2,5,6,3,7,8,9,3};

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the elemnet to find the occurence : ");
        int target = sc.nextInt();

        int firstIndex = -1;
        int lastIndex = -1;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] == target){
                if(firstIndex == -1){
                    firstIndex = i;
                }
                lastIndex = i;
            }
        }

        if (firstIndex == -1) {
            System.out.println(target + " not found in the array");
        } else {
            System.out.println("First occurrence at index: " + firstIndex);
            System.out.println("Last occurrence at index: " + lastIndex);
        }
        sc.close();
    }
}

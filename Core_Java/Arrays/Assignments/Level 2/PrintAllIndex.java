//Print all indexes where a given element occurs.

import java.util.Scanner;

public class PrintAllIndex {
    public static void main(String[] args)
    {
        int[] arr = {10,20,30,40,50,60,30};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number to find index : ");
        int num = sc.nextInt();

        boolean found = false;

        for(int i = 0; i<arr.length; i++){
            if(arr[i] == num){
                System.out.println("Found at Index : " + i);
                found = true;
            }
        }

        if(!found){
            System.out.println("Element not found...");
        }
    }
}
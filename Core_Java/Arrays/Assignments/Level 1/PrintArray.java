//1. Declare an int[] of size 5, take values from the user with Scanner, and print them.

import java.util.Scanner;
public class PrintArray{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[5];

        //take values from user input
        for(int i = 0; i<arr.length; i++){
            System.out.println("Enter "+(i+1)+ " Element :");
            arr[i] = sc.nextInt();
        }

        //print array
        for(int a : arr){
            System.out.print(a + " ");
        }
    }
}
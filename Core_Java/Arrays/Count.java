//count how many even and how many odd numbers are in an array.
import java.util.Scanner;

public class Count {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Size of array : ");
        int n = input.nextInt();

        if(n <= 0){
            System.out.println("Size must be positive");
            input.close();
            return;
        }
        int[] numbers = new int[n];

        for(int i = 0; i < numbers.length; i++){
            System.out.println("Enter " + (i + 1) +" number : ");
            numbers[i] = input.nextInt();
        }

        int evenCount = 0;
        int oddCount = 0;

        for(int num : numbers){
            if(num % 2 == 0){
                evenCount ++;
            }
            else{
                oddCount ++;
            }
        }
        System.out.println("Even Count : " + evenCount);
        System.out.println("Odd Count : " +  oddCount);

        input.close();
    }
}

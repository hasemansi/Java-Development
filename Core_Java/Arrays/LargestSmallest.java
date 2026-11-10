//Find the largest and smallest element in an array.
import java.util.Scanner;

public class LargestSmallest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Size of Array : ");
        int n = sc.nextInt();

        if(n<=0){
            System.out.println("Size must be positive...");
            return;
        }

        int[] numbers = new int[n];

        for(int j = 0; j < numbers.length; j++){
            System.out.println("Enter " + (j + 1 ) + " number : ");
            numbers[j] = sc.nextInt();
        }

        int max = numbers[0];
        int min = numbers[0];

        for(int i = 1; i < numbers.length; i++){
            if(numbers[i] > max){
                max = numbers[i];
            }

            if(numbers[i] < min){
                min = numbers[i];
            }
        }

        System.out.println("Largest Of Array : " + max);
        System.out.println("Smallest Of Array : " + min);

        sc.close();
    }
}
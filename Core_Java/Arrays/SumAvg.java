//Take n numbers from the user and print their sum and average.
import java.util.Scanner;
public class SumAvg {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);

        System.out.println("Enter the size of array : ");
        int n = sc.nextInt();

        if(n<=0){
            System.out.println("Size must be positive....");
            return;
        }

        int[] nums = new int[n];

        for(int i = 0; i<nums.length; i++){
            System.out.println("Enter " + (i+1) + " number : ");
            nums[i] = sc.nextInt();
        }


        int sum = 0;
        for(int num : nums){
            sum += num; 
        }

        double avg = (double) sum / n;

        // System.out.println(nums[0]); //1
        // System.out.println(7/2); //3
        // System.out.println(7/2.0); //3.5
        // System.out.println((double) 7/2); 
        // System.out.println((double)(7/2));


        System.out.println("Sum of Array : " + sum);
        System.out.println("Average of Array : " + avg);
    }
}

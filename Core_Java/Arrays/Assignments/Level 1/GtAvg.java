//6.Print all elements that are greater than the average
import java.util.*;
public class GtAvg {

    static double average(int[] arr) 
    {
        if (arr.length == 0) {
            return 0;
        }

        int sum = 0;
        for (int value : arr) sum += value;
        return (double) sum / arr.length;
    }

    static void printgreaterthanAvg(int[] arr)
    {
        double avg = average(arr);
        System.out.printf("Average is : %.2f%n" , avg);

        System.out.println("Elements greater than avg");

        boolean flag = false;
        for(int value : arr){
            if(value > avg){
                System.out.print(value + " ");
                flag = true;
            }
        }
        if(!flag){
            System.out.println("Not Found..");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr = {5,2,7,8,9,4,10};
        System.out.println("Array : " + Arrays.toString(arr));

        printgreaterthanAvg(arr);
        printgreaterthanAvg(new int[]{7,7,7,7}); 
        printgreaterthanAvg(new int[]{9});
        printgreaterthanAvg(new int[]{});        
    }
}

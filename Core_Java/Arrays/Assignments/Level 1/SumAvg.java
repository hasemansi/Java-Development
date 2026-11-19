//4.Find the sum and average of all elements.
import java.util.*;

public class SumAvg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] marks = new int[6];

        //print values in array
        for(int i = 0;i<marks.length; i++){
            System.out.println("Enter "+(i+1)+" Subject Marks : ");
            marks[i] = sc.nextInt();
        }

        //print Array
        System.out.println(Arrays.toString(marks));

        //Find Sum and Average
        int sum = 0;
        for(int s : marks){
            sum += s;
        }
        System.out.println("Sum of Array : "+sum);

        double avg = (double)sum / marks.length;

        System.out.println("Average of Array : "+avg);
    }
}

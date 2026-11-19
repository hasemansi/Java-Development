//7.Count how many elements are positive, negative and zero.
import java.util.*;
public class Count {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[8];

        //add values into array
        for(int i = 0; i<arr.length; i++){
            System.out.println("Enter "+(i+1)+" element : ");
            arr[i] = sc.nextInt();
        }

        int PositiveCount = 0;
        int NegativeCount = 0;
        int ZeroCount = 0;

        for(int a : arr){
            if(a > 0){
                PositiveCount += 1;
            }
            else if(a < 0){
                NegativeCount += 1;
            }
            else{
                ZeroCount += 1;
            }
        }

        System.out.println("Positive Elements Count : "+ PositiveCount);
        System.out.println("Negative Elements Count : "+ NegativeCount);
        System.out.println("Zero Elements Count : "+ ZeroCount);
    }
}

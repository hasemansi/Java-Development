//2. Print all elements of an array using a normal for loop, a for-each loop and Arrays.toString().
import java.util.Arrays;

public class PrintArray2 {
    public static void main(String[] args) {
        int[] num = {1,2,3,4,5};

        //normal for loop
        System.out.println("Print Array using normal for loop : ");
        for(int i = 0; i<num.length; i++){
            System.out.print(num[i] + " ");
        }
        System.out.println();

        System.out.println("Print Array using for-each loop");
        //for-each loop
        for(int n : num){
            System.out.print(n + " ");
        }
        System.out.println();

        System.out.println("Print Array using Arrays.toString()");
        //Arrays.toString()
        System.out.print(Arrays.toString(num));
    }
}

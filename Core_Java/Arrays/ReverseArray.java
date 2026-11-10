//Print the array in reverse order without creating a new array.
import java.util.Scanner;

public class ReverseArray{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of array : ");
        int n = sc.nextInt();

        if(n <= 0){
            System.out.println("Size must be positive");
            sc.close();
            return;
        }

        int[] marks = new int[n];
        for(int i = 0; i < marks.length; i++){
            System.out.println("Enter : " + (i + 1) + " number : ");
            marks[i] = sc.nextInt();
        }

        System.out.println("Array in Reverse Order : ");
        for(int j = marks.length - 1; j >= 0; j--){
            System.out.print(marks[j] + " ");
        }
        sc.close();
    }
}
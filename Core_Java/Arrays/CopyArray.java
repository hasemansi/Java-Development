//Copy one array into another manually (without Arrays.copyOf or clone).
import java.util.Scanner;

public class CopyArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the size of array : ");
        int n = input.nextInt();

        if(n <= 0){
            System.out.println("size must be positive...");
            input.close();
            return;
        }

        int[] source = new int[n];
        for(int i = 0; i < source.length; i++){
            System.out.println("Enter : " + (i + 1) + " number : ");
            source[i] = input.nextInt();
        }

        int[] copy = new int[source.length];
        
        for(int j = 0; j < copy.length; j++){
            copy[j] = source[j];
        }

        System.out.println("Sorce Array : ");
        for(int s : source){
            System.out.print(s + " ");
        }
        System.out.println();

        System.out.println("Copied Array : ");
        for(int c : copy){
            System.out.print(c + " ");
        }

        input.close();
    }
}

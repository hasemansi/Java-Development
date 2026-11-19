//5. Print only the elements at even indexes, then only those at odd indexes.
import java.util.*;
public class IndexPrint {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8};
        
        //print array
        System.out.println(Arrays.toString(arr));

        //element at even index
        System.out.println("Element at Even Index : ");
        for(int i = 0; i<arr.length; i++){
            if( i % 2 == 0){
                System.out.print(arr[i] + " ");
            }
        }

        System.out.println();

        System.out.println("Element at Odd Index : ");
        for(int i = 0; i<arr.length; i++){
            if( i % 2 != 0){
                System.out.print(arr[i] + " ");
            }
        }
    }
}

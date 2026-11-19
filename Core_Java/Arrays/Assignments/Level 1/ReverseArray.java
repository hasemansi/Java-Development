//3.Print the array in reverse order without modifying it.
public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50};
        
        //printing array in reverse order
        System.out.println("Array elements in reverse order");
        for(int i = arr.length-1; i>=0; i--){
            System.out.print(arr[i] + " ");
        }
    }
}

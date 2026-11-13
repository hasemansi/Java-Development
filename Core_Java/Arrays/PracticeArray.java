public class PracticeArray {
    public static void main(String[] args){
        int arr[] = {10,20,30,40};
        // for(int i = 0; i < arr.length; i++){
        //     System.out.println(arr[i]);
        // }

        // For-Each loop
        //It’s cleaner and safer when you only need to read every element in order.

        for(int x : arr){
            System.out.println(x);
        }

        // Why for-each cannot modify elements by index

        // Two reasons:

        // There is no index. You never know which position you’re on.
        // The loop variable is a copy. For primitives, x holds a copy of the value, so assigning to it changes only the copy.

        int arr1[] = {1,2,3,4};
        for(int x : arr1){
            x = x * 2;  // changes only the local copy
            System.out.println(x); // 2 4 6 8
        }

        System.out.println(arr1[0]); // 1

        for(int i = 0; i < arr1.length; i++){
            arr1[i] *= 3; // modifies the actual array
        }
        
        for(int j = 0; j < arr1.length; j++){
            System.out.println(arr1[j]);
        }

        // ArrayIndexOutOfBoundsException

        // Thrown at runtime when you access an index outside 0 … length-1.

        int[] num = new int[5];

        num[5] = 1;
        num[-1] = 1;
    }
}

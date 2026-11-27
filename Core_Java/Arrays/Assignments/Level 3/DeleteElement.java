import java.util.Arrays;

public class DeleteElement {

    public static int[] deleteAt(int[] arr, int pos)
    {
        int n = arr.length;

        int[] result = new int[n - 1];

        //step 1
        for(int i = 0; i < pos; i++){
            result[i] = arr[i];
        }

        //step 2
        for(int i = pos; i < n - 1; i++){
            result[i] = arr[i + 1];
        }

        return result;
    }

    public static void main(String[] args)
    {
        int[] num = {1,2,3,4,5};
        System.out.println(Arrays.toString(num));

        num = deleteAt(num, 2);
        System.out.println(Arrays.toString(num));
    }
}

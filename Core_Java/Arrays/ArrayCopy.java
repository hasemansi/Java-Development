import java.util.Arrays;
public class ArrayCopy {
    
    static int[] copyArray(int[] src){
        int[] dest = new int[src.length];
        for(int i = 0; i < src.length; i++){
            dest[i] = src[i];
        }
        return dest;
    }

    public static void main(String[] args){
        int[] source = {10,20,30,40,50};

        // 1. Proper copy

        //int[] copy = copyArray(source);   // creates a second array

        // source ──► [10, 20, 30, 40, 50]
        // copy     ──► [10, 20, 30, 40, 50]   (separate array, independent)

        
        int[] copy = copyArray(source);
        copy[0] = 90;

        System.out.println("Source Array : " + Arrays.toString(source)); // Source Array : [10, 20, 30, 40, 50]
        System.out.println("Copied Array :" + Arrays.toString(copy)); // Copied Array :[90, 20, 30, 40, 50]

        // 2. Reference Assignment - Not a copy 

        // int[] alias = source;   // copies the reference only

        // source ──┐
        //         ├──► [10, 20, 30, 40, 50]   (one array in memory)
        // alias    ──┘

        int[] alias = source;
        alias[1] = 87;

        System.out.println("Source Array : " + Arrays.toString(source)); // Source Array : [10, 87, 30, 40, 50]
        System.out.println("Reference Array :" + Arrays.toString(alias)); // Reference Array :[10, 87, 30, 40, 50]
    }
}

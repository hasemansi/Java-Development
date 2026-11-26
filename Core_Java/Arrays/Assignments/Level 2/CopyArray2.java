//	5. Prove that int[] b = a; does not copy the array. Change b and print a.
import java.util.*;
public class CopyArray2 {
    public static void main(String[] args)
    {
        int[] a = {1,2,3,4,5};
        int[] b = a;

        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));

        a[0] = 90;

        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));

        b[1] = 78;

        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
    }
}

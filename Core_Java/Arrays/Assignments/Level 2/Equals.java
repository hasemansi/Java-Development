//	6. Compare two arrays using ==, .equals() and Arrays.equals(), and print all three results.
import java.util.*;

public class Equals {
    public static void main(String[] args)
    {
        int[] a = {1,2,3,4,5};
        int[] b = a;
        int[] c = Arrays.copyOf(a, a.length);

        System.out.println(a == b); //true
        System.out.println(a == c);

        System.out.println(a.equals(b));
        System.out.println(a.equals(c));

        a[0] = 90;

        System.out.println(Arrays.equals(a,b));
        System.out.println(Arrays.equals(a,c));
    }
}

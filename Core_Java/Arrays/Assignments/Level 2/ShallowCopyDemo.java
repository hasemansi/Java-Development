import java.util.*;

public class ShallowCopyDemo {
    public static void main(String[] args) {

        // ---------- String[] ----------
        String[] s1 = {"apple", "banana", "cherry"};
        String[] s2 = Arrays.copyOf(s1, s1.length);   // shallow copy

        s1[0] = s1[0] + " pie";   // creates a NEW String, s1[0] now points to it

        System.out.println("s1: " + Arrays.toString(s1));
        System.out.println("s2: " + Arrays.toString(s2));

        // ---------- StringBuilder[] ----------
        StringBuilder[] sb1 = {
            new StringBuilder("apple"),
            new StringBuilder("banana"),
            new StringBuilder("cherry")
        };
        StringBuilder[] sb2 = Arrays.copyOf(sb1, sb1.length);   // shallow copy

        sb1[0].append(" pie");    // modifies the SAME StringBuilder object in place

        System.out.println("sb1: " + Arrays.toString(sb1));
        System.out.println("sb2: " + Arrays.toString(sb2));

        System.out.println(sb1[0] == sb2[0]);   // true -> same object
        System.out.println(sb1 == sb2);         // false -> different arrays
    }
}
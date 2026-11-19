//12.Print the default values of arrays of every type: int, double, boolean, char, String
public class DefaultValueArr {
    public static void main(String[] args)
    {
        System.out.println("Integer Array: ");
        int [] IntArr = new int[5];
        for(int  i : IntArr){
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.println("Double Type Array: ");
        double [] DoubleArr = new double[5];
        for(double  d : DoubleArr){
            System.out.print(d + " ");
        }
        System.out.println();

        System.out.println("Boolean Type Array: ");
        boolean [] BoolArr = new boolean[5];
        for(boolean  i : BoolArr){
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.println("String Type Array: ");
        String [] StringArr = new String[5];
        for(String  i : StringArr){
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.println("Char Type Array: ");
        char [] CharArr = new char[5];
        for(char  i : CharArr){
            System.out.print(i + " ");
        }
    }
}
// Output
// Integer Array: 
// 0 0 0 0 0 
// Double Type Array: 
// 0.0 0.0 0.0 0.0 0.0 
// Boolean Type Array: 
// false false false false false 
// String Type Array: 
// null null null null null 
// Char Type Array: 
     
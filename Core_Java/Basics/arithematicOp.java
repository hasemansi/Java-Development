public class arithematicOp {
    public static void main(String[] args) {
        int num1 = 12;
        // int num2 = 7;

        // int result = num1 % num2;
        // System.out.println(result);

        num1 = num1 + 10;
        System.out.println(num1);

        int a = 5;
        a += 1;
        System.out.println(a);

        a++;
        System.out.println(a);

        int b = 10; 
        int res = b++; // first fetch the value then increment
        System.out.println(res); //10

        int c = 10;
        int res2 = ++c; // first increment value and then fetch the value
        System.out.println(res2); //11

    }
}
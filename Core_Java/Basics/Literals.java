public class Literals {
    public static void main(String[] args){
        // int num = 10;
        // byte x = 2;
        // short y = 20;
        // long z = 100000L;

        // float b = 1.5f;
        // double a = 20;
        // char ch = 'A';
        // char ch1 = '1';

        // String str = "Hello";

        // System.out.println(num +"\n" + x + "\n" + y + "\n" + z);
        // System.out.println(b + "\n" + a + "\n" + ch + "\n" + ch1 + "\n" + str);

        int num1 = 0b101; //5 literal binary
        System.out.println(num1);

        int hex = 0x1A; //26 literal hexadecimal
        System.out.println(hex);

        int num2 = 100_00_000; //10000000 literal with underscores
        System.out.println(num2);

        double num3 = 58;
        System.out.println(num3);

        double num4 = 12e10; // 12 * 10^10
        System.out.println(num4);

        char ch = 'A';
        ch++;
        System.out.println(ch);
    }
}
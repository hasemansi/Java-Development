public class TypeConversion {
    public static void main(String[] args) {
        //byte a = 10;
        // int b = a; // Implicit type conversion (byte to int)
       // System.out.println("Byte value: " + a);
        // System.out.println("Int value: " + b);

        int a = 50;
        // byte b = a; 
        // incompatible types: possible lossy conversion from int to byte
        // byte b = a; // Explicit type conversion (int to byte)
        byte b = (byte) a; // Explicit type conversion (int to byte)

        System.out.println("Int value: " + a);

        System.out.println("Byte value: " + b);

        byte x = 10;
        byte y = 50;

        int res = x * y; // Implicit type conversion (byte to int)
        System.out.println("Result: " + res); // 500

    }
}

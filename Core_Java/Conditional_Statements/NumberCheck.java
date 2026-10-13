// Positive, Negative, or Zero — Basic
// Write a program that takes a number as input and determines whether it is positive, negative, or zero.
public class NumberCheck {
    public static void main(String[] args)
    {
        int num = 0;

        if(num > 0){
            System.out.println("Positive Number...");
        }
        else if(num < 0){
            System.out.println("Negative Number...");
        }
        else {
            System.out.println("Number is Zero");
        }
    }
}
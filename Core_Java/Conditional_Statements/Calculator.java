// Simple Calculator — Intermediate
// Accept two numbers and an operator (+, -, *, /, %). Use a switch statement to perform the selected operation. Handle division by zero and invalid operators.
import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter First Number:");
        double n1 = sc.nextDouble();

        System.out.println("Enter Second Number:");
        double n2 = sc.nextDouble();

        System.out.println("Enter an Operator (+, -, /, *, %) :");
        char operator = sc.next().charAt(0);

        switch (operator) {
            case '+' -> System.out.println("Result : " + (n1 + n2));
            case '-' -> System.out.println("Result : " + (n1 - n2));
            case '/' -> {
                if(n2 != 0){
                    System.out.println("Result : " + (n1 / n2));
                }
                else{
                    System.out.println("cannot divisible by zero:");
                }
            }
            case '*' -> System.out.println("Result : " + (n1 * n2));
            case '%' -> System.out.println("Result : " + (n1 % n2));
            default -> System.out.println("Invalid Operation");
        }
        sc.close();
    }
}

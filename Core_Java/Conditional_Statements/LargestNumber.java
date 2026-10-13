// Largest of Three Numbers — Basic
// Accept three integers and determine the largest number using conditional statements.
public class LargestNumber {
    public static void main(String[] args) {
        int a = 30;
        int b = 40;
        int c = 35;

        if(a > b && a > c){
            System.out.println("a is Largest...");
        }
        else if(b > c){
            System.out.println("b is Largest...");
        }
        else {
            System.out.println("c is Largest...");
        }
    }
}

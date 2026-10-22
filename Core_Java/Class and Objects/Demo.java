class Calculator{
    public int Add(int n1,int n2){
        return n1 + n2;
    }
}
public class Demo{
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 35;

        Calculator calc = new Calculator();

        int result = calc.Add(num1, num2);


        // double result = num1 + num2;

        System.out.println(result);
    }
}
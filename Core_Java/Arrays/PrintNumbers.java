//Create an array of 10 integers and print all elements using a for loop and then a for-each loop.
public class PrintNumbers{
    public static void main(String[] args)
    {
        int[] num = new int[10];
        for(int i = 0; i<num.length; i++ ){
            num[i] = i + 1;
        }

        System.out.println("Using for loop:");
        for(int i = 0; i < num.length; i++){
            System.out.print(num[i] + " "); 
        }
        System.out.println();

        System.out.println("Using for each loop:");
        for(int n : num){
            System.out.print(n + " ");
        }
    }
}
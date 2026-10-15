public class Factorial {
    public static void main(String[] args){
        int num = 6;
        double fact = 1;
       
        if(num < 0){
            System.out.println("Factorial is not defined for Negative Numbers");
            
        }
        else{
            for(int i=1; i<=num; i++){
                fact *=i;
            }
            System.out.println("Factorial is : "+ fact);
        }
    }
}

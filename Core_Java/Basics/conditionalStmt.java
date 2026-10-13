public class conditionalStmt {
    public static void main(String[] args){
        int x = 7;
        int y = 22;
        int z = 99;

        if(x>y && x>z){
            System.out.println("x is greater");
        }
        else if(y>z){
            System.out.println("y is greater");
        }
        else{
            System.out.println("z is greater");
        }
    }
}

class Calculator {
    int num = 5;
    public int add(int n1, int n2){
        return n1+2;
    }
}

public class StackHeap {
    public static void main(String[] args){

        Calculator obj = new Calculator();
        Calculator obj1 = new Calculator();

        int r1 = obj.add(10,20);
        //System.out.println(r1);

        obj.num = 8;
        System.out.println(obj.num);
        System.out.println(obj1.num);

    }
}

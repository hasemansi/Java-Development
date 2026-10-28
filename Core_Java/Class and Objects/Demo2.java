class Calc {
    public int add(int n1,int n2){
        return n1+n2;
    }

    public int add(int n1,int n2, int n3){
        return n1+n2+n3;
    }

    public double add(double n1,int n2){
        return n1+n2;
    }
}

public class Demo2 {
    public static void main(String[] args) {
        Calc obj = new Calc();

        int r1 = obj.add(12,34);
        System.out.println(r1);

        int r2 = obj.add(10,20,30);
        System.out.println(r2);

        double r3 = obj.add(12,34);
        System.out.println(r3);
    }
}

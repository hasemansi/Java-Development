class TestClass{
    public void printMessage()
    {
        System.out.println("Hello Mansi..!");
    }

    public int printNum(int a){
        return a;
    }
}
public class demoMethod{
    public static void main(String[] args){
        int num = 12;

        TestClass obj = new TestClass();
        
        obj.printMessage();
        int result = obj.printNum(num);
        System.out.println(result);

    }
}
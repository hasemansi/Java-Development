public class Demo {
    public static void main(String[] args){
        String name  = "Hello";
        System.out.println(name);
        System.out.println(name.hashCode());

        System.out.println(name.concat("reddy"));

        //Mutable vs Immutable

        String s1 = "Mansi";
        String s2 = "Mansi";

        System.out.println(s1==s2);
        
    }
}

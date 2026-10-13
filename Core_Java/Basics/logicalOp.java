public class logicalOp {
    public static void main(String[] args){
        // int a = 10;
        // int b = 20;
        // int x = 15;
        // int y = 25;

        // System.out.println(a > b && x > y);
        // System.out.println(a < b && x > y);
        // System.out.println(a <= b && x >= y);

        // System.out.println(a > b || x > y);
        // System.out.println(a < b || x > y);
        // System.out.println(a <= b || x >= y);

        // Suppose a company requires:
        // - Age >= 18
        // - Java knowledge
        // - Either React OR Angular knowledge

        //Example 1:
        // int age = 22;
        // boolean javaKnowledge = false;
        // boolean React = false;
        // boolean Angular = true;

        // boolean eligible = age >= 18 &&  javaKnowledge && (React || Angular);

        // System.out.println(eligible);

        //Example 2:
        // int x = 10;
        // int y = 20;

        // System.out.println(x < y && y > 15); //true

        //Example 3:
        // int x = 10;

        // System.out.println(x > 20 || x < 15 && x == 10); //true based on operator precedence
        //&& has higher precedence than ||

        //Write a Java program that checks whether a person is eligible for a job.

        int age = 20;
        boolean KnowsJava = true;
        int experience = 0;

        boolean eligibility = age >= 18 && KnowsJava && experience > 1;
        System.out.println("Eligible for Job....? "+eligibility);


    }
}

//8.Create a String[] of 5 names and print each name with its length.

public class StringArray {
    public static void main(String[] args){
        String[] names = {"Mansi", "Sakshi", "Tejas","Rushikesh","Saurabh"};

        System.out.println("String with length of each name");
        for(String name : names){
            System.out.print(name + " : " + name.length());
            System.out.println();
        }
    }
}

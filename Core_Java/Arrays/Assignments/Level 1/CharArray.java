// 10.Create a char[] from the string "hello" and print each character with its index.
public class CharArray {
    public static void main(String[] args)
    {
        String str = "hello";

        char[] ch = str.toCharArray();

        //printing each character with its index
        for(int i = 0; i<ch.length; i++){
            System.out.print("Index "+ i +": "+ch[i]);
            System.out.println();
        }
    }
}

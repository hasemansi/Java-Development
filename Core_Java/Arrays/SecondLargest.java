public class SecondLargest {

    static int secondlargestdemo(int[] arr){
        int max = arr[0];
        int second = Integer.MIN_VALUE;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] > max){
                second = max;
                max = arr[i];
            }
            else if(arr[i] > second){
                second = arr[i];
            }
        }
        return second;
    }
    public static void main(String[] args){

        int[] a1 = {2,4,1,8,6};
        System.out.println("Second Largest is: " + secondlargestdemo(a1));
    }
}

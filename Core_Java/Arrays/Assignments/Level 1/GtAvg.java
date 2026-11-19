//6.Print all elements that are greater than the average
public class GtAvg {
    public static void main(String[] args) {
        int[] arr = {5,2,7,8,9,4,10};
        
        int sum = 0;
        for(int s : arr){
            sum += s;
        }

        double avg = Math.round(((double) sum / arr.length) * 100.0) / 100.0;

        System.out.println("Average is : "+ avg);

        //print elements greater than avg
        System.out.println("Elemets Greater than Average : ");
        for(int i = 0; i<arr.length; i++){
            if(arr[i] > avg){
                System.out.print(arr[i] + " ");
            }
        }
    }
}

public class LinearSearch {
    // Returns the index of the first occurrence of target, or -1 if not found
    static int linearsearch(int[] arr, int target){
        for(int i = 0; i<arr.length; i++){
            if(arr[i] == target)
                return i;
        }
        return -1;
    }

    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,4,2};

        int index = linearsearch(arr,3);

        System.out.println("Search 3 -> index: " + index); 

        int target = 5;
        int result = linearsearch(arr , target);
        if(result != -1){
            System.out.println(target + " found at index " + result);
        }
        else
            System.out.println(target + " not found"); 
    }
}

public class LinearSearch{

    static int linearsearch(int[] arr, int target){
        for(int i = 0; i<arr.length; i++){
            if(arr[i] == target)
                return i;
        }
        return -1;
    }

    public static void main(String[] args){
        int[] arr1 = {1,2,3,4,5,2,5};

        int index = linearsearch(arr1,2);
        System.out.println("Search 2 -> index : " + index);

        int target = -4;
        int result = linearsearch(arr1,target);

        if(result != -1){
            System.out.println(target + " found at " + result);
        }
        else{
            System.out.println(target + " Not found");
        }
    }
}
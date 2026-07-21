package Array;

public class linearsearchex {
    // search an array. if you find element return its index 
    // if element not found return -1

    public static void main(String[] args) {
        int[] arr = {12,24,14,45,34,78};
        int target = 14;
        System.out.println(search(arr,target));
    }
    static int search(int[] arr, int target){
        if(arr.length == 0){
            return -1;
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i] == target){
                return arr[i];
            }
        }
        return -1;
    }
}

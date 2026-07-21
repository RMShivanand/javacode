package Array;

import java.util.Arrays;

public class selectionsort1 {
    public static void main(String[] args) {
        int[] arr = { 5,4,3,2,100,-1,-20};
        select(arr);
        System.out.println(Arrays.toString(arr));
        
    }
    static void select(int[] arr){
        for(int i=0;i<arr.length;i++){
            // find the maximum item in the remaining array swap with correct index
            int last = arr.length - i - 1;
            int maxIndex = getMaxIndex(arr,0,last);
            swap(arr, maxIndex, last);
            
        }
    }
    static int getMaxIndex(int[] arr, int start, int end){
        int max = start;
        for(int i = start; i<=end;i++){
            if(arr[i]>arr[max]){
                max = i;
            }
        }
        return max;
    }
    static void swap(int[] arr,int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}

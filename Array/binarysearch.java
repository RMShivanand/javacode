package Array;

public class binarysearch {
    public static void main(String[] args) {
        int[] arr = {-12,-8,-4,-1,0,2,4,8,12,18,20};
        int target = 12;
        int ans = binarySearch(arr , target);
        System.out.println(ans);
    }

    static int binarySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;

        while(start <= end){
            // find mid value
            int mid = start +(end - start) / 2;

            if(target<arr[mid]){
                end = mid - 1;
            }
            else if(target>arr[mid]){
                start = mid + 1;
            }
            else{
                return mid; 
            }
        }
        return -1;
    }
    
}

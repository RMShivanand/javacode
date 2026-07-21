package Array;

public class orderagnostic {
    public static void main(String[] args) {
        // int[] arr={-12,-8,-4,-1,0,2,4,8,12,18,20};
        int[] arr = {99,90,80,70,50,30,20,10,1};
        int target = 20;
        int ans = orderbs(arr, target);
        System.out.println(ans);
    }
    static int orderbs(int[] arr, int target){
        int start =0;
        int end = arr.length - 1;
        boolean isAsc = arr[start] < arr[end];

        while(start <= end ){
            int mid = start + (end - start) /2;
            if(arr[mid] == target){
                return mid;
            }
             
            if(isAsc){
                if(target < arr[mid]){
                    end = mid - 1;
                }else{
                    start = mid + 1;
                }
            }
            else{
                if(target > arr[mid]){
                      end = mid - 1;
                }
                else{
                    start = mid + 1;
                }
            }
        }
        return -1;  
    }
}

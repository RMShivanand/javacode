package DSA;

public class mountain {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,6,7,4,2,0};
        System.out.println(exmount(arr));

        
    }
    static int exmount(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while(start < end){
            int mid = start + (end - start)/2;
            if(arr[mid]<arr[mid+1]){
                start = mid + 1;
            }else{
                end = mid;
            }
        }
        //in the end start == end pointing to the largest number
        // because start and end always try to find the largest number in the above 2 checks 
        //
        return start;
    }
    
}

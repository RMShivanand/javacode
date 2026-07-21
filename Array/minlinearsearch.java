package Array;

public class minlinearsearch {
    public static void main(String[] args) {
        int[] arr= {12,34,7,23,4,1,8,-2,9,5};
        System.out.println(minimum(arr));
    }
    static int minimum(int[] arr){
        int min = arr[0];
       
        for(int i = 0;i<arr.length;i++){
            if(arr[i]<min){
                min = arr[i];
            }
        }
       return min; 
    }
}

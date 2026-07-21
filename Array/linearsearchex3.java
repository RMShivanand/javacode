package Array;

public class linearsearchex3 {
    public static void main(String[] args) {
        int[] arr = {12,34,-7,-3,3,4,-9,10};
        int target = 3;
        System.out.println(search(arr,target,1,5));
        
    }
      static int search(int[] arr, int target,int start, int end){
        if(arr.length == 0){
            return -1;
        }
        for(int i=start;i<end;i++){
            if(arr[i] == target){
                return i;
            }
        }
        return -1;
    }
}

package Array;

public class d2max {
    public static void main(String[] args) {
         int[][] arr = {
            {1,2,3,4},
            {23,403,5},
            {12,32,87}
        };
        System.out.println(maximum(arr));
    }
    static int maximum(int[][] arr){
        int max = arr[0][0];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if(arr[i][j]>max){
                    max = arr[i][j];
                }
            }
        }
        return max;
    }
}

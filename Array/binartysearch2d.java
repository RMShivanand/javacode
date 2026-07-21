package Array;

import java.util.Scanner;
import java.util.Arrays;

public class binartysearch2d {
    public static void main(String[] args) {
        System.out.print("Enter target: ");
        Scanner s = new Scanner(System.in);

        int[][] arr = {
            {10,20,30,40},
            {15,25,35,45},
            {28,29,37,49},
            {33,34,48,50}
        };
        int target = s.nextInt();
        System.out.println(Arrays.toString(search(arr,target)));
        s.close();
    }
    static int[] search(int[][] arr, int target){
        int r = 0;
        int c = arr.length - 1;

        while(r < arr.length && c >= 0){
            if(arr[r][c] == target ){
                return new int[]{r,c};
            }else if(arr[r][c] < target){
                r++;
            }else{
                c--;
            }
        }
        return new int[]{-1,-1};
    }
}

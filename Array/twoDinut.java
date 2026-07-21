package Array;
import java.util.Scanner;
// import java.util.Arrays;
public class twoDinut {
    public static void main(String[] args) {

        // // this is primary thing of creating the multidimentional array
        //  int[][] arr =  {
        //     {1,2,3},
        //     {4,5},
        //     {6,100000,8,9}
        // };
        // System.out.println(arr[2][1]);

        // creating a multidimensional array by taking input from user
        System.out.println("Enter your 2d array: ");
        Scanner s = new Scanner(System.in);
        int[][] arr = new int[3][3];
        // it is best practice;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j]=s.nextInt();
                
                System.out.print(arr[i][j] + " ");
            }
          System.out.println();
        }

        // The is code is really correct but the best practice is above one

        // for(int i=0;i<arr.length;i++){
        //     for(int j=0;j<arr[i].length;j++){
        //         arr[i][j]=s.nextInt();
        //     }
        // }
        // System.out.println(Arrays.deepToString(arr));

       s.close();
    }
}

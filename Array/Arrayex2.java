package Array;

import java.util.Arrays;
import java.util.Scanner;
public class Arrayex2 {
    public static void main(String[] args) {
        // int[] arr = {1,2,3,4};
        // System.out.println(Arrays.toString(arr));
        
        // when you need a input
        System.out.println("Enter a required Array list:");
        Scanner s = new Scanner(System.in);
        int[] ar = new int[3];

        for (int i=0;i<ar.length;i++){//for every element in array , print the array
            ar[i]=s.nextInt();// num reprents element of array
        }

        // it prints empty arry . all values are zero 
       
        //  for(int i = 0; i < ar.length; i++){
        //      System.out.print(ar[i]+ " ");     
        // }
        
        for(int num : ar){
            System.out.print(num +" ");
        }
        
        // so better case to print whole array use Arrays.toString(arrayname) in printing statement

        System.out.println(Arrays.toString(ar));
        Arrays.sort(ar);
        System.out.println(Arrays.toString(ar));
        s.close();
    }
    
}

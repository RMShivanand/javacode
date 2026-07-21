package Array;
import java.util.Arrays;
import java.util.Scanner;
public class funex2 {
    public static void main(String[] args) {
        System.out.println("Enter your number array :");
        Scanner s = new Scanner(System.in);

        int[] arr = new int[5];
    
        for(int i = 0;i<arr.length;i++){
            arr[i]=s.nextInt();
        }

        System.out.println(Arrays.toString(arr));
        change(arr);
        System.out.println(Arrays.toString(arr));
         s.close();
    }
    static void change(int[] a){
         a[0]=100;
         a[4]=200;
    }
   
}

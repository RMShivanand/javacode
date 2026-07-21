package Array;
import java.util.Arrays;
import java.util.Scanner;
public class arraypractice {
    public static void main(String[] args) {
        System.out.println("Enter your required array: ");;
        Scanner s = new Scanner(System.in);

        int[] arr = new int[5];

        for(int i=0;i<arr.length;i++){
            arr[i]=s.nextInt();
        }

        System.out.println(Arrays.toString(arr));
        s.close();
    }
}

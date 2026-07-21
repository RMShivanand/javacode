package Array;
import java.util.Arrays;
import java.util.Scanner;
public class inputex{
    public static void main(String[] args) {
        System.out.println("Enter your the required array's:");
        Scanner s = new Scanner(System.in);
        int[] r = new int[5];

        // for(int i=0; i < r.length; i++){
        //     r[i] = s.nextInt();
        // }
        // System.out.println(Arrays.toString(r));


        // for(int j=0; j<r.length;j++){
        //     System.out.println(r[j]+" ");
        // }

        // // same as above for loop
        // for(int a : r){
        //     System.out.println(a+ " ");
        // }

        // one more input ex
        r[0] = 14;
        r[1] = 26;
        r[2] = 37;
        r[3] = 48;
        r[4] = 59;

        System.out.println(Arrays.toString(r));
        s.close();
    }
}
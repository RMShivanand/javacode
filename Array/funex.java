package Array;
// import java.util.Scanner;
import java.util.Arrays;
public class funex {
    public static void main(String[] args) {
        int[] num = {12,23,34,56};
        System.out.println(Arrays.toString(num));
        change(num);
        System.out.println(Arrays.toString(num));
    }
    static void change(int[] a){
        a[1]=100;
    }
}

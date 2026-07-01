package javacode;
import java.util.Scanner;
public class sum {
    public static void main(String[] args) {
        System.out.println("Enter a number:");
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();

        int sum = a + b;
        System.out.println("sum of two number is:" +sum);
        
    }
}

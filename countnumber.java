package javacode;

import java.util.Scanner;

public class countnumber {
    public static void main(String[] args) {
        System.out.println("Enter a number n :");
        Scanner s = new Scanner(System.in);
        long n = s.nextLong();

        int count = 0;

        while(n>0){
            int r = (int)(n%10);
            if(r==3){
                count++;
            }
            n = n/10;
        }
        System.out.println("Total number of 3's is :"+ count);

    }
}

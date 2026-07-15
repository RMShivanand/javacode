package DSA;
// 367. Valid Perfect Square
// Given a positive integer num, return true if num is a perfect square or false otherwise.
// A perfect square is an integer that is the square of an integer. In other words, it is the product of some integer with itself.
// You must not use any built-in library function, such as sqrt.
import java.util.Scanner;
public class bsprob367 {
    public static void main(String[] args) {
        System.out.println("Enter your num: ");
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        System.out.println(result(num));
        s.close();
    }
    static boolean result(int num){
        int start = 1;
        int end = num/2;

        if(num == 0 || num == 1){
            return true;
        }
        while(start <= end){
            int mid = start + (end - start)/2;
            long square = (long) mid * mid;

            if(square == num ){
                return true;
            }else if(square > num){
                end = mid - 1;
            }else {
                start = mid +1;
            }
        }
        return false;
    }
}

package DSA;
// 69. Sqrt(x)
// Given a non-negative integer x, return the square root of x rounded down to the nearest integer. The returned integer should be non-negative as well.
// You must not use any built-in exponent function or operator.
// For example, do not use pow(x, 0.5) in c++ or x ** 0.5 in python.
 import java.util.Scanner;
public class BSPROB69 {
    public static void main(String[] args) {
        System.out.println("Enter x: ");
        Scanner s = new Scanner(System.in);
        int x = s.nextInt();
        System.out.println(sqrt(x));
         s.close();
    } 
    static int sqrt(int x){
        int start = 1;
        int end = x/2;
        int ans = 0;

        if(x==0 || x==1){
            return x;
        }

        while(start <= end){
            int mid = start + (end - start)/2;
            long square = (long) mid * mid;

            if(square == x){
                return mid;
            }else if(square > x){
                end = mid -1;
            }else{ 
                ans=mid;
                start = mid + 1;
            }
        }
        return ans;
    }
   
}

package DSA;
import java.util.Arrays;
public class twosumleetcode {
    public static void main(String[] args) {
        // here you need to write a function method code
        int[] nums = {2,3,7,3,4,5};
        int target = 9;
        System.out.println(Arrays.toString(twosum(nums,target)));
    }
    public static int[] twosum(int[] nums, int target){
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{};
    }
}

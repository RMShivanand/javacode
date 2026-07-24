package DSA;
import java.util.Arrays;
public class firstmissingpositive {
    public static void main(String[] args) {
        int[] nums = {3,1,0};
        
        System.out.println(sort(nums));
        System.out.println(Arrays.toString(nums));
    }
    static int sort(int[] nums){
        int i =0;
        while(i<nums.length){
            int correct = nums[i] - 1;
            if(nums[i] > 0 && nums[i] <= nums.length && nums[i] != nums[correct] ){
                swap(nums, i, correct);
            }else{
                i++;
            }
        }
        for(int index = 0; index < nums.length; index++){
            if(nums[index] != index + 1){
                return index+1;
            }
        }
        return nums.length+1;
    }
    static void swap(int[] arr, int start, int end){
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }
}

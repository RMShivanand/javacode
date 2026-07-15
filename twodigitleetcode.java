package DSA;

public class twodigitleetcode {
    //  Find Numbers with Even Number of Digits
    public static void main(String[] args) {
        int[] nums = {12,1,2,5478,5};
        System.out.println(two(nums));

    }
    static int two(int[] nums){
        int evencount = 0;

        for(int i = 0; i<nums.length;i++){
            int count = 0;
            int num = nums[i];

            if(num == 0){
                count = 1;
            }else{
                while(num>0){
                    num = num / 10;
                    count++;
                }
                if(count %2 == 0){
                    evencount++;
                }
            }
        }
        return evencount;
    }
      
}

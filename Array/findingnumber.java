package Array;

public class findingnumber {
    public static void main(String[] args) {
    //   check whether the number 14 is present inside the array or not
        int[] arr = {12,14,34,14,15,14,19,14};

        int count =0;

        for(int i =0;i<arr.length;i++){
            if(arr[i]==14){
                count++;
            }
        }
        System.out.println("The number of 14 is present inside the array is:  " +count);
    }
}

package DSA;

public class mirrorex {
    public static void main(String[] args) {
        int[] arr = {1,2,3,3,2,1};
        System.out.println(mirror(arr));
        // System.out.println(arr.length);
    }
    static boolean mirror(int[] arr){
        if(arr.length %2 != 0){
            return false;

        }

        int start = 0;
        int end = arr.length-1;

        while(start<end){
            if(arr[start]!=arr[end]){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}

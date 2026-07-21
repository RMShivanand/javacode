package Array;

public class maxarray {
    public static void main(String[] args) {
        int[] a = {12,34,81,45,55,10};
        System.out.println(max(a));

    }
    static int max(int[] a){
        int maxval = a[0]   ;
        for(int i = 0; i<a.length;i++){
            if(a[i]>maxval){
                maxval=a[i];
            }
        }
         return maxval;
    }
}

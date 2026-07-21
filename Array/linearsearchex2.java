package Array;

public class linearsearchex2 {
    public static void main(String[] args) {
        // find whether the targeted character is presented inside the strign or not
        String str =  "Shivanand";
        char target = 'S';
        System.out.println(search(str,target));
    }
    static boolean search(String str, char target){
        if(str.length()==0){
            return false;
        }
        for(int i =0;i<str.length();i++){
            if(target==str.charAt(i)){
                return true;
            }
        }
        return false;
    }
}

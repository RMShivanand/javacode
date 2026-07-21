package Array;
import java.util.Scanner;
import java.util.Arrays;
public class exstringarry {
    public static void main(String[] args) {
        
        System.out.println("Enter the required string array:");
        Scanner s = new Scanner(System.in);
        String st[] = new String[4];
        for(int i =0;i<st.length;i++){
            st[i]= s.next();
        }

        st[0] = "Shivanand";
        System.out.println("Here i am giving best my friend circle: " );
        System.out.println(Arrays.toString(st));
        s.close();
    }
}
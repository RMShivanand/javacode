package Array;
import java.util.ArrayList;
import java.util.Scanner;
public class listarryinput {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter list:");
        ArrayList<Integer> l = new ArrayList<>(5);

        for(int i = 0; i<5;i++){
            l.add(s.nextInt());
        }
        System.out.println(l);
        System.out.println(l.get(1));
        s.close();
    }
}

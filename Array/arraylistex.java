package Array;
import java.util.ArrayList;
import java.util.Collections;
// import java.util.Scanner;
public class arraylistex {
    public static void main(String[] args) {
        ArrayList<Integer> l = new ArrayList<>(5);
        l.add(99);
        l.add(94);
        l.add(95);
        l.add(98);
        l.add(10);
        l.add(93);
        l.add(97);
        l.add(90);
        System.out.println(l);
        l.set(0,100);
        System.out.println(l); 
        Collections.sort(l);
    }

}

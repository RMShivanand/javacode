package javacode;
import java.util.Scanner;
public class Nestedswitch {
    public static void main(String[] args) {
        System.out.print("Ente a EmpId: ");
        Scanner s = new Scanner(System.in);
        int i = s.nextInt();
        
        String d = s.next();

        switch(i){
            case 1:
                System.out.println("xyz");
                break;
            case 2:
                System.out.println("abc");
                break;
            case 3:
                
                System.out.println("Melody");
                
                switch(d){
                    case "it":
                        System.out.println("It departmeent");
                        break;
                    case "cse":
                        System.out.println("cse department");
                        break;
                    default:
                        System.out.println("enter a valid department!");
                }
                break;
            default:
                System.out.println("This id is not exist in the our company!!");
        }

    }
}



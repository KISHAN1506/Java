
import java.util.Scanner;

public class Switch_Case {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        // switch (age) {
        //     case 18:
        //         System.out.println("Just going to become an ADULT");
        //         break;

        //     case 60:
        //         System.out.println("You must retire ASAP");
        //         break;
                
        //     default:
        //         System.out.println("IDK Man");
        // }

// Enhanced Switch :
        switch (age) {
            case 18 -> System.out.println("Just going to become an ADULT");

            case 60 -> System.out.println("You must retire ASAP");
                
            default -> System.out.println("IDK Man");
        }
    }
}

import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String email = sc.nextLine();
        if(email.endsWith(".com")){
            System.out.println("Commercial Website");
        }else if(email.endsWith(".org")){
            System.out.println("Organization Website");
        }else if(email.endsWith(".in")){
            System.out.println("Indian Website");
        }else{
            System.out.println("IDK");
        }
    }
}
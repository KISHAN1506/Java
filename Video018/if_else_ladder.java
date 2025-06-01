
import java.util.Scanner;

public class if_else_ladder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();

        if(age > 50){
            System.out.println("You are very experienced");
        }else if (age > 18){
            System.out.println("You are moderately experinced");
        }else{
            System.out.println("You are not Experienced");
        }
    }
}
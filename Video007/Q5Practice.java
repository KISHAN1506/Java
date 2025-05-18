
import java.util.Scanner;

public class Q5Practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean var = sc.hasNextInt();
        if(var){
            System.out.println("Yes is an Integer");
        }else{
            System.out.println("No is not an Integer");
        }

    }
}

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum = 0;
        for(int i = 1;i <= num;i++){
            sum += 2 * i ;
        }
        System.out.println("SUM of all is " + sum);
    }
}

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        for(int i = 10;i>=1;i--){
            System.out.printf("%d X %d = %d",num,i,num*i);
            System.out.println();
        }
    }
}
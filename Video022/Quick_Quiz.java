
import java.util.Scanner;

public class Quick_Quiz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int i = 1;

        do {
            System.out.println(i);
            i++;
        } while(i<=num);
    }
}
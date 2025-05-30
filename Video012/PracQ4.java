
import java.util.Scanner;

public class PracQ4 {
    public static void main(String[] args) {




        Scanner sc = new Scanner(System.in);
        int u = sc.nextInt();
        int v = sc.nextInt();
        int a = sc.nextInt();
        int s = sc.nextInt();
        int val = ((v*v) - (u*u))/(2*a*s);

        System.out.println(val);
    }
}

import java.util.Scanner;

public class Q2Practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float sub1 = sc.nextInt();
        float sub2 = sc.nextInt();
        float sub3 = sc.nextInt();
        float avg = (sub1+sub2+sub3)/30;
        System.out.println(avg);
    }
}
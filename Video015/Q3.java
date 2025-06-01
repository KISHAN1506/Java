
import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        String base = "Dear <|name|>, Thanks a lot";
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println(base.replace("<|name|>", name));
    }
}
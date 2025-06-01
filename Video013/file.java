
import java.util.Scanner;

public class file {
    public static void main(String[] args) { 
        // String name = new String("Kishan");
        // String name = "Kishan Agarwal";
        // name = "Hemlo";
        // System.out.println(name);

        // int a = 123;
        // float b = 123.3123f;
        // System.out.printf("The value of a is %d and b is %f",a,b);
        // System.out.println();
        // System.out.format("The value of a is %d and b is %f",a,b);

        Scanner sc = new Scanner(System.in);
        // String name = sc.next(); // Takes the single word
        String name = sc.nextLine(); // Takes the whole Line
        System.out.println(name);

    }
}
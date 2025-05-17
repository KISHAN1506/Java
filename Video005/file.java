import java.util.Scanner;

public class file {
    public static void main(String[] args) {
        System.out.println("Taking input from user");
        Scanner sr = new Scanner(System.in);
        int num1 = sr.nextInt();
        int num2 = sr.nextInt();
        int sum = num1 + num2;
        System.out.println("Sum of " + num1 + " and " + num2 + " is " + sum);

        // this method just take one word
        String name1 = sr.next();
        sr.nextLine();
        // this method take complete line
        String name2 = sr.nextLine();

        System.out.println(name1);
        System.out.println(name2);

        
    }
}
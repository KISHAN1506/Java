
import java.util.Scanner;

public class file {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Maximum possible Obtainable Marks: ");
        float max = sc.nextFloat();

        System.out.print("Enter Marks for Subject 1 :");
        float mark1 = sc.nextFloat();

        System.out.print("Enter Marks for Subject 2 :");
        float mark2 = sc.nextFloat();

        System.out.print("Enter Marks for Subject 3 :");
        float mark3 = sc.nextFloat();

        System.out.print("Enter Marks for Subject 4 :");
        float mark4 = sc.nextFloat();

        System.out.print("Enter Marks for Subject 5 :");
        float mark5 = sc.nextFloat();

        float total = mark1 + mark2 + mark3 + mark4 + mark5;
        float avg = (total / (max*5)) * 100;
        System.out.println("Percentage : " + avg);
    }
}
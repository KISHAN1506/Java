
import java.util.Scanner;

public class Q2 {

    static void pattern(int n){
        for(int i = 0;i < n;i++){
            for(int j = 0;j<i+1;j++){
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int noOfRows = sc.nextInt();

        pattern(noOfRows);
    }
}
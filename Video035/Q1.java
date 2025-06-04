
import java.util.Scanner;


public class Q1 {

    static void tablePrint(int num){
        for(int i = 1;i<=10;i++){
            System.out.printf("%d X %d = %d",num,i,num*i);
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        tablePrint(num);
    }
}
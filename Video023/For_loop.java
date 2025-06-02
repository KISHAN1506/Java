
import java.util.Scanner;

public class For_loop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        for(int i = 0;i<=num ; i++){
            System.out.println(i);
        }


        // i number of odd numbers
        for(int i = 0;i<=num ; i++){
            System.out.println(2*i + 1);
        }

        // i number of even numbers
        for(int i = 0;i<=num ; i++){
            System.out.println(2*i);
        }



        // QUICK QUIZ :
        // Natural Numbers in REVERSE Order:

        int revNum = sc.nextInt();
        for(int i = revNum;i>0;i--){
            System.out.println(i);
        }
    }
}
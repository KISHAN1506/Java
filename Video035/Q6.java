
import java.util.Scanner;

public class Q6 {

    static int answer(int ...num){
        int total = 0;
        for(int i = 0;i<num.length;i++){
            total += num[i];
        }
        return total/num.length;
    }

    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);

        int val1 = sc.nextInt();
        int val2 = sc.nextInt();
        int val3 = sc.nextInt();

        System.out.println(answer(val1,val2,val3));


    }
}
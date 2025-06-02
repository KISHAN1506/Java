

public class Pass_by_value_and_reference {
    static void change1(int num1){
        num1 = 58;
    }

    static void change2(int num2[]){
        num2[0] = 58;
    }


    public static void main(String[] args) {
        int num1 = 23;
        change1(num1);
        System.out.println(num1);

        int num2[] = {1,2,3,4,5,6};
        change2(num2);
        System.out.println(num2[0]);

    }
}
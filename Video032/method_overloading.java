

public class method_overloading {

    // But Overloading can not be done by changing the return type
    
    static int operations(){
        System.out.println("I got Nothing");
        return 0;
    }

    static int operations(int num1){
        return (num1 * 2);
    }

    static int operations(int num1,int num2){
        return num1 + num2;
    }



    public static void main(String[] args) {
        operations();
        System.out.println(operations(12));
        System.out.println(operations(12,23));
    }
}
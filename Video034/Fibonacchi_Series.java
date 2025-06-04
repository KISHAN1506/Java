public class Fibonacchi_Series {

    static int fibo(int n){
        if(n <= 1){
            return n;
        }
        return fibo(n-1) + fibo(n-2);
    }

    public static void main(String[] args) {
        System.out.print(fibo(0)+ " ");
        System.out.print(fibo(1)+ " ");
        System.out.print(fibo(2)+ " ");
        System.out.print(fibo(3)+ " ");
        System.out.print(fibo(4)+ " ");
        System.out.print(fibo(5)+ " ");
        System.out.print(fibo(6)+ " ");
    }
}
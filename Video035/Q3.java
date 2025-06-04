public class Q3 {

    static int sum = 0;

    static void addn(int num){
        if(num == 0){
            return;
        }
        sum += num;
        // Should be kept in mind we need to use pre decrement
        // First (num - 1) ,then passing that value to the function
        addn(--num);
    }

    public static void main(String[] args) {
        addn(5);
        System.out.println(sum);
    }
}
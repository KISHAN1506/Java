public class VarArgs {
    static int sum(int ...arr){
        int result = 0;
        for(int it:arr){
            result += it;
        }
        return result;
    }

    // Made atleast 1 argument compulsary
    static int sum2(int x, int ...arr){
        int result = x;
        for(int it:arr){
            result += it;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(sum());
        System.out.println(sum(1,2,3,5));
        System.out.println(sum(1,2,3,5,8));
        System.out.println(sum(1,2,3,5,8,9));
        System.out.println(sum(1,2,3,5,8,2));


        // By this method we made 1 argument compulsary
        System.out.println(sum2(3,3,4,5,2));
    }
}
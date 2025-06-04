public class Q9 {

    static float celToFar(float temp){
        return (temp * (9.0f/5)) + 32.0f;
    }

    public static void main(String[] args) {
        System.out.println(celToFar(32));
    }
}
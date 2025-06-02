public class Q1 {
    public static void main(String[] args) {
        float marks[] = {12.34f, 12.552f, 65.76f, 82.33f,45.09f};
        float sum = 0;
        for(int i = 0;i<marks.length;i++){
            sum += marks[i];
        }
        System.out.println(sum);
    }
}
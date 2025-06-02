public class Q3 {
    public static void main(String[] args) {
        float marks[] = {12.34f, 12.552f, 65.76f, 82.33f,45.09f};
        float total = 0;

        for(float it : marks){
            total += it;
        }
        float avg = total/marks.length;
        System.out.println(avg);
    }
}
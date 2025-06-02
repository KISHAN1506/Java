public class Q2 {
    public static void main(String[] args) {
        float marks[] = {12.34f, 12.552f, 65.76f, 82.33f,45.09f};
        float target = 12.34f;


        int found = 0;
        for(float it : marks){
            if(it == target){
                System.out.println("I found It!");
                found = 1;
            }
        }

        if(found == 0){
            System.out.println("Not Found!");
        }
    }
}
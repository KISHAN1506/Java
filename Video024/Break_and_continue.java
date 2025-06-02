public class Break_and_continue {
    public static void main(String[] args) {
        for(int i = 0;i<=5;i++){
            System.out.println(i);
            if(i == 2){
                break;
            }
        }


        for(int i = 0;i<=5;i++){
            if(i == 2){
                break;
                // Conpletely BREAK out of the loop
            }
            System.out.println(i);
        }


        for(int i = 0;i<=5;i++){
            if(i == 2){
                continue;
                // Leave that Perticular ITERATION
            }
            System.out.println(i);
        }


    }
}
public class Conditionals {
    public static void main(String[] args) {
        int age = 10;
        if(age>18){
            System.out.println("You can Drive");    
        }else{
            System.out.println("No you can't Drive");
        }

        boolean grtt = (age == 10);
        if(grtt){
            System.out.println("Gotya");
        }else{
            System.out.println("Not Gotya");
        }
    }
}
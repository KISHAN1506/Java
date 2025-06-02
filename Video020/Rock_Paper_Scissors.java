
import java.util.Random;
import java.util.Scanner;


public class Rock_Paper_Scissors{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        // 1 - Rock
        // 2 - Paper
        // 3 - Scissor
        int comp = rd.nextInt(1, 4);
        System.out.print("Enter Rock, Paper or Scissor :");
        String ch = sc.next();

        if((comp == 1 && ch.equalsIgnoreCase("Rock")) || 
                (comp == 2 && ch.equalsIgnoreCase("Paper")) || 
                    (comp == 3 && ch.equalsIgnoreCase("Scissor")) ){
            System.out.println("Tie");
        }
        else if(comp == 1 && ch.equalsIgnoreCase("Paper") ){
            System.out.println("Computer did " +comp + " You WIN!");
        }
        else if (comp == 1 && ch.equalsIgnoreCase("Scissor")) {
            System.out.println("Computer did " +comp + " Computer WIN!");
        }

        else if(comp == 2 && ch.equalsIgnoreCase("Rock")){
            System.out.println("Computer did " +comp + " Computer WIN!");
        }
        else if(comp == 2 && ch.equalsIgnoreCase("Scissors")){
            System.out.println("Computer did " +comp + " You WIN!");
        }

        else if(comp == 3 && ch.equalsIgnoreCase("Rock")){
            System.out.println("Computer did " +comp + " You WIN!");
        }
        else if(comp == 3 && ch.equalsIgnoreCase("Paper")){
            System.out.println("Computer did " +comp + " Computer WIN!");
        }
    
    }
}
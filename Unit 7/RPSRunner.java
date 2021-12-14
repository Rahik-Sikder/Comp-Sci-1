import java.util.Scanner;
import static java.lang.System.*;
public class RPSRunner {
    public static void main(String args[]) {
        Scanner keyboard = new Scanner(System.in);
        char response;

        //add in a do while loop after you get the basics up and running 

        String player = "";
        
        boolean loop;
        
        do{
        
            System.out.print("Rock-Paper-Scissors - [R,P,S] :: ");
            
            //read in the player value 
            response = Character.toUpperCase(keyboard.nextLine().charAt(0));
            
            
            RockPaperScissors game = new RockPaperScissors(response);
            System.out.println(game);
            
            System.out.println("\nDo you want to play again? y/n");
            
            char loopCheck = Character.toUpperCase(keyboard.nextLine().charAt(0));
            if(loopCheck == 'Y'){
                loop = true;
            } else {
                loop = false;
            }
            System.out.println();
        } while(loop);
    }
}
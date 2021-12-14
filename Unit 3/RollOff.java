import java.util.Scanner;

public class RollOff {
    public static void main (String args[]){
        Scanner reader = new Scanner(System.in);
        
        int range = 9999;
        int roll = 0;
        
        do {
            System.out.println("Range: 1 to " + range);
            System.out.println("Press enter to roll");
            reader.nextLine();
            roll = (int) (Math.random() * range) + 1;
            range = roll;
            
        } while(roll != 1);
        
        System.out.println("You rolled a 1! You lose the game.");
        
    }
}
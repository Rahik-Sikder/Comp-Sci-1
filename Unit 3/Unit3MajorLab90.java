import java.util.Scanner;

public class Unit3MajorLab90 {
    public static void main (String args[]){
        Scanner reader = new Scanner(System.in);
        
        int pileA = 3;
        int pileB = 3;
        int pileC = 3;
        
        boolean keepPlaying = true;
        
        System.out.println("--==* Nim *==--");
        System.out.println();
        
        
        System.out.print("Enter your name player 1: ");
        String player1 = reader.nextLine();
        System.out.print("Enter your name player 2: ");
        String player2 = reader.nextLine();
        int turnCounter = 0;
        
        System.out.println();
        
        while(keepPlaying){
            
            if(turnCounter % 2 == 0){
                System.out.println(player1 + "'s turn");
            } else {
                System.out.println(player2 + "'s turn");
            }
            
            System.out.println("A: " + pileA + "\tB: " + pileB + "\tC: " + pileC);
            System.out.print("Choose a pile: ");
            String pile = reader.nextLine();
            System.out.print("How many will you take: ");
            int take = reader.nextInt();
            reader.nextLine();
            
            switch(pile) {
                case "A":
                    pileA -= take;
                    break;
                case "B":
                    pileB -= take;
                    break;
                case "C":
                    pileC -= take;
                    break;
                default:
                    System.out.println("Invalid selection");
            
            }
            
            System.out.println();
            
            turnCounter++; 
            
            if(pileA <= 0 && pileB <= 0 && pileC <= 0){
                keepPlaying = false;
                turnCounter--;
            }
            
        }
        
        
        String winner;
        
         if(turnCounter % 2 == 0){
                winner = player1;
            } else {
                winner = player2;
            }
        
        System.out.println(winner + " wins the game! Well done!");
    
    }
}
import java.util.Scanner;

public class Unit3MajorLab110 {
    public static void main (String args[]){
        Scanner reader = new Scanner(System.in);
        
        // Making the piles
        int pileA = 3;
        int pileB = 3;
        int pileC = 3;
        
        
        boolean keepPlaying = true;
        
        System.out.println("--==* Nim *==--");
        System.out.println();
        
        // Getting the player names
        System.out.print("Enter your name player 1: ");
        String player1 = reader.nextLine();
        System.out.print("Enter your name player 2: ");
        String player2 = reader.nextLine();
        int turnCounter = 0;
        
        System.out.println();
        
        
        // The Game itself
        while(keepPlaying){
            
            
           // Finds who's turn it is 
            if(turnCounter % 2 == 0){
                System.out.println(player1 + "'s turn");
            } else {
                System.out.println(player2 + "'s turn");
            }
            
            
            // Prints out the current values of the pile
            System.out.print("A: ");
            for(int i = 0; i < pileA; i++){
                System.out.print("*");
            }
            System.out.print("\nB: ");
            for(int i = 0; i < pileB; i++){
                System.out.print("*");
            }
            System.out.print("\nC: ");
            for(int i = 0; i < pileC; i++){
                System.out.print("*");
            }
            System.out.println();
            
            // Choose a pile
            String pile;
            boolean pileCheck = false;
            do{
                System.out.print("Choose a pile: ");
                pile = reader.nextLine();
                
                // the anti-cheat
                // If the pile has 0 you cannot choose it
                if(pile.equals("A") && pileA != 0){
                    pileCheck = false;
                } else if (pile.equals("B") && pileB != 0){
                    pileCheck = false;
                } else if(pile.equals("C") && pileC != 0){
                    pileCheck = false;
                } else {
                    System.out.println("Enter a valid choice\n");
                    pileCheck = true;
                }
                
                
            } while (pileCheck);    
            
            
            // this is for the number of coins taken anti-cheat
            int takePile = 3;
            
            switch(pile){
                case "A":
                    takePile = pileA;
                    break;
                case "B":
                    takePile = pileB;
                    break;
                case "C":
                    takePile = pileC;
                    break;
                default:
                    System.out.println("Error: takePile cannot match case");
            
            }
            
            
            int take;
            boolean takeCheck;
            do{
                System.out.print("How many will you take: ");
                take = reader.nextInt();
                reader.nextLine();
                
                if( take > takePile || take < 1){
                    System.out.println("Enter a valid choice\n");
                    takeCheck = true;
                } else {
                    takeCheck = false;
                }
            } while (takeCheck);
            
            
            // taking away coins from their piles
            
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
                turnCounter--; // so the next player doesn't become the winner
            }
            
        }
        
        // Victory screen
        
        String winner;
        
         if(turnCounter % 2 == 0){
                winner = player1;
            } else {
                winner = player2;
            }
        
        System.out.println(winner + " wins the game! Well done!");
  
    }
}
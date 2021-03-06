import java.util.Scanner;

public class ComputerNim {
    public static void main (String args[]){
        Scanner reader = new Scanner(System.in);
        
        // Making the piles
        int pileA = 4;
        int pileB = 4;
        int pileC = 4;
        
        boolean keepPlaying = true;
        
        System.out.println("--==* Nim *==--");
        System.out.println();
        
        // Getting the player names
        System.out.print("Enter your name: ");
        String player = reader.nextLine();
        
        // Needed to find who wins, kinda pointless with this though
        int turnCounter = 0;
        
        // Game itself
        while(keepPlaying){
            
            // The Player's move
            System.out.println(player + "'s turn: \n");
            
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
                
                if( take >= takePile || take < 1){
                    System.out.println("Enter a valid choice\n");
                    takeCheck = true;
                } else {
                    takeCheck = false;
                }
            } while (takeCheck);
            
            
            // taking away coins from the piles
            
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
            
            turnCounter++;
            
            // Computer's turn
            System.out.println();
            System.out.println("=================================");
            System.out.println("ComputerNim's turn: \n");
            
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
        
            // Building up suspense
            try{
                System.out.print(".");
                Thread.sleep(750);
                System.out.print(".");
                Thread.sleep(750);
                System.out.print(".");
                Thread.sleep(750);
            } catch(InterruptedException e){
                
            }
            
            System.out.println();
            
            // ComputerNim wants each pile to have either 4 or 0 coins left. 
            // So when the player takes frome a pile,
            // ComputerNim takes the remaining coins from the pile  
            
            int compTake = 4 - take;
            System.out.println("ComputerNim chooses pile" + pile);
            System.out.println("ComputerNim takes " + compTake + " coins from the pile\n");
            

            // ComputerNim takes
            switch(pile) {
                case "A":
                    pileA -= compTake;        
                    break;
                case "B":
                    pileB -= compTake;
                    break;
                case "C":
                    pileC -= compTake;
                    break;
                default:
                    System.out.println("Error: ComputerNim broke");
            
            }
            
            
            // Some more waiting
            try{
                Thread.sleep(500);
            } catch(InterruptedException e){
                
            }
            
           
            System.out.println("=================================");
            turnCounter++;
            
            if(pileA <= 0 && pileB <= 0 && pileC <= 0){
                keepPlaying = false;
                turnCounter--;
            }      
        }        
        
        String winner;
    
        if(turnCounter % 2 == 0){
                winner = player;
            } else {
                winner = "ComputerNim";
        }
        
       System.out.println(winner + " wins the game! Well done!");
        
    }
}
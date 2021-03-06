import java.util.Scanner;
public class BlackJack{
    public static void main(String args[]) {
        Scanner key = new Scanner(System.in);
        int cash = 0;
        System.out.println("Welcome to blackjack!");
        
        //1. Ask user for name. 
        System.out.print("Enter your name: ");
        String name = key.nextLine();
        
        
        
        //2. Create a Hand object named player.
        
        boolean keepPlaying;
        
        do {
            keepPlaying = false;
            Hand player = new Hand(name);
            player.hit();
            player.hit();
            
            System.out.print("Place your bet: $");
            int bet = key.nextInt();
            
            
            System.out.println("\nYour hand: " );
            
            
            //This loop run while player is not bust and player does not stay
            while(!player.getBust() && !player.getStay()){ 
                
                //3. Invoke the toString method to see the players hand.
                System.out.println("\n" + player);
                
                //4.Prompt the user with a menu of choices to hit (1) or stay(1)
                
                System.out.println("\nMenu:");
                System.out.println("1. Hit ");
                System.out.println("2. Stay ");
                System.out.print("Enter choice: ");
                int menu = key.nextInt();
                
                
                /*5. Use an if else to call player.hit("7H", 7) when the user enters 1. 
                *    When the user enters 2 call stay()
                * note: in the 80pt version the only card is 7 of hearts. Use the parameters in the comment above.
                */
                
                if (menu == 1){
                    player.hit();
                } else {
                    player.stay();
                }
    
            }
            
            System.out.println("\n" + player); // Annoys me how it doesn't show your last card
            
            
            Hand dealer = new Hand("Dealer");
            dealer.dealerHit(true); // aceOne is true
            key.nextLine();
            
            while(!dealer.getBust() && !dealer.getStay()){ 
                
                
                
                System.out.println("\n" + dealer);
                
                System.out.println("Press enter to countine");
                key.nextLine();
                
                System.out.println();
                if(dealer.getHandTotal() < 17){
                    System.out.println("Dealer hits");
                    boolean aceOne = true;
                    if(dealer.getHandTotal() + 11 >= 17 && dealer.getHandTotal() + 11 <= 21){
                       aceOne = false;
                    }
                    dealer.dealerHit(aceOne);
                } else {
                    dealer.stay();
                }
                
            }
            
            System.out.println("\n" + dealer); // Annoys me how it doesn't show your last card
            
           
            
            //6. Print out the players handTotal()
            System.out.println("\nPlayer Total: " + player.getHandTotal());
            System.out.println("Dealer Total: " + dealer.getHandTotal());
            
            int handVal = player.getHandTotal();
            int dealVal = dealer.getHandTotal();
            
            // The cash is only tracking the amount they make within the game, so i dont
            // need to double it - to them it's doubled because they pocket the cash earned
            // here while also having their bet
            
            if (handVal > 21){
                System.out.println("Player busts. Dealer wins.");
                cash -= bet;
            } else if (dealVal > 21){
                System.out.println("Dealer busts. Player wins!");
                cash += bet;
            } else if ( handVal > dealVal){
                System.out.println("Player wins!");
                cash += bet;
            } else if (handVal == dealVal){
                System.out.println("Stand off. No winner.");
                // "If there is a stand-off (a player having the same total as the dealer),chips 
                // are paid out or collected."
                // https://bicyclecards.com/how-to-play/blackjack/
            }else {
                System.out.println("Player loses");
                cash -= bet;
            }
            
            
            System.out.println("\nCash made/lost: $" + cash);
            System.out.println("Do you want to keep playing? (y/n)");
            String yesNo = key.next();
            
            if(yesNo.charAt(0) == 'Y' || yesNo.charAt(0) == 'y'){
                keepPlaying = true;
            }
            
            
        } while(keepPlaying);    
     
        
    }
}

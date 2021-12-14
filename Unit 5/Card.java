import java.util.Scanner;

public class Card {
    private int value;
    private String cardFace;
    
    
    
    /** default constructor
     * This constructor should assign a random value [2-11] to value.
     * Initialize cardFace with the value + the call from helper method makeCardSuit()
     * 
     * made it make values from [1-13] 
     */
    
    public Card(){
        value = (int) (Math.random() * 13) + 1;
        cardFace = "[" + value + makeCardSuit() + "]";
        if(value == 1){
            cardFace = "[" + "A" + makeCardSuit() + "]";
            value = aceValue();
        } else if(value == 11){
            cardFace = "[" + "J" + makeCardSuit() + "]";
            value = 10;
        } else if(value == 12){
            cardFace = "[" + "Q" + makeCardSuit() + "]";
            value = 10;
        } else if(value == 13){
            cardFace = "[" + "K" + makeCardSuit() + "]";
            value = 10;
        }
        
        
        
    }
    
    public Card(boolean aceValOne){
        value = (int) (Math.random() * 13) + 1;
        cardFace = "[" + value + makeCardSuit() + "]";
        if(value == 1){
            cardFace = "[" + "A" + makeCardSuit() + "]";
            if(!aceValOne){
            value = 11;
            }
        } else if(value == 11){
            cardFace = "[" + "J" + makeCardSuit() + "]";
            value = 10;
        } else if(value == 12){
            cardFace = "[" + "Q" + makeCardSuit() + "]";
            value = 10;
        } else if(value == 13){
            cardFace = "[" + "K" + makeCardSuit() + "]";
            value = 10;
        }
        
        
    }
    
    public int aceValue(){
        Scanner reader = new Scanner(System.in);
        System.out.print("Ace value [1] or [11]? (1/2)");
        String aceValSelect = reader.nextLine();
        reader.close();
        if (aceValSelect.equals("1")){
            return 1;
        }
        return 11;
        
       
    }
    
    
    
    /** makeCardSuit()
     * This method returns a random suit string for the card face. 
     * Make a random number [1-4] and return either "H", "D", "C", "S" or the unicode values below
     * Heart char      ""+'\u2665'
     * Diamond char    ""+'\u2666'
     * Club char       "" +'\u2663'
     * Spade char      "" +'\u2660'    
     */
    
    public String makeCardSuit(){
        int suit = (int) (Math.random() * 4) + 1;
        
        switch(suit) {
            case 1: return ""+'\u2665';
            case 2: return ""+'\u2666';
            case 3: return ""+'\u2663';
            case 4: return ""+'\u2660';
            default: return "";
        }
       
        
    }
    
    
    //Write accessor methods for each of the two instance variables
    
    public int getValue(){
        return value;
    }
    
    public String getCardFace(){
        return cardFace;
    }
    
    
}
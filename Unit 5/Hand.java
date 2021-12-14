public class Hand {
    private String name;
    private String cardsInHand; //This is a text representation of a players hand.
    private int handTotal;
    private boolean bust;
    private boolean stay;
    
    //1. Constructors
    /**default constructor
     * This constructor should change the default value 
     * for name and cardsInHand to ""
     */
    
    public Hand(){
        name = "";
        cardsInHand = "";
    }
    
    
    /** constructor
     * @Param The name of the player.
     * This constructor changes the default value of cardsInHand to ""
     * and assigns the name instance variable.
     */
    public Hand(String player){
        name = player;
        cardsInHand = "";
    }
    
    
    
    //2. Accessors
    /** Accessor Methods
     * Write an accessor method for each of the five instance variables.
     */
    public String getName(){
        return name;
    }
    
    public String getCardsInHand(){
        return cardsInHand;
    }
    
    public int getHandTotal(){
        return handTotal;
    }
        
    public boolean getBust(){
        return bust;
    }
    
    public boolean getStay(){
        return stay;
    }

    
    
    //3. Mutator methods
    /** setName()
     * @param the new name value for the object.
     */
    
    public void setName(String name){
        this.name = name;
    }
    
    
    /** hit(String cardFace, int cardValue)
     * @param String cardFace - this is the String representation of the card.
     * @param int cardValue - this is the numeric value of the card.
     * This void method represents the hit action when a player gets another card.
     * Adds the cardFace to the cardsInHand variable and increases the handTotal.
     * Call the helper method checkForBust() to determine if the player has more than 21.
     */
    
    public void hit(){
        Card card = new Card();
        cardsInHand += " " + card.getCardFace();
        handTotal += card.getValue();
        checkForBust();
    }
    
    public void dealerHit(boolean aceValOne){
        Card card = new Card(aceValOne);
        cardsInHand += " " + card.getCardFace();
        handTotal += card.getValue();
        checkForBust();
    }
    
    
    
    /** checkForBust()
     * This void helper method is used to set the instance variable bust to true when 
     * hand total is greater than 21. Call this method inside hit().
     */
    
    public void checkForBust(){
        if(handTotal > 21){
            bust = true;
        }
    }
    
    
    /** stay()
     * This void method is called when the player decides to stop drawing cards. 
     * Set the instance variable stay to true.
     */
    
    public void stay(){
        stay = true;
    }
    
    
    
    //4. toString
    /** toString()
     * Implement a toString to return the name, cardsInHand, and total.
     */
        
    public String toString(){
        
        if(cardsInHand.length() < 4){
            return "Name: " + name +
               "\nHand: " + "[XX] [XX]" +
               "\nTotal: " + handTotal;
        }
        
        if(cardsInHand.length() < 9){
            return "Name: " + name +
               "\nHand: " +  cardsInHand + " [XX]" +
               "\nTotal: " + handTotal;
        }
        
        return "Name: " + name +
               "\nHand: " + cardsInHand +
               "\nTotal: " + handTotal;
    }
    
        
}
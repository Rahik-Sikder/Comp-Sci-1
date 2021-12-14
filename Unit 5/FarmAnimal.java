public class FarmAnimal {
    
    private int cows;
    private int horses;
    private int pigs;
    private int chickens;
    private String farmer;
    
    // The constructors
    
    public FarmAnimal(){
        farmer = "";
    }
    
    public FarmAnimal(String farmer, int cows, int horses, int pigs, int chickens){
        this.farmer = farmer;
        this.cows = cows;
        this.horses = horses;
        this.pigs = pigs;
        this.chickens = chickens;
        
    }
    
    
    // The Accessor Methods
    
    public String getFarmer(){
        return farmer;
    }
    
    public int getCows(){
        return cows;
    }
    
    public int getHorses(){
        return horses;
    }
    
    public int getPigs(){
        return pigs;
    }
    
    public int getChickens(){
        return chickens;
    }
    
    
    // toString methods
    
    public String toString(){
        return "Farmer Name\t: " + farmer +
               "\nCows \t\t: " + cows +
               "\nHorses \t\t: " + horses +
               "\nPigs \t\t: " + pigs +
               "\nChickens\t: " + chickens;
    }
    
    
    
    
}
public class Animal extends Reptile{
    
    private int weight;
    private boolean canBreathe;
    private String species;
    
    public Animal(){
        
    }
    
    public Animal(int weight, boolean canBreathe, String species, boolean isGreen){
        super(isGreen);
        this.weight = weight;
        this.canBreathe = canBreathe;
        this.species = species;
    }
    
    public void makeNoise(){
        System.out.println("Noisee");
    }
    
    
    public String toString(){
        return  super.toString() +
                "\nWeight: " + weight +
                "\nBreathe: " + canBreathe +
                "\nSpecies: " + species;
    }
    
    
}
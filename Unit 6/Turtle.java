public class Turtle extends Animal{
    
    private String shellColor;
    
    public Turtle(){
    
    }
    public Turtle(int weight, boolean canBreathe, String species, String shellColor){
        super(weight, canBreathe, species, true); // this calls the superclass constructor
        this.shellColor = shellColor;
    }
    
    
    // Making a toString method will override the superclass toString. 
    
    @Override
    public void makeNoise(){
        System.out.println("I am a turtle");
    }
    
    
    @Override
    public String toString(){
        
        return super.toString() +
               "\nShell color: " + shellColor;
    }
    
    
    
}
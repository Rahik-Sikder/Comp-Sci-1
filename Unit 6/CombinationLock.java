import java.util.*;

public class CombinationLock extends Lock{
    
    private String combination;
    Scanner reader = new Scanner(System.in);
    
    public CombinationLock(){
        super(); // call the default constructor of the Lock class
        combination = "";
    }
    
    public CombinationLock(String combo){
        super();
        combination = combo;
    }
    
    @Override
    public void open(){
        System.out.print("Enter Combination --> ");
        String combo = reader.nextLine();
        if(combination.equals(combo)){
            super.open();
        }
        
    }
    
    public String toString() {
        String str = super.toString() + "\n" +
        "Combination = " + combination + "\n";
        return str;
    }
    
    public void setCombination(String combo){
        combination = combo;
    }
    
    public String getCombination(){
        return combination;
    }
    

}
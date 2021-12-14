import java.util.Scanner;

public class RichterScale {
public static void main (String args[]){
    Scanner reader = new Scanner(System.in);
    
    System.out.print("Enter a magnitude on the Richter scale ==>> ");
    double scale = reader.nextDouble();
    System.out.println();
    
    String damage = "";
        if (scale >= 8){
            System.out.println("Damage = Most structures fall");
        } else if (scale >= 7){
            System.out.println("Damage = Most buildings destroyed");
        } else if (scale >= 6) {
            System.out.println(
                "Damage = Many buildings considerable damaged; some collapse");
        } else if (scale >= 4.5) {
            System.out.println("Damage = Damage to poorly constructed buildings");
        } else if (scale >= 3.5) {
            System.out.println("Damage = Felt by many people, no destruction");
        } else if (scale >= 0) {
            System.out.println("Damage = Generally not felt by people");
        } else {
            System.out.println("This number is not valid");
        }
        
        
    
    }
}


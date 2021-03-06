import java.util.Scanner;

public class Planets {
    public static void main (String args[]){
    
        Scanner reader = new Scanner(System.in);
    
        System.out.println("      Planets    ");
        System.out.println("================");
        System.out.println("1. Mercury");
        System.out.println("2. Venus");
        System.out.println("3. Mars");
        System.out.println("4. Jupiter");
        System.out.println("5. Saturn");
        System.out.println("6. Uranus");
        System.out.println("7. Neptune");
        System.out.println("8. Pluto");
        
        System.out.print("Select planet(1-8) --> ");
        int planet = reader.nextInt();
        
        System.out.print("\nEnter your weight on Earth: ");
        double weight = reader.nextInt();
        
        System.out.println();
        switch (planet){
            case 1: // Mercury
                weight *= .38;
                System.out.println("Your weight on Mercury is " + weight);
                break;
            case 2: // Venus
                weight *= .78;
                System.out.println("Your weight on Venus is " + weight);
                break; 
            case 3: // Mars
                weight *= .39;
                System.out.println("Your weight on Mars is " + weight);
                break;
            case 4: // Jupiter
                weight *= 2.65;
                System.out.println("Your weight on Jupiter is " + weight);
                break;
            case 5: // Saturn
                weight *= 1.17;
                System.out.println("Your weight on Saturn is " + weight);
                break;
            case 6: // Uranus
                weight *= 1.05;
                System.out.println("Your weight on Uranus is " + weight);
                break;
                
            case 7: // Neptune
                weight *= 1.23;
                System.out.println("Your weight on Neptune is " + weight);
                break;
            case 8: // Pluto
                weight *= .05;
                System.out.println("Your weight on Pluto is " + weight);
                break;
            default:
                System.out.println("Invalid Selection, please make a valid choice");
                break;
        }
        
        
    
    }
}
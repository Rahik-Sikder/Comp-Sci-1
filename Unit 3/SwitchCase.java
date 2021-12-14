import java.util.Scanner;

public class SwitchCase {
    public static void main (String args[]){
        
        Scanner reader = new Scanner(System.in);
        
        // Switch case allows us to use Multi-way selection similar to else if
        // Switch case is useful for checking exact values. Cannot fit a vale to a range
        
        System.out.println("A wild dog attacks you on the street. What do you do?");
        System.out.println("1. You try to pet the dog");
        System.out.println("2. You run from the dog.");
        System.out.println("3. You fight the dog");
        System.out.println("4. You do nothing");
        System.out.println("5. Call the police");
        
        System.out.print("\nEnter an option (1-5) ");
        int input = reader.nextInt();
        
        
        switch(input) {
            case 1: 
                System.out.println("He wags his stumpy little tail.");
                break;
            case 2:
                System.out.println("He runs out of breath and stops.");
                break;
            case 3:
                System.out.println("Wrigslie stabs you with his knife.");
                break;
            case 4:
                System.out.println("He bites you.");
                break;
            case 5:
                System.out.println("Wrigslie goes to jail.");
                break;
            default: 
                System.out.println("Enter a valid choice");
                break;
            
        
        }
        
        
        
    
    }
}
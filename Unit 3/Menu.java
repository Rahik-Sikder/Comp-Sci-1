import java.util.Scanner;

public class Menu {
    public static void main (String arg[]){
    
        Scanner reader = new Scanner(System.in);
    
        System.out.println("      Menu    ");
        System.out.println("  ============");
        System.out.println("1. Dr. Pepper");
        System.out.println("2. Coke");
        System.out.println("3. Sprite");
        System.out.println("4. 7-UP");
        System.out.println("5. Diet Coke");
        
        System.out.print("\nSelection: ");
        int input = reader.nextInt();
        
        switch (input){
            case 1:
                System.out.println("You have chosen Dr. Pepper");
                break;
            case 2:
               System.out.println("You have chosen Coke");
                break; 
            case 3:
                System.out.println("You have chosen Sprite");
                break;
            case 4:
                System.out.println("You have chosen 7-UP");
                break;
            case 5:
                System.out.println("You have chosen Diet Coke");
                break;
            default:
                System.out.println("Invalid Selection, please make a valid choice");
                break;
        }
        
        
        
        
        
    
    }
}
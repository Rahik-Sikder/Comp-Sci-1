import java.util.Scanner;

public class CharacterAnalyzer {
    public static void main (String lmao[]){
    
        Scanner reader = new Scanner(System.in);
      
        System.out.print("Enter a letter :: ");
        char let = reader.nextLine().charAt(0);
        
        // Uppercase 65 - 90
        if( let <= 90){
            if(let >= 65){
                System.out.println("" + let + " is an uppercase character. ASCII == " + (int) let);
            }
        }
       
        // Lowercase 97 - 122
        if( let <= 122){
            if(let >= 97){
                System.out.println("" + let + " is a lowercase character. ASCII == " + (int) let);
            }
        }
        
        // Number 48 - 57
        if( let <= 57){
            if(let >= 48){
                System.out.println("" + let + " is a number. ASCII == " + (int) let);
            }
        }

    }
}
import java.util.Scanner;

public class LastLetter {
    public static void main (String args[]){
    
        Scanner reader = new Scanner(System.in);
        
        System.out.print("Enter a string --> ");
        String input = reader.nextLine();
        
        String lastLetter = input.substring(input.length()-1);
        System.out.println("Last letter = " + lastLetter);
        
    }
}
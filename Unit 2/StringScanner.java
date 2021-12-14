import java.util.Scanner;

public class StringScanner {
    public static void main (String args[]) {
    
        Scanner reader = new Scanner (System.in);
        
        /* nextLine()
         * takes in the next sentence/sentences from the user. Stops when we hit enter.
         * input: n/a
         * output: String
         */
        
        // System.out.print("Enter a sentence: ");
        // String input = reader.nextLine();
        
        // System.out.println("You entered: " + input);
        
        /* next()
         * takes in the next word from the user. 
         * input: n/a
         * output: String
         */
        
        System.out.print("Enter some words ");
        String word1 = reader.next();
        String word2 = reader.next();
        String word3 = reader.next();
        
        System.out.println("word1: " + word1);
        System.out.println("word2: " + word2);
        System.out.println("word3: " + word3);
        
    
    }
}
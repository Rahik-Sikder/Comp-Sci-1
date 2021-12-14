import java.util.Scanner;

public class RepeatWords {
    public static void main (String args[]){
        
        Scanner reader = new Scanner(System.in);
    
        System.out.println("Enter words, type (stop or exit) to stop:\n");
        
        String word = "";
        int counter = 0;
        while(!word.equalsIgnoreCase("stop") && !word.equalsIgnoreCase("exit") ){
            word = reader.nextLine();
            if( !word.equalsIgnoreCase("stop") 
                && !word.equalsIgnoreCase("exit")
                && !word.equals("") ){
                counter++;
            }
        }
        System.out.println("\nYou entered " + counter + " words");
        
        
    }
}
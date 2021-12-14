import java.util.Scanner;

public class DashedWord {
    public static void main(String args[]){
        Scanner reader = new Scanner(System.in);
        
        System.out.print("Enter your word :: ");
        String word = reader.nextLine();
        
        
        
        System.out.println("\nVoid Method :: ");
        dashVoid(word);
        
        System.out.println("\nReturn Method :: " );
        System.out.println("Dashed word: " + dashReturn(word)); 
        
    }
    
    public static void dashVoid(String word){
        
        String dashedWord = word.substring(0,1);
        for (int i = 1; i < word.length(); i++){
            dashedWord = dashedWord + "-" + word.substring(i, i+1) ;
        
        }
        
        System.out.println("Dashed word: " + dashedWord);
    }
    
    public static String dashReturn(String word){
         String dashedWord = word.substring(0,1);
        for (int i = 1; i < word.length(); i++){
            dashedWord = dashedWord + "-" + word.substring(i, i+1) ;
        
        }
        
        return dashedWord;
        
    }
    
}
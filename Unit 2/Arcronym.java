import java.util.Scanner;

public class Arcronym {
    public static void main (String args[]){
    
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter 3 words --> ");
        String word1 = reader.next().substring(0,1);
        String word2 = reader.next().substring(0,1);
        String word3 = reader.next().substring(0,1);
        
        System.out.println("\nNew word = " + word1 + word2 + word3);
    
    }
}
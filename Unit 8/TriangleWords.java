import java.util.Scanner;

public class TriangleWords {
    public static void main(String[] args){
    
        Scanner reader = new Scanner(System.in);
        
        System.out.print("Enter the word --> ");
        String word = reader.nextLine();
        
        
  
        for(int i = 0; i < word.length() - 1; i++){
            
            for(int j = 1; j < word.length() - i; j++){
                System.out.print(" ");
            } 
            
            System.out.print(word.substring(i, i+1));
            
            for(int j = 1; j < i * 2; j++){
                System.out.print(" ");
            } 
            
            if(i != 0)
                System.out.print(word.substring(i, i+1));
       
            System.out.println();

        } 
        
        System.out.print(word.substring(word.length() - 1));
        for(int i = word.length() - 2; i >= 0; i--){
            System.out.print(word.substring(i, i+1));
        }
        System.out.print(word.substring(1));
        
    }    
}
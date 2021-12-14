import java.util.Scanner;

public class LettersAndsNumbers {
    public static void main(String args[]){
    
        // make four rows
        // make four columns
        // change char
            // make Z wrap back around to A
            
        Scanner reader = new Scanner(System.in);
            
        System.out.print("Enter a letter --> ");
        char input = reader.nextLine().charAt(0);
        
        System.out.print("Enter a number --> ");
        int size = reader.nextInt(); 
        reader.nextLine();
        

        
        //row
        for(int i = 1; i <= size; i++){
            int shifter = 0;
            char let = input;
            
            // column
            for(int j = size; j >= i; j--){
                
                char let2 = (char) (let + shifter);
                    
                if(let2 > 90){
                    let = 65;
                    shifter = 0;
                    let2 = 65;
                }
                
                for(int k = 1; k <= j; k++){
                    System.out.print(let2);
                }
                
                System.out.print(" ");
                shifter++;
                
            }   
            System.out.println();
        }
        
        
            
        
    }
}
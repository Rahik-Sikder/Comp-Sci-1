import java.util.Scanner;

public class Accumulator {
    public static void main (String args[]){
        
        // accumulator variables are used to keep a running total
        
        // Ask the user for 4 grades, print the total.
        
        Scanner reader = new Scanner(System.in);
        
        int grade = 0;
        for (int i = 0; i < 4; i++){
            System.out.print("Enter grade --> ");
            grade += reader.nextInt();
        }    
        
        System.out.println("Total = " + grade);
        
    }
}
import java.util.Scanner;

public class IfStatements {
    public static void main (String args[]){
        
        Scanner reader = new Scanner(System.in);
        
        // If statements are used to conditionally execute a block of code.
        // A single if statement allows "one-way selection"
        
        if(5 > 2){
            System.out.println("The if statement executed.");
        }
        
        // Ask the user to enter a grade. Print out the grade they entered.
        
        System.out.print("Enter a grade: ");
        int grade = reader.nextInt();
        System.out.println("You entered: " + grade);
        
        if(grade >= 90){
            System.out.println("Congrats on the A, buddy");
            System.out.println("Yo nice job");
        }
        
    }
}
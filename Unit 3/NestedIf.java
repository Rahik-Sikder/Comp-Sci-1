import java.util.Scanner;

public class NestedIf {
    public static void main (String args[]){
    
        // Nested if is an if statement inside another if statement
        // This is useful for checking multiple conditions and fitting a value to 
        // a range
        
        Scanner reader = new Scanner(System.in);
        
        System.out.print("Enter a grade: ");
        int grade = reader.nextInt();
        
        System.out.println("You entered: " + grade);
        
        if (grade >= 90){
            if (grade <= 100){
                System.out.println("You earned an A.");
            }
        }
        
        
        // B
        if (grade >= 80) {
            if (grade <= 89){
                System.out.println("You earned a B");
            }
        }
        
        
    }
}
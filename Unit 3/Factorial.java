import java.util.Scanner;

public class Factorial {
    public static void main (String args[]){
        
        Scanner reader = new Scanner(System.in);
        
        System.out.print("Enter your factorical --> ");
        int factorial = reader.nextInt();
        
        int total = 1;
        for (int i = factorial; i > 1; i--){
            total *= i;
        } 
        
        System.out.println("The factorial of " + factorial + " is " + total);
        
    }
}
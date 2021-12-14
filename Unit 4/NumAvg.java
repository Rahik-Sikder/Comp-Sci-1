import java.util.Scanner;

public class NumAvg {
    public static void main(String args[]){
        Scanner reader = new Scanner(System.in);
        
        System.out.print("Enter your first number :: ");
        double num1 = reader.nextDouble();
       
        System.out.print("Enter your second number :: ");
        double num2 = reader.nextDouble();
        
        System.out.println();
        
        System.out.println("Void Method :: ");
        avgVoid(num1, num2);
        
        System.out.println("\nReturn Method :: ");
        System.out.println(num1 + " + " + num2 + " has an average of " + avgReturn(num1,num2));
        
        
    
    }
    
    public static void avgVoid(double num1, double num2){
        double avg = ( num1 + num2 ) / 2;
        System.out.println(num1 + " + " + num2 + " has an average of " + avg);
    }
    
    public static double avgReturn(double num1, double num2){
        return ( num1 + num2 ) / 2;
    } 
    
}
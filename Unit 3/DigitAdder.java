import java.util.Scanner;

public class DigitAdder {
    public static void main (String args[]){
        
        Scanner reader = new Scanner(System.in);
        
        System.out.print("Enter your number --> ");
        int input = reader.nextInt();
        
        int sum = 0;
        int num = input;
        
        while (num > 0){
            sum += num % 10;
            num /= 10;
        }
    
        System.out.println("\n" + sum + " is the sum of the digits of " + input);
    
    }
}
import java.util.Scanner;

public class GreatestCommonDenominator {
    public static void main (String args[]){
        Scanner reader = new Scanner(System.in);
        
        System.out.print("Enter first number --> ");
        int num1 = reader.nextInt();
        System.out.print("Enter second number --> ");
        int num2 = reader.nextInt();
        
        int gcd = 1;
        
        if(num1 > num2){
            int placeholder = num1;
            num1 = num2;
            num2 = placeholder;
        }
        
        
        for(int i = num1; i > 0; i--){
            if (num2 % i == 0){
                gcd = i;
                break;
            }
        }
        
        System.out.println("the gcd of " + num1 + " and " + num2 + " is " + gcd);
    
    }
}
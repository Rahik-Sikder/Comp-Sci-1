import java.util.Scanner;

public class Money {
    public static void main (String args[]){
        
        Scanner reader = new Scanner(System.in);
        
        // variables
        int quarters = 0;
        int dimes = 0;
        int nickels = 0;
        int pennies = 0;
        int totalCents = 0;
        int dollars = 0;
        int cents = 0;
        
        // input
        System.out.print("How many pennies do you have --> ");
        pennies = reader.nextInt();
        System.out.print("How many nickels do you have --> ");
        nickels = reader.nextInt();
        System.out.print("How many dimes do you have --> ");
        dimes = reader.nextInt();
        System.out.print("How many quarters do you have? --> ");
        quarters = reader.nextInt();
        
        // calculations
        totalCents = pennies + nickels * 5 + dimes * 10 + quarters * 25;
        dollars = totalCents / 100;
        cents = totalCents % 100;
        
        // output
        System.out.println();
        System.out.println("Total value = " + dollars + " dollars and " + cents + " cents" );
        
        
        
        
        
    }
}

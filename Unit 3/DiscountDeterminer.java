import java.util.Scanner;

public class DiscountDeterminer {
    public static void main (String args[]){
    
        Scanner reader = new Scanner(System.in);
        
        System.out.print("Enter the original bill amount :: ");
        double bill = reader.nextDouble();
        double discount = .85;
        
        if(bill > 2000){
            bill *= discount;
        }
        
        
        
        System.out.println();
        System.out.println("Bill after discount :: " + (String.format("%.2f",bill)));
    }
}
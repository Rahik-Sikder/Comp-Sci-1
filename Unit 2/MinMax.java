import java.util.Scanner;
    
public class MinMax {
    public static void main (String args[]){
        
        Scanner reader = new Scanner(System.in);
        int num1;
        int num2;
        int num3;
        int smallest;
        int largest;
    
        
        // input
        
        System.out.print("Enter 1st Integer --> ");
        num1 = reader.nextInt();
        System.out.print("Enter 2nd Integer --> ");
        num2 = reader.nextInt();
        System.out.print("Enter 3rd Integer --> ");
        num3 = reader.nextInt();
        
            
        // calculation
        
        smallest = Math.min(Math.min(num1, num2), num3);
        largest = Math.max(Math.max(num1, num2), num3);
        
        
        // output
        
        System.out.println("Smallest = " + smallest);
        System.out.println("Largest = " + largest);
        
        
    }
}
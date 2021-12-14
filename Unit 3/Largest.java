import java.util.Scanner;

public class Largest {
    public static void main (String args[]){
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Enter 10 numbers: ");
        int i = 0;
        int input = 0; 
        int largest = 0;
        do{
            input = reader.nextInt();
            largest = Math.max(input, largest);
            i++;
        } while (i < 10);
    
        System.out.println("\nThe largest number is " + largest);
    }
}


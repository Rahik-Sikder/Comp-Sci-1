import java.util.Scanner;

public class PrimeNumber{
    public static void main (String args[]){
        
        Scanner reader = new Scanner(System.in);
        
        System.out.print("Enter number --> ");
        int input = reader.nextInt();
        String prime = " is prime";
        
        for (int i = 2; i < Math.sqrt(input); i++){   
            if(input % i == 0){
                prime = " is not prime";
                break;
            }
        }
        
    
        System.out.println( input + prime);
    }
}
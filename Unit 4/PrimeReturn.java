import java.util.Scanner;

public class PrimeReturn {
    public static void main(String args[]){
        Scanner reader = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int prime = reader.nextInt();
        
        System.out.println( prime + " is prime: " + isPrime(prime));
    
    }
    
    public static boolean isPrime(int num) {
        
        for (int i = 2; i < Math.sqrt(num); i++){   
            if(num % i == 0){
                return false;
            }
        }
        return true;
    }
    
    
}


import java.util.Scanner;

public class ReverseNumber {
    public static void main (String args[]){
    
        Scanner reader = new Scanner(System.in);
        
        
        
        System.out.print("Enter your number --> ");
        int input = reader.nextInt();
        
        int rev = 0;
        int num = input;
        
        System.out.println();
        
        while(num > 0){
            rev = rev * 10 + num % 10;
            num /= 10;
        
        }
        
        System.out.println(input + " reversed is " + rev);
    
    }
}
import java.util.Scanner;

public class OddEvenString {
    public static void main (String args[]){
    
        Scanner reader = new Scanner(System.in);
        
        System.out.print("Enter a word :: ");
        String input = reader.nextLine();
        int num = input.length();
        
        if(num % 2 == 1){
            System.out.println(input + " is odd");
        } else {
            System.out.println(input + " is even");
        }
        
    }
}
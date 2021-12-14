import java.util.Scanner;

public class Else {
    public static void main (String args[]){
        
        // else allows two way selection with an if statement
        // WHen if is true, something executes. When false, the else will
        // execute
        
        Scanner reader = new Scanner(System.in);
        
        System.out.print("How many wrinkles you got on your brain: ");
        int wrinkles = reader.nextInt();
        
        if(wrinkles < 30){
            System.out.println("Go destroy a bathroom lol !!!1!!11!!");
        } else {
            System.out.println("Nice job being a normal human being.");
        }
        
        
        
        
        
    }
}
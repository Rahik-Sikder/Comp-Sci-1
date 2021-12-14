import java.util.Scanner;

public class FullName {
    public static void main (String args[]){
    
        Scanner reader = new Scanner(System.in);
        
        System.out.print("Enter first name --> ");
        String firstName = reader.nextLine();
        System.out.print("Enter last name --> ");
        String lastName = reader.nextLine();
        System.out.println();
        System.out.println(lastName + ", " + firstName);
        
    }
}
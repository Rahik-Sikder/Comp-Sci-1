import java.util.Scanner;

public class StringFirstLetter {
    public static void main (String args[]){
    
        Scanner reader = new Scanner(System.in);
        
        System.out.print("Enter First Word --> ");
        String input1 = reader.nextLine();
        System.out.print("Enter Second Word --> ");
        String input2 = reader.nextLine();
        
        System.out.println();
        
        if ( input1.charAt(0) == input2.charAt(0) ){
            System.out.println( "\"" + input1 + "\"" 
                                + " has the same first letter as "
                                + "\"" + input2 + "\"");
        } else {
            System.out.println("\"" + input1 + "\"" 
                                + " does not have the same first letter as "
                                + "\"" + input2 + "\"");
        }
        
    }
}
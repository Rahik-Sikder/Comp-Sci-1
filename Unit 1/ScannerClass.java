import java.util.Scanner; // Scanner is the name of the class.
                          // util is the name of the package that contains Scanner.
                          //

public class ScannerClass {
    public static void main (String args[]){
    
        /* Scanner class is used to pause the programs and let the user enter a value.
         * 
         * 1. Import the scanner class
         * 2. Instantiate the Scanner object. 
         * 3. Ask the user for input
         */
    
        
        Scanner key = new Scanner(System.in); // Scanner object -
                                              // We use this top call the Scanner methods
        
        // String word = new String("hello");
        
        System.out.print("Enter a number: ");
        int input = key.nextInt(); // This line of code will pause the program
                                   // until the user eneters a number
         
        System.out.println("You entered: " + input);
        
        // Ask the user to enter a double number
        
        System.out.print("Enter a double: ");
        double input2 = key.nextDouble(); // This line of code will pause the program
                                   // until the user eneters a number
         
        System.out.println("You entered: " + input2);
    
    }
}
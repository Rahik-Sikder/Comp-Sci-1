import java.util.Scanner;

public class SentinelValues {
    public static void main (String args[]){
        Scanner reader = new Scanner(System.in);
        
        // A sentinel value is a value entered by a user to end a loop
        
        // Ask the user for any number of grades
        // User will enter -1 to end the loop and view sum and avg 
        
        int input = 0;
        int sum = 0;
        double avg = 0;
        int counter = 0;
        
        System.out.println("Enter any number of grades, type -1 to view sum and avg");
        
        while(input != -1){
            System.out.print("Enter a grade: ");
            input = reader.nextInt();
            
            if(input != -1){
                sum += input;
                counter++;
            }
        }
       
        avg = (double) sum / counter;
        System.out.println("Sum: " + sum + "\nAvg: " + avg);
        
    
    }
}
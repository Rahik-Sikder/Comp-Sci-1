import java.util.Scanner;

public class PopeyesTimeEstimator {
    public static void main (String args[]){
    
        // initializing the variables and Scanner
        
        final int MINUTES_PER_GROUP = 25;
        final int MAX_CAPACITY = 127;
        final int MIN_IN_HOUR = 60;
        
        int customers;
        int remainingCustomers;
        int groups;
        int totalMinutes;
        int hours;
        int minutes;
        
        Scanner reader = new Scanner(System.in);
        
        // input
        
        System.out.println("=======> Popeyes Time Estimator <=======");
        System.out.print("Enter number of expected customers: ");
        customers = reader.nextInt();
        
        // calculations
        
        
        groups = customers / MAX_CAPACITY;
        totalMinutes = groups * MINUTES_PER_GROUP;
        remainingCustomers = customers % MAX_CAPACITY;
        if(customers % MAX_CAPACITY != 0){
            totalMinutes += 25;
        }
        hours = totalMinutes / MIN_IN_HOUR;
        minutes = totalMinutes % MIN_IN_HOUR;
        
        
        // output
        
        System.out.println("Leftover Customers: " + remainingCustomers);
        System.out.println( "Total Hours: " + hours + " Minutes: " + minutes);
        
        
        
        
    
    }
}
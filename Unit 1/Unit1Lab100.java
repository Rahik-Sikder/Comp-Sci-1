import java.util.Scanner;

public class Unit1Lab100 {
    public static void main (String args[]){
            
    Scanner reader = new Scanner(System.in);
    final int MILLISECONDS_IN_HOUR = 3600000;
    final int MILLISECONDS_IN_MINUTE = 60000;
    final int MILLISECONDS_IN_SECOND = 1000;
    int hours;
    int minutes;
    int seconds;
    int StartMilliseconds;
    int millisecondsLeft;
    
    // input
    
    System.out.print("Please enter milliseconds --> ");
    StartMilliseconds = reader.nextInt();
    
    // finding hours
    hours = StartMilliseconds / MILLISECONDS_IN_HOUR;
    millisecondsLeft = StartMilliseconds % MILLISECONDS_IN_HOUR;
    
    // finding minutes
    minutes = millisecondsLeft / MILLISECONDS_IN_MINUTE;
    millisecondsLeft %= MILLISECONDS_IN_MINUTE;
    
    // finding seconds
    seconds = millisecondsLeft / MILLISECONDS_IN_SECOND;
    millisecondsLeft %= MILLISECONDS_IN_SECOND;
    
    // output
    System.out.println("Starting milliseconds:  " + StartMilliseconds);
    System.out.println("Hours:\t\t\t" + hours);
    System.out.println("Minutes:\t\t" + minutes);
    System.out.println("Seconds:\t\t" + seconds);
    System.out.println("Milli Seconds:\t\t" + millisecondsLeft);
    
    
    }
}
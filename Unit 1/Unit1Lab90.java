import java.util.Scanner;

public class Unit1Lab90{
    public static void main (String args[]){
    
    Scanner reader = new Scanner(System.in);
    
    final int SECONDS_IN_HOUR = 3600;
    final int SECONDS_IN_MINUTE = 60; 
    int hours;
    int minutes;
    int startSeconds;
    int secondsLeft;
    
    // input
    System.out.print("Please eneter in starting seconds --> ");
    startSeconds = reader.nextInt();
    
    // finding hours
    
    hours = startSeconds / SECONDS_IN_HOUR;
    secondsLeft = startSeconds % SECONDS_IN_HOUR;
    
    // finding minutes
    minutes = secondsLeft / SECONDS_IN_MINUTE;
    secondsLeft %= SECONDS_IN_MINUTE;
    
    
    // output
    System.out.println("Starting seconds:  " + startSeconds);
    System.out.println("Hours: \t\t   " + hours);
    System.out.println("Minutes \t   " + minutes);
    System.out.println("Seconds: \t   " + secondsLeft);
        
    
        
    }
}
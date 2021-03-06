public class Unit1Lab80 {
    public static void main (String args[]){
    
    final int SECONDS_IN_HOUR = 3600;
    final int SECONDS_IN_MINUTE = 60;
    int hours;
    int minutes;
    int startSeconds;
    int secondsLeft;
    
    // step 1
    startSeconds = 10000;
    
    // step 2
    hours = startSeconds / SECONDS_IN_HOUR;
    
    // step 3
    secondsLeft = startSeconds % SECONDS_IN_HOUR;
    
    // step 4
    minutes = secondsLeft / SECONDS_IN_MINUTE;
    
    // step 5
    secondsLeft %= SECONDS_IN_MINUTE;
    
    System.out.println("Starting seconds:  " + startSeconds);
    System.out.println("Hours: \t\t   " + hours);
    System.out.println("Minutes \t   " + minutes);
    System.out.println("Seconds: \t   " + secondsLeft);
    
    
    
    }
}
import java.util.Scanner; 
import static java.lang.System.*;
import static java.lang.Math.*;

public class MilesPerHour {
    private int distance, hours, minutes;
    private double mph;

    public MilesPerHour() {
        setNums(0,0,0);
        mph=0.0;
    }

    public MilesPerHour(int dist, int hrs, int mins) {
        distance = dist;
        hours = hrs;
        minutes = mins;
    }

    public void setNums(int dist, int hrs, int mins) {
        distance = dist;
        hours = hrs;
        minutes = mins;
    }

    public void calcMPH() {
        double time = hours * 60 + minutes;        
        mph = (double) distance / (time / 60);
        mph = Math.round(mph);
    }

    public void print() {
        System.out.println();
        System.out.println( distance + " miles in "
                            + hours + " hours and " 
                            + minutes + " minutes = "
                            + (int) mph + " MPH");

    }
}
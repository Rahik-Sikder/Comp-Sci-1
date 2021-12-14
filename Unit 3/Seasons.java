import java.util.Scanner;

public class Seasons {
    public static void main(String args[]){
        Scanner reader = new Scanner(System.in);
    
        System.out.print("Enter a season --> ");
        String input = reader.nextLine();
        
        if (input.equalsIgnoreCase("summer")){
            System.out.println("Season: Summer");
            System.out.println("  Meteorological:");
            System.out.println("    June 21 - September 22");
            System.out.println("  Astronomical:");
            System.out.println("    Summer Solstice - Autumnal Equinox");
        } else if (input.equalsIgnoreCase("fall")){
            System.out.println("Season: Fall");
            System.out.println("  Meteorological:");
            System.out.println("    September 22 - November 30");
            System.out.println("  Astronomical:");
            System.out.println("    Autumnal Equinox - Winter Solstice");
        } else if (input.equalsIgnoreCase("winter")){
            System.out.println("Season: Winter");
            System.out.println("  Meteorological:");
            System.out.println("    December 20 - March 20");
            System.out.println("  Astronomical:");
            System.out.println("    Winter Solstice - Vernal Equinox");
        } else if (input.equalsIgnoreCase("spring")){
            System.out.println("Season: Spring");
            System.out.println("  Meteorological:");
            System.out.println("    March 20 - June 21");
            System.out.println("  Astronomical:");
            System.out.println("    Vernal Equinox - Summer Solstice");
        } else {
            System.out.println("ERROR: NOT A VALID SEASON");
        }
        
        
    }
}
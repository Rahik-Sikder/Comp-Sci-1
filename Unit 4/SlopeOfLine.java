import java.util.Scanner;

public class SlopeOfLine {
    public static void main(String args[]){
        
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Enter your points");
        System.out.print("x1 :: ");
        int x1 = reader.nextInt();
        System.out.print("y1 :: ");
        int y1 = reader.nextInt();
        System.out.print("x2 :: ");
        int x2 = reader.nextInt();
        System.out.print("y2 :: ");
        int y2 = reader.nextInt();
    
        System.out.println("\nVoid Method :: ");
        slopeVoid(x1, y1, x2, y2);
        
        System.out.println("\nReturn Method :: ");
        double slopeReturned = slopeReturn(x1, y1, x2, y2);
        System.out.println( "The surface area is :: " + (String.format("%.2f",slopeReturned)));
        
        
    }
    
    public static void slopeVoid(int x1,  int y1, int x2, int y2){
        double slope = (double) (y2 - y1) / (x2 - x1);
        System.out.println("the slope is " + (String.format("%.2f",slope)));
    }
    
    
    public static double slopeReturn(int x1, int y1, int x2, int y2){
        return (double) (y2 - y1) / (x2 - x1);
    }
    

}
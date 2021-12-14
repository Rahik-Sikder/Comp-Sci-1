import java.util.Scanner;

public class DistanceFormula {
    public static void main (String args[]){
    
        Scanner reader = new Scanner(System.in);
        
        System.out.print("Enter truck A's X coordinate :: ");
        double aX = reader.nextDouble();
        System.out.print("Enter truck A's Y coordinate :: ");
        double aY = reader.nextDouble();
        System.out.print("Enter truck B's X coordinate :: ");
        double bX = reader.nextDouble();
        System.out.print("Enter truck B's Y coordinate :: ");
        double bY = reader.nextDouble();
        
        double distA = Math.sqrt(Math.pow(aX, 2) + Math.pow(aY, 2));
        double distB = Math.sqrt(Math.pow(bX, 2) + Math.pow(bY, 2));        
        
        System.out.println();
        
        if (distA < distB){
             System.out.println("A is closer to (0,0).");
        }  else if (distB < distA) {
            System.out.println("B is closer to (0,0).");
        } else {
            System.out.println("Both are equal distance to (0,0).");
        }
            
            
        
        
    }
}
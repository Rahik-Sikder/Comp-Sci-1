import java.util.Scanner; 
import static java.lang.System.*;
import static java.lang.Math.*;

public class DistanceRunner {
    public static void main( String[] args ) {
        
        Scanner reader = new Scanner(System.in);
        //add test cases
        
        System.out.print("Enter X1: ");
   	int x1 = reader.nextInt();
   	System.out.print("Enter Y1: ");
   	int y1 = reader.nextInt();
   	System.out.print("Enter X2: ");
   	int x2 = reader.nextInt();
        System.out.print("Enter Y2: ");
   	int y2 = reader.nextInt();
   	
   	Distance dist = new Distance(x1, y1, x2, y2);
   	dist.calcDistance();
        dist.print();
        System.out.println("\n\n");
       
        
        
        System.out.print("Enter X1: ");
   	x1 = reader.nextInt();
   	System.out.print("Enter Y1: ");
   	y1 = reader.nextInt();
   	System.out.print("Enter X2: ");
   	x2 = reader.nextInt();
        System.out.print("Enter Y2: ");
   	y2 = reader.nextInt();
   	
   	dist.setCoordinates(x1, y1, x2, y2);
   	dist.calcDistance();
        dist.print();
        System.out.println("\n\n");
        
        
        
         System.out.print("Enter X1: ");
   	x1 = reader.nextInt();
   	System.out.print("Enter Y1: ");
   	y1 = reader.nextInt();
   	System.out.print("Enter X2: ");
   	x2 = reader.nextInt();
        System.out.print("Enter Y2: ");
   	y2 = reader.nextInt();
   	
   	dist.setCoordinates(x1, y1, x2, y2);
   	dist.calcDistance();
        dist.print();
        System.out.println("\n\n");
            
    }
}
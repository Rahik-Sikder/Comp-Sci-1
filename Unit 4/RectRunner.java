import java.util.Scanner;

public class RectRunner {
    public static void main(String args[]){
        
        Scanner reader = new Scanner(System.in);
        RectanglePerimeter rectPerim = new RectanglePerimeter();
        
        System.out.print("Enter your length --> ");
        int length = reader.nextInt();
        System.out.print("Enter your width --> ");
        int width = reader.nextInt();
        
        System.out.println();
        
        System.out.println("Void Method :: ");
        rectPerim.perimVoid(length, width);
        
        System.out.println();
        
        System.out.println("Return Method :: ");
        System.out.println("The perimeter is :: " + rectPerim.perimReturn(length, width) ); 
        
        
    }
}

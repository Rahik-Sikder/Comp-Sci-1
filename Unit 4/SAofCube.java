import java.util.Scanner;

public class SAofCube {
    public static void main(String args[]){
        
        Scanner reader = new Scanner(System.in);
        
        System.out.print("Enter your first number :: ");
        int side = reader.nextInt();
        
        
        System.out.println("\nVoid Method :: ");
        saVoid(side);
        
        System.out.println("\nReturn Method :: ");
        System.out.println( "The surface area is :: " + saReturn(side));
        
        
        
        
    }
    
    public static void saVoid(int side){
        int sa = 6 * side * side;
        System.out.println("The surface area is :: " + sa);
    }
    
    
    
    public static int saReturn(int side){
        return 6 * side * side;
    }
    
    
}


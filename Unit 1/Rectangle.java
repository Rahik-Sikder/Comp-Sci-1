import java.util.Scanner;

public class Rectangle {
    public static void main (String args[]){
    
        Scanner reader = new Scanner(System.in);
        
        // input
        System.out.print("Enter the Length --> ");
        int length = reader.nextInt();
        System.out.print("Enter the Width --> ");
        int width = reader.nextInt();
        
        // output
        int perimeter = 2 * length + 2 * width;
        int area = length * width;
        
        System.out.println();
        System.out.println("Perimeter = " + perimeter);
        System.out.println("Area = " + area);
        
        
    
    }
}
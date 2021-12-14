import java.util.Scanner;

public class Triangle {
    public static void main (String args[]){
    
        Scanner reader = new Scanner(System.in);
        
        System.out.print("Enter Side 1 --> ");
        int side1 = reader.nextInt();
        System.out.print("Enter Side 2 --> ");
        int side2 = reader.nextInt();
        System.out.print("Enter Side 3 --> ");
        int side3 = reader.nextInt();
        
        String output;
        if (side1 + side2 < side3 || side1 + side2 < side3 || side2 + side3 < side1){
            output = "not possible";
        } else if (side1 == side2 && side1 == side3){
            output = "an equilateral";
        } else if (side1 == side2 || side1 == side3 || side2 == side3) {
           output = "an isosceles";
        } else {
           output = "a scalene";
        }
        
        System.out.println("This triangle is " + output);
        
        
        
        
        
    }
}
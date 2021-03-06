import java.util.Scanner;

public class PythagoreanLab {
    public static void main (String args[]){
    
        Scanner reader = new Scanner(System.in);
        int sideA;
        int sideB;
        int sideCRounded;
        double sideCExact;
        
        // input
        System.out.print("Enter side A: ");
        sideA = reader.nextInt();
        System.out.print("Enter side B: ");
        sideB = reader.nextInt();
        
        // calculation
        sideCExact = Math.sqrt(Math.pow(sideA, 2) + Math.pow(sideB, 2));
        sideCRounded = (int) Math.round(sideCExact);
        
        
        // output
        System.out.println("The length of the hypothenuse is: " + sideCRounded);
    
    
    }
}
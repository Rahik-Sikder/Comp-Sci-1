import java.util.Scanner;

public class NumberCompare{
    public static void main (String args[]){
    
        Scanner reader = new Scanner(System.in);
        
        System.out.print("Enter First Integer --> ");
        int num1 = reader.nextInt();
        System.out.print("Enter Second Integer --> ");
        int num2 = reader.nextInt();
        
        System.out.println();
        
        if ( num1 > num2 ){
            System.out.println( num2 + " -- " + num1);
            System.out.println("largest == " + num1);
            System.out.println("smallest == " + num2);
        } else if ( num2 > num1 ){
            System.out.println( num1 + " -- " + num2);
            System.out.println("largest == " + num2);
            System.out.println("smallest == " + num1);
        } else {
            System.out.println("Can't determine which number is larger");
        }
        
        
    }
}
import java.util.Scanner;

public class Powers {
    public static void main (String args[]){
    
    Scanner reader = new Scanner(System.in);
        
    // input
    System.out.print("Please enter an integer--> ");
    int num = reader.nextInt();
    
    // output
    int square = num * num;
    int cube = square * num;
    int forthPower = cube * num;
    
    System.out.println();
    System.out.println("The Square = " + square);
    System.out.println("The Cube = " + cube);    
    System.out.println("The Forth Power = " + forthPower);    
    
    }
}

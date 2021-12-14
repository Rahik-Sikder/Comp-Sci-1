import java.util.Scanner;

public class OddEvenInt {
    public static void main (String args[]){
    
        Scanner reader = new Scanner(System.in);
        
        System.out.print("Enter an integer number :: ");
        int num = reader.nextInt();
        
        if(num % 2 == 1){
            System.out.println(num + " is odd");
        } else {
            System.out.println(num + " is even");
        }

    }
}

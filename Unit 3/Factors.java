import java.util.Scanner;

public class Factors {
    public static void main (String args[]){
        Scanner reader = new Scanner(System.in);
        
        System.out.print("Enter your number --> ");
        int input = reader.nextInt();
        
        System.out.print(input + " has factors ");
        
        int i = 1;
        while(i <= input / 2){
            if(input % i == 0){
                System.out.print(i + " ");
            }
            i++;
        }
        
        System.out.print(input);
    
    }
}
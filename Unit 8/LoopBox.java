import java.util.Scanner;
            
public class LoopBox {
    public static void main(String args[]){
            
        Scanner reader = new Scanner(System.in);
            
        System.out.print("Enter a number --> ");
        int size = reader.nextInt(); 
            
            
        for(int i = 1; i <= size; i++){
            for(int j = size; j >= i; j--){
                System.out.print("*");
            }
            
            for(int k = 1; k <= i; k++){
                System.out.print("#");
            }
            
            System.out.println();
        }   
            
            
            
            
    }
}
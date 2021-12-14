import java.util.Scanner;

public class TriangleLetters2 {
    public static void main(String[] args){
    
        Scanner reader = new Scanner(System.in);
        
        System.out.print("Enter the size of the triangle : ");
        int size = reader.nextInt();
        reader.nextLine();
        
        System.out.print("Enter a letter : ");
        char let = reader.nextLine().charAt(0);
        
        for(int i = 1; i <= size; i ++){
            for(int j = size; j >= i; j--)
                System.out.print(let + "");
            System.out.println();
        }
        
        
        
        
    }    
}
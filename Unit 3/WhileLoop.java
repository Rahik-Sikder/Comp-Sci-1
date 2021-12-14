import java.util.Scanner;

public class WhileLoop {
    public static void main (String args[]){
    
        Scanner reader = new Scanner(System.in);
        
        int i = 0;
        
        while(i < 10){
            System.out.print(i + " ");
            i++;
        }
        
        
        // 0-50
        
        
        while(i <= 20){
             System.out.print(i + " ");
            i++;
        }
        
        
        System.out.println();
        
        // while loops are useful when we don't know how many iterations we need
        
        String input = "";
        String password = "password";
        

        while(!input.equals(password)){ // while iinput is not password keep looping
            System.out.print("Enter your password: ");
            input = reader.nextLine();
            
            if(input.equals(password)){
                System.out.print("You have logged in");
            } else {
                System.out.println("Try again.");
            }
        }
        
        
        
        
        
    }
}
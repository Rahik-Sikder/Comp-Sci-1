import java.util.Scanner;

public class BinaryToTen {
    public static void main (String args[]){
         
      // Basic, not cool solution
        /*
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter binary number ");
        
        String input = reader.next();
        int total = 0;
        int j = 0;
        for(int i = input.length() - 1; i >= 0; i--){  
            if(input.charAt(i) == '1'){
                total += Math.pow(2, j);
            }
            j++;
        }
        
        System.out.println(input + " == " + total);
        
       */ 
        
   // /*  
      // Cool Math Solution
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter binary number ");
        long binary = reader.nextLong();
        
        long inputHolder = binary;
        long total = 0;
        // dont know the cap yet
        boolean endLoop = true;
        int i = 0;
        while(endLoop){
           
           if(binary % 2 == 1 ){
               total += Math.pow(2, i);
           }
           binary =  binary / 10;
           endLoop = binary != 0;
           i++;
        }
        
        
        System.out.println( inputHolder + " == " + total);
    // */
    }
}


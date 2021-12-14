import java.util.Arrays;

public class PrintingArrays{
    public static void main(String args[]){
        
        // ways of printing out array values
        int[] scores = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        
        System.out.print(scores[0] + " ");
        System.out.print(scores[1] + " ");
        System.out.print(scores[2] + " ");
        System.out.print(scores[3] + " ");        
        
        System.out.println();
        
        for(int i = 0; i < scores.length; i++){
            System.out.print(scores[i] + " "); 
        }
        
        System.out.println("\nEnhanced for loop");
        
        for(int num : scores){ // For each num inside scores do this
            System.out.print(num + " ");        
        }
        
        
        // Printing array with toString
        // 1. import java.util.Arrays
        System.out.println("\n" + Arrays.toString(scores));
        
        
        
    }
}
import java.util.Scanner;

public class LoopStats {
    public static void main (String args[]){
    
    /* you ask the use for a start and stop value
     * then make a loop that starts at the start and 
     * stops at the stop counting by 1
     * as it does that keep track fo 3 things:
     * 1. the total - add together all the values of i 
     * 2. how many values of i that were even
     * 3. how many values of i that were odd
     */    
    
    Scanner reader = new Scanner(System.in);
    
    System.out.print("Enter loop start --> ");
    int start = reader.nextInt();
    System.out.print("Enter loop end --> ");
    int end = reader.nextInt();
    
    
    int total = 0;
    int evens = 0;
    int odds = 0;
    for(int i = start; i <= end; i++){
        total += i;        
        if ( i % 2 == 0){
            evens++;
        } else {
            odds++;
        }

    }
    
    System.out.println("total: " + total);
    System.out.println("even count: " + evens);
    System.out.println("odd count: " + odds);
    
    
    }
}

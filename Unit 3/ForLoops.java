public class ForLoops{
    public static void main (String args[]){
    
        /* for loops are used to repeat a block of code
         * iterating - repeating a program
         * 
         * parts of for loop
         * 1. Loop control variable - determines when the loop starts and ends.
         * 2. Boolean expression - determines when the loop runs
         * 3. increment - value by which i changes at the end of each iteration
         */
        
        for(int i = 0; i < 10; i++){
            System.out.print(i + " ");
        }
        
        System.out.println();
        // use a loop to print 10 - 0
        
        
        
        for (int i = 10; i >= 0; i--){
            System.out.print(i + " ");
        }
        System.out.println();
        
        for (int i = 0; i <=20; i += 2){
            System.out.print(i + " ");      
        }
        
    }
}
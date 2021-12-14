public class NestedLoops{
    public static void main(String arg[]){
        
        // nested loops are loops made inside other loops
        
        
        /* OUTPUT 1:
         * 1 2 3 4 5 
         * 1 2 3 4 5 
         * 1 2 3 4 5 
         * 1 2 3 4 5
         */
        
        int rows = 5;
        
        for(int i = 1; i <= rows; i++){ // outer loop - reps current row
            for(int j = 1; j <= rows; j++){
                System.out.print(j + " ");
            }    
            System.out.println();
        }
        
        
        System.out.println();
        System.out.println();
        
        
        
        /* OUTPUT 2:
         * 1
         * 1 2
         * 1 2 3
         * 1 2 3 4
         * 1 2 3 4 5
         */
        
        for(int i = 1; i <= rows; i++){ // outer loop - reps current row
            for(int j = 1; j <= i; j++){
                System.out.print(j + " ");
            }    
            System.out.println();
        }
                
        System.out.println();
        System.out.println();

        /* OUTPUT 3:
         * 5 4 3 2 1
         * 5 4 3 2 1
         * 5 4 3 2 1
         * 5 4 3 2 1
         * 5 4 3 2 1
         */
        
        for(int i = 1; i <= rows; i++){ // outer loop - reps current row
            for(int j = rows; j >= 1; j--){
                System.out.print(j + " ");
            }    
            System.out.println();
        }
        
        System.out.println();
        System.out.println();

        /* OUTPUT 4:
         * 5 4 3 2 1
         * 5 4 3 2 
         * 5 4 3 
         * 5 4 
         * 5
         */
        
        for(int i = 1; i <= rows; i++){ // outer loop - reps current row
            for(int j = rows; j >= i; j--){
                System.out.print(j + " ");
            }    
            System.out.println();
        }
        
        
        
        
        
        
        
        
    }
}
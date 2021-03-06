public class RandomExample {
    public static void main (String args[]){
    
        // Math.random()
        // returns a random value in the rande of 0 <= x < 1
        // inputs: n/a
        // output: double
        
        /* Notes on Math.random()
         * 1. Number used to multiply is the max number of outputs.
         * 2. Number added or subtracted is the lowest value in the range.
         * 3. To find the values for method call from a range:
         *  a. substract lower boundary from upper boundary
         *  b. add 1
         *  
         *      ex. [10 - 56] => (int) (Math.random() * 47) + 10;
         *  
         *  
         * 4. To find the values for range from a method call
         *  a. 
         *  b.
         * 
         */
        
        
        // 1. [22, 97]
            System.out.println((int) (Math.random() * 76) + 22);
        // 2. [-9, -3]
            System.out.println((int) (Math.random() * 7) - 9);
        // 3. [1000, 2001]
            System.out.println((int) (Math.random() * 1002) + 1000);
        
        
    }
}
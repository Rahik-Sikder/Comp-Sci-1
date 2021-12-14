public class Rounding {
    public static void main (String args[]){
    
        // Math.ceil(a)
        // Rounds up to the next integer value
        // input: double
        // output: double
        
        double num = 1.000001;
        System.out.println(Math.ceil(num)); // 2.0
        
        
        
        // Math.floor(a)
        // Rounds down to the next integer value
        // input: double
        // output: double
        
        System.out.println(Math.floor(num)); // 1.0
        
        
        // Math.round(a)
        // Round to the next closest integer value. .5 or > goes up
        // input: double or float
        // output: long or int
        // OVERLOADED
        
        int rounded = (int) Math.round(num);
        
        
    
    }
}


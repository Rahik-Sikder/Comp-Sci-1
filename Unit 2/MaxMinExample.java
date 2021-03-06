public class MaxMinExample {
    public static void main (String args[]){
    
    // Math.max(a, b)
    // This method returns the greater of a or b.
    // input: double, float, int, long
    // output: same data type as input
    // OVERLOADED - has more than one version of this method
    
    int num1 = 10;
    int num2 = 5;
    
    int greatest = Math.max(num1, num2);
    
    System.out.println(Math.max(num1, num2));
    System.out.println(greatest);
    
    Math.max(99,1); // DO NOT DO THIS - THIS IS BAD
    
    // Math.min(a, b)
    // returns the smaller value of a and b
    // input: double, float, int, long
    // output: same data type as input
    // OVERLOADED - has more than one version of this method    
    
    int a = 2;
    int b = 4;
    int c = -3;
    
    // USE MATH.MIN TO PRINT SMALLEST VALUE
   
    System.out.println(Math.min(a, Math.min(b, c)));
    

    
    }
}


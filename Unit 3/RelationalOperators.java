public class RelationalOperators {
    public static void main (String args[]) {
        
        // These operators are used to test the relationship between two values
        // they return either true or false
        
        // ALL MY HOMIES HATE ANNOUCEMENTS
        
        // 1. equality operator ( == ) - this checks if two values are the same
        // returns true if same.
        
        int num1 = 10;
        int num2 = 9;
        System.out.println(num1 == num2); // false
        
        
        // 2. less than / greater than
        
        boolean isLessThan = 5 < 2; // false
        boolean isGreaterThan = 5 > 2; // true
        
        
        // 3. 3. less than / greater than equal to
        int num3 = 10;
        System.out.println(num1 >= num3);
        
        
        // 4. not equals ( != ) - this checks if two values are not the same
        // returns true when values are not the same
        
        boolean notEquals = num1 != num2; // true
        
        
        char let1 = 'A'; // 65
        char let2 = 'B'; // 66
        
        boolean chars = let1 < let2; // true
        
        
    
    }
}
public class CalcRunner {
    public static void main (String args[]){
    
        Calculator calc = new Calculator();
        
        calc.addVoid(10, 15);
        calc.addVoid(5, 10);
        
        calc.addReturn(1,2); // doesn't do anything        
        System.out.println(calc.addReturn(1,2)); 
        // return methods must be called as part of some other statement
        
    }
}
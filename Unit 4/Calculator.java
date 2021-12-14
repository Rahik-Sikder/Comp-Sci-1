public class Calculator {
    
    // This class is our "blueprint" for a calculator object
    // Actions: 
    // add
    // subt
    // mult
    // div
    
    public void  addVoid(int num1, int num2){
        int sum = num1 + num2;
        System.out.println(num1 + " + " + num2 + " = " + sum);
    }
    
    
    public int addReturn(int num1, int num2){
        int sum = num1 + num2;
        return sum;
    }
    
    public int subReturn(int num1, int num2){
        int diff = num1 - num2;
        return diff;
    }
    
    public double divReturn(int num1, int num2){
        double quo = (double) num1 / num2;
        return quo;
    }
    
        public int multReturn(int num1, int num2){
        return num1 * num2;
    }
    
    
}
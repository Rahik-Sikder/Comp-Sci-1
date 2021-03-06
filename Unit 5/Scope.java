public class Scope {

    // Classes contain two things: methods and data values
    // Scope determines where a variable exists in our code
    // Scope is defined bt { }
    
    private int num2 = 10; // This is an instance variable: 
                           // everything in this class has access
    
    
    public void printNum(){
        int num = 5; // this is a local variable: it only  exists in this method
        System.out.println(num);
    } 
    
    
    public void printNum2(){
        // System.out.println(num);
        // Does not work because num is only defined inside printNum()
        int num2 = 500;
        System.out.println(this.num2);
        // this is a class's internal self reference 
    }
    
    

}
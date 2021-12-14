public class Init{
    // this class will demonstrate how instance and local variable are initialized. 
    
    private int num; // 0
    private double dub; // 0.0
    private boolean bool; // false
    private char let; // null char (nothing)
    private String str; // null (null is the default value for all objects)
    
    
    public void printVars(){
        System.out.println("num: " + num);
        System.out.println("dub: " + dub);
        System.out.println("bool: " + bool);
        System.out.println("let: " + let);
        System.out.println("str: " + str);
        int num2;
        // System.out.println(num2); local variable must be initialized 
    }
    
    
    
    
}
public class BooleanVariables {
    public static void main (String args[]){
    
    // Boolean variables are used to store either true or false.
    
    boolean bool1 = false;

    // Boolean variables are useful when comparing values in our code
    
    int num1 = 10;
    int num2 = 5;
    
    boolean bool2 = num1 < num2;
    
    System.out.println(bool2);
    
    
    boolean keepLoopin = true;
    int counter = 0;
    
    while(keepLoopin){
        System.out.println("We loopin");
        counter++;    
        keepLoopin = counter < 10;
   
    }
    
    
    
    
    
    
    
    }
}





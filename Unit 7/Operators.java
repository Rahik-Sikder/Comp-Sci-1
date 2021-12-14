public class Operators {
    public static void main(String args[]){
        
        // AND - (&& or &) - returns true when both conditions are true
        // && vs & - && will allow the program to "shortcircuit"
        // && will skip second condition when first is false
    
        System.out.println("If you are older than 10 and less than 16, you can party");
        int age = 15;
        
        if(age > 10 && age < 16){
            System.out.println("You can party at chucky the cheese");
        } else {
            System.out.println("Get lost nerd.");
        }
        
        
        // OR (|| or |) - 
        
        System.out.println("If you are younger than 9 OR older than 18, you can party!");
        
        if(age < 9 || age > 18){
            System.out.println("Welcome to applebees");
        } else {
            System.out.println("Go to chilis nerd");
        }
        
        
        
        // XOR - ^ - checking for differences 
        
        System.out.println("If you or your friend are 16, but not both of you, you can party");
        int age2 = 16;
        if(age == 16 ^ age2 == 16){
            System.out.println("Welcome to donalds");
        } else {
            System.out.println("I know for a fact you don't party");
            // Watch Hotrod
        }
        
        
        // not ( ! )
        
        
        
        
        /*
        System.out.println("");
        
        if(true){
            System.out.println("");
        } else {
            System.out.println("");
        }
        */
        
    }
    
    public boolean isEven(int x){
        return x % 2 == 0;
    }
    
    
}
    
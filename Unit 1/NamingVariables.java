public class NamingVariables{
    public static void main(String args[]){
    
        // these rules will cause errors if broken
        
        // 1. Variables may not begin with a digit
            // int 123num = 10;
               int num123 = 10; // this works though
        
        // 2. Variables may not contain punctuation chars
            // int cool.Name? = 5;
            
        // 3. Variables may not contain spaces
            // int money in account = 50;
               int moneyInAccount = 50; // Use camel case instead
        
        // 4. Variables may not contain reserved words.
            // int final;
            // generally if it turns a diff color it's a reserved word
               
        // 5. Variables are case sensitive    
            // int num1 = 50;
            // System.out.println(Num1);
            // Java will think we are trying to reference a seperate variable
            
        
            
        // These following rules are for following convention
        
        // 1. Variables should always start with a lowercasse char
            int grades = 100;
            
        // 2. Class names always start with an uppercase char
        
        // 3. Variables must be self describing
            // if you want a variable to money you have
            int a = 50;
            int money = 50;
            // for the first example, someone reading the code would not know
            // what the variable a stands for. 
            
        // 4. Variables must be "camelcase"
            // every word after the first has a capital letter
               int reallycoolandlongvariablename; // not camelcase
               int reallyCoolAndLongVariableName; // camel case
        
        
        
               
    }
}
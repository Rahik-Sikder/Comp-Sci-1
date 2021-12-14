public class HelperMethods {
    public static void main(String args[]){
    
        HelperMethods hm = new HelperMethods();
        
        hm.printTitleCase("hi how are you?");
    
    
    
    }
    
    // Helper methods are used to "decompose" a complicated method inot several smaller methods.
    // This makes our code easier to write and maintain
    
    // hi how are you? ==> Hi How Are You?
    public void printTitleCase(String title){
        String output = "";
        // lowercase [97 - 122]
        // uppercase [65 - 90]
        
        
        for(int i = 0; i < title.length(); i++){
            
            // fix first letter if lowercase
            
            if (i == 0 && getIsLowercase(title.charAt(i))){
                output += makeUppercase(title.charAt(i));
            }           
            
            // fix first letter of each word
            
            else if(title.charAt(i-1) == ' ' && getIsLowercase(title.charAt(i))){
                output += makeUppercase(title.charAt(i));
            }
            
            // else add letter to output
            else {
                output += title.charAt(i);
            }
        
        }
        
        System.out.println(output);
    }
    
    private boolean getIsLowercase(char let){
        return let >= 97 && let <= 122;
    }
    
    private char makeUppercase(char let){
        return (char) (let - 32);
    }
}
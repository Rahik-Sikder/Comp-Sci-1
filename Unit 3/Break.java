public class Break {
    public static void main (String args[]){
        
        // break is used to exit a loop
        
        String word = "lskafhweababfdsajkbvdporawi";
        
        // Write a loop to determine if the string contains a r
        
        String output = "Does not contain 'r'";
        for (int i = 0; i < word.length(); i++){  
            if(word.charAt(i) == 'r'){
                output = "Contains 'r'";
                break; // this ends the loop
            }
        }
    
        
        System.out.println(output);
    }
}
public class StringLoops {
    public static void main (String args[]){
    
        // Printing a string one letter at a time using a loop
        
        String word = "computer";
        //             01234567
        
        for (int i = word.length(); i > 0; i--){
            System.out.print(word.substring(i-1, i) + " ");
        }
        
    
    }
}
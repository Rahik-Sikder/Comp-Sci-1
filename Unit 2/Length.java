public class Length {
    public static void main (String args[]) {
    
        /* length()
         * returns the number of chars in a string
         * input: n/a
         * output: int
         */
        
        String word = "tacocat";
        // index       0123456
        // length 7
        
        
        int num = word.length();
        
        
        System.out.println("Last index: " + ( word.length() - 1 ) );
        
        System.out.println("Last char: " + word.charAt( word.length() - 1 ) );
        
        System.out.println("Last char: " + word.substring(word.length() - 1, word.length()) );
        
        
    }
}
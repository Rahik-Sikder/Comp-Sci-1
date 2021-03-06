public class CharAt {
    public static void main (String args[]){
        
        // Strings are not a basic datatype
        
        String word = "Hello";  // Strings are objects from the String class.
        // index       01234
        
        String word2 = new String("World"); // making a string like an object
        //                         01234
        
        
        /* charAt(int a)
         * returns the character at index a
         * input: int
         * output: char
         */
        
        char let = word.charAt(4);
        System.out.println(let);
        
        String fullName = "Adam Eric Smith";
        // index           012345678901234    
        
        
        // make three variables to store each capital letter
        
        char cap1 = fullName.charAt(0);
        char cap2 = fullName.charAt(5);
        char cap3 = fullName.charAt(10);
        
        System.out.println("" + cap1 + cap2 + cap3);
        // can't concatinate unless you introduce a string to change the context
        
    }
}
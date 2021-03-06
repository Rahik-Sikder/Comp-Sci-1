 public class IndexOf {
    public static void main (String args[]){
        
        /* indexOf(char a) OR indexOf(String a) OVERLOADED
         * Returns the index of a in a stirng
         * input: char or String
         * output: int
         */
        
        
        String word = "bobcat";
        // index       012345
        
        System.out.println("The index of b: " + word.indexOf('b')); // 0
        // you can also input "b" it doesn't matter
        // this method returns the first instance of the String/char
        
        System.out.println("The index of ca: " + word.indexOf("ca")); // 3
        // the method returns when the String starts
        
        System.out.println("the index of x: " + word.indexOf("x")); // -1
        // when we don't find the String/char, the method returns -1
        
    
    }
}
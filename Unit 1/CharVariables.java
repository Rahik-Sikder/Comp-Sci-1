public class CharVariables{
    public static void main (String args[]){
    
    // The char datatype stores a single ASCII characters
    
    char let1 = 'A'; // 'A' is a char literal
    
    System.out.println(let1);
    
    // initializing with an int literal
    
    char let2 = 67;
    
    System.out.println(let2);
    
    
    
    char letX = 'X';
    char letY = 'Y';
    char letZ = 'Z';
    
    
    System.out.println(letX + letY + letZ);
    System.out.println("" + letX + letY + letZ);
    // we trick Java into concatenating because Java concatenates instead of adding when
    // it sees a String
    
    }
}
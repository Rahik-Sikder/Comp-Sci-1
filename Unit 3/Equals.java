import java.util.Scanner;

public class Equals {
    public static void main(String args[]){
        
        Scanner reader = new Scanner(System.in);
        
        // Using == to compare strings is DANGEROUS!!
        
        String word1 = "hello"; // word1 is a reference to "hello" as it is stored in the mem
        String word2 = new String("hello"); // word2 references the same object as word1
        String word3 = "hello"; // cretaes a new object with reference word3
        
        System.out.println(word1 == word2);
        System.out.println(word3 == word1);
        
        System.out.print("Enter a password: ");
        String input = reader.nextLine();
        
        String password = "password";
        
        if(input.equals(password)){
            System.out.println("You have logged in");
        } else {
            System.out.println("Try again");
        }
        
        // with the equals() you have to remember that it is case sensitive
        // the alternative is equalsIgnoreCase() which ignores case
        
    }
}
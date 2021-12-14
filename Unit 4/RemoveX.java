import java.util.Scanner;

public class RemoveX {
    public static void main(String args[]){
        Scanner reader = new Scanner(System.in);
    
        System.out.print("Enter a String");
        String input = reader.nextLine();
        
        System.out.println(input + " -> " + removeX(input));
        
        
    }
    
    public static String removeX(String word) {
        String output = "";
        for (int i = 0; i < word.length(); i++){
            if(!word.substring(i,i+1).equalsIgnoreCase("X")){
                output += word.substring(i, i+1);
            }
        }
        return output;
    }
    
}

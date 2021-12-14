import java.util.Scanner;

public class BaskwardsString {
    public static void main (String args[]){

        Scanner reader = new Scanner(System.in);

        System.out.print("Enter String --> ");
        String input = reader.nextLine();

        // First letter
        System.out.println(input.charAt(0));

        // Last letter
        System.out.println(input.charAt(input.length()-1));

        // String backwards        
        for(int i = input.length()-1; i >= 0; i--){
            System.out.print(input.charAt(i));
        }
        System.out.println();

        // String 
        System.out.println(input);


        reader.close();
    }
}

import java.util.Scanner;

public class Square {
    public static void main (String args[]){

        Scanner reader = new Scanner(System.in);
        System.out.print("Enter word --> ");
        String word = reader.nextLine();

        String width = ""; 
        for(int i = 1; i < word.length() - 1; i++) {
            width += " "; 
        }

        System.out.println(word);
        for (int i = 0; i < word.length(); i++){
            System.out.println(word.charAt(i) + width + word.charAt(word.length()- 1 - i));
        }
        System.out.println(word);

        reader.close();  // Sorry it's just annoying to see 
                         // the IDE constantly telling me to close the Scanner
    }
}

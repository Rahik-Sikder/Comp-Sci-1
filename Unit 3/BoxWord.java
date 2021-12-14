import java.util.Scanner;

public class BoxWord {
    public static void main(String args[]) {
        
        Scanner reader = new Scanner(System.in);

        System.out.print("Enter word --> ");
        String word = reader.nextLine();
        System.out.println();

        for(int i = 0; i < word.length(); i++){
            System.out.println(word);

        }
       reader.close();   // Sorry it's just annoying to see 
                         // the IDE constantly telling me to close the Scanner
    }
}

import java.util.Scanner;

public class DecreasingWord {
    public static void main (String args[]){

        Scanner reader = new Scanner(System.in);

        System.out.print("Enter word --> ");
        String word = reader.nextLine();
        System.out.println();

        for(int i = word.length(); i > 0 ; i--){
            System.out.println(word.substring(0,i));

        }
       reader.close();   // Sorry it's just annoying to see 
                         // the IDE constantly telling me to close the Scanner

    }
}

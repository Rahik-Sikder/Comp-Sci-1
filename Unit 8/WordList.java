import java.util.Scanner;

public class WordList {
    public static void main(String args[]){
        
        Scanner reader = new Scanner(System.in);
        
        String[] words = new String[10];
        
        for(int i = 0; i < words.length; i++){
            words[i] = reader.nextLine();
        }
        
        System.out.println();
        
        for(String s : words){
            System.out.println(s);
        }
                
        
    }
}
import java.util.Scanner;

public class Replace {
    public static void main (String args[]){
    
      Scanner reader = new Scanner(System.in);
      
      System.out.print("Enter a string --> ");
      String input = reader.nextLine();
      int firstA = input.indexOf("a");
      
      System.out.println();
      if(input.length() != 0){
          
          String firstSub = input.substring(0, firstA);
          String secondSub = input.substring(firstA + 1);
          System.out.println( firstSub + "*" + secondSub);
      } else {
          System.out.println("Input something next time");
      }
      
      
      
     
      
      
        
    }
}
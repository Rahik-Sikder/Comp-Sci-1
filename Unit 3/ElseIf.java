import java.util.Scanner;

public class ElseIf {
    public static void main(String args[]){
        
        Scanner reader = new Scanner(System.in);
        
        // Else if is used to create multiple options in our code
        
        System.out.print("Enter the temp: ");
        int temp = reader.nextInt();
        
        /* 90+      Eat ice cream while swimming
         * 75-89    Play football or something
         * 65-74    Frisbee 
         * 55-64    B-ball w/  the boyz
         * 33-54    Hit the weightz
         * 0-32     SHRED THE SLOPES
         * <0       Put on a sweater
         */
        
        String output = "";
        if(temp > 90) {
            output = "Eat ice cream";
        } else if (temp > 75) {
            output = "Play football or something";
        } else if (temp > 65) {
            output = "Frisbee";
        } else if (temp > 55) {
            output = "B-ball w/ the boys";
        } else if (temp > 33) {
            output = "Hit the weightz";
        } else if (temp > 0) {
            output = "SHRED THE SLOPES";
        } else {
            output = "Put on a sweater";
        }
        
        
    }
}
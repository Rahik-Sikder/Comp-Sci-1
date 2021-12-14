import java.util.Scanner;

public class TimesTable {
    public static void main(String args[]){
        
        for(int i = 1; i <= 10; i++){
            
            for(int j = 1; j <= 10; j++){
                if(i * j < 10)
                    System.out.print((i * j) + "   ");
                if(i * j >= 10 && i * j != 100)
                    System.out.print((i * j) + "  ");
                if(i * j == 100)
                    System.out.print((i * j) + " ");
            }
            
            System.out.println();
        }
        
        
    }
}
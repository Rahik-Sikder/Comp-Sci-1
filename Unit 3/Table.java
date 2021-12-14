import java.util.Scanner;

public class Table {
    public static void main (String args[]){
        Scanner reader = new Scanner(System.in);
    
        int table;
        do {
            System.out.print("Enter table length --> ");
            table = reader.nextInt();
            if(table <= 0) System.out.println("Enter a valid length\n");
        } while (table <= 0);
        System.out.println();
        System.out.println("  N  10*N  100*N  1000*N");
        System.out.println("----------------------------");
        
        int i = 1;
        
        do {
            System.out.println( "  " + i 
                                + "   " + (i * 10) 
                                + "    " + (i * 100)
                                + "    " + (i * 1000));
            i++;
        } while(table >= i);
    
    }
}
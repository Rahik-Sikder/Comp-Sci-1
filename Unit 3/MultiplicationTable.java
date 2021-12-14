import java.util.Scanner;

public class MultiplicationTable {
    public static void main (String args[]){

        Scanner reader = new Scanner(System.in);

        System.out.print("Enter table type --> ");
        int tableType = reader.nextInt();

        System.out.print("Enter number of rows --> ");
        int rows = reader.nextInt();

        System.out.println();
        System.out.println("Multiplication Table for " + tableType);
        int value = 0;
        for(int i = 1; i < rows + 1; i++){
            value += tableType;
            System.out.println(i + " * " + tableType + " =  " + value);
        }


        reader.close();
    }
}

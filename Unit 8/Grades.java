import java.util.Scanner;

public class Grades{
    
    static double[] grades = new double[50];
    static int size = 0;
    
    public static void main(String args[]){
        
            System.out.println("Input grades. Type -1 to stop typing in grades");
            readWords();
            
            double sum = 0;
            for(int i = 0; i < size; i++){
                sum += grades[i];
            }
            
            double avg = sum / size;
            
            System.out.println();
            System.out.println("average = " + String.format("%.2f", avg));
        
    }   
    
    public static void readWords() {
        Scanner reader = new Scanner(System.in);
        System.out.print("grade " + size + " :: \t");
        double input = reader.nextDouble();
        if(input != -1){
            grades[size] = input;
            size++;
            readWords();
        }
        
    }
}       
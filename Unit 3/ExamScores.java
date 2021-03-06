import java.util.Scanner;

public class ExamScores{
    public static void main (String args[]){
        Scanner reader = new Scanner(System.in);
        
        System.out.print("Enter in your grades, press -1 to get Summary Report\n");
        
        int input = 0;
        int counterA = 0;
        int counterB = 0;
        int counterC = 0;
        int counterD = 0;
        int counterF = 0;
        int counterAll = 0;
        
        while(input != -1){
            
            System.out.print("Enter grade: ");
            input = reader.nextInt();
        
            if(input > 100){
                System.out.println("Not a valid grade");
            }   else if (input >= 90){
                counterA++;
                counterAll++;
            } else if (input >= 80){
                counterB++;
                counterAll++;
            } else if (input >= 70){
                counterC++;
                counterAll++;
            } else if (input >= 60){
                counterD++;
                counterAll++;
            } else if (input >= 0){
                counterF++;
                counterAll++;
            } else if (input == -1){
                // do nothing
            } else {
                System.out.println("Not a valid grade");
            } 
            
        }
        
        System.out.println("==========================");
        System.out.println("      Summary Report      ");
        System.out.println("==========================");
        System.out.println("Total number of grades = " + counterAll);
        System.out.println("Number of A's = " + counterA);
        System.out.println("Number of B's = " + counterB);
        System.out.println("Number of C's = " + counterC);
        System.out.println("Number of D's = " + counterD);
        System.out.println("Number of F's = " + counterF);
        
        
    }
}
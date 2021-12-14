import java.util.Scanner;

public class LetterGrade {
    public static void main(String args[]){
        Scanner reader = new Scanner(System.in);
    
    
        System.out.print("Enter a Numerical Grade --> ");
        int grade = reader.nextInt();
        
        String letterGrade;
        if(grade > 100 || grade < 0){
            letterGrade = "ERROR: NOT A VALID GRADE";
        } else if (grade <=100 && grade >= 97){
            letterGrade = "A+";
        } else if (grade >= 94){
            letterGrade = "A";
        } else if (grade >= 90){
            letterGrade = "A-";
        } else if (grade >= 87){
            letterGrade = "B+";
        } else if (grade >= 84){
            letterGrade = "B";
        } else if (grade >= 80){
            letterGrade = "B-";
        } else if (grade >= 77){
            letterGrade = "C+";
        } else if (grade >= 74){
            letterGrade = "C";
        } else if (grade >= 70){
            letterGrade = "C-";
        } else {
            letterGrade = "F";
        } 
        
        System.out.println("Letter Grade = " + letterGrade);
        
        
    
    }
}
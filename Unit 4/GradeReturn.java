import java.util.Scanner;

public class GradeReturn {
    public static void main(String args[]){
        Scanner reader = new Scanner(System.in);
        
        System.out.print("Enter grade number: ");
        int grade = reader.nextInt();
        
        System.out.println("You earned a: " + gradeReturn(grade));
    }
    
    public static String gradeReturn(int grade) {
        if(grade >= 90 && grade <= 100)
            return "A";
        if(grade >= 80 && grade <= 90)
            return "B";
        if(grade >= 70 && grade <= 80)
            return "C";
        if(grade >= 60 && grade <= 70)
            return "D";
        if(grade >= 0 && grade <= 70)
            return "F";
            
        return "Invalid Grade";    
    }
}
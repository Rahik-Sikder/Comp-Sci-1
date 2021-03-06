import java.util.*;

public class AssignmentManager {
    public static void main(String[] args) {
        
        System.out.println("/**************************************/");
        System.out.println("/*      Test Default Constructor      */");
        System.out.println("/*      and Accessor methods          */");
        System.out.println("/**************************************/");
        
        Assignment assign1 = new Assignment();
        System.out.println("Type\t\t: " + assign1.getType());
        System.out.println("Name\t\t: " + assign1.getName());
        System.out.println("Score\t\t: " + assign1.getScore());
        System.out.println("Letter Grade\t: " + assign1.getLetterGrade());
        
        System.out.println("\n/**************************************/");
        System.out.println("/*        Test 2nd Constructor        */");
        System.out.println("/*        and Accessor methods        */");
        System.out.println("/**************************************/");
        
        Assignment assignTest = new Assignment("Chapter 1 Test", "Test", 95);
        System.out.println("\nType\t\t: " + assignTest.getType());
        System.out.println("Name\t\t: " + assignTest.getName());
        System.out.println("Score\t\t: " + assignTest.getScore());
        System.out.println("Letter Grade\t: " + assignTest.getLetterGrade());
        
        Assignment assignQuiz = new Assignment("Chapter 1 Quiz", "Quiz", 83);
        System.out.println("\nType\t\t: " + assignQuiz.getType());
        System.out.println("Name\t\t: " + assignQuiz.getName());
        System.out.println("Score\t\t: " + assignQuiz.getScore());
        System.out.println("Letter Grade\t: " + assignQuiz.getLetterGrade());
        
        
        System.out.println("\n/**************************************/");
        System.out.println("/*        Test 2nd Constructor        */");
        System.out.println("/*        and Accessor methods        */");
        System.out.println("/**************************************/");

        assignTest.setScore(75);
        System.out.println("\nType\t\t: " + assignTest.getType());
        System.out.println("Name\t\t: " + assignTest.getName());
        System.out.println("Score\t\t: " + assignTest.getScore());
        System.out.println("Letter Grade\t: " + assignTest.getLetterGrade());
        
        assignQuiz.setScore(30);
        System.out.println("\nType\t\t: " + assignQuiz.getType());
        System.out.println("Name\t\t: " + assignQuiz.getName());
        System.out.println("Score\t\t: " + assignQuiz.getScore());
        System.out.println("Letter Grade\t: " + assignQuiz.getLetterGrade());
        
        
        
    }
}
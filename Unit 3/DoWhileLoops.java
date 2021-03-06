import java.util.Scanner;

public class DoWhileLoops {
    public static void main (String args[]){
    
        // DO WHILE LOOPS ARE SIMILAR TO WHILE LLOPS
        // ONLY DIFFERENCE: DO WHILE LOOPS WILL ALWAYS RUN AT LEAST ONE TIME
        
        // Ask the user for age and name of several students
        // Determine who the youngest student is
        // Use will enter exit to end the loop
        
        Scanner reader = new Scanner(System.in);
        
        String name = "";
        int age = 0;
        
        String youngName = "";
        int youngAge = 1000;
        
        System.out.println("Enter student names and ages, type exit to stop");
        
        do {
            System.out.print("Enter students name: ");
            name = reader.nextLine();
            
            if(name.equals("exit")) break;
            
            System.out.print("Enter age number: ");
            age = reader.nextInt();
            reader.nextLine(); 
            /* this will grab the extra "enter key" from the Scanner
             * this is a dummy line, must use when switching from nextInt to nextLine
             */ 
                
            
            if (age < youngAge){
                youngAge = age;
                youngName = name;
            }
            
            
        } while (!name.equals("exit"));
        
        
        System.out.println("Name: " + youngName + "\nAge: " + youngAge);
        
    }
}
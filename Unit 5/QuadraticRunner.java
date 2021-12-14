import java.util.Scanner; 
import static java.lang.System.*;
import static java.lang.Math.*;

public class QuadraticRunner {
	public static void main( String[] args ){
	    
	Scanner reader = new Scanner(System.in);    
   	//add test cases
   	System.out.print("Enter a: ");
   	int a = reader.nextInt();
   	System.out.print("Enter b: ");
   	int b = reader.nextInt();
   	System.out.print("Enter c: ");
   	int c = reader.nextInt();
   	
   	Quadratic quad = new Quadratic(a, b, c);
   	System.out.println("\n");
   	quad.calcRoots();
   	quad.print();
   	System.out.println("\n\n\n");
   	
   	
   	System.out.print("Enter a: ");
   	a = reader.nextInt();
   	System.out.print("Enter b: ");
   	b = reader.nextInt();
   	System.out.print("Enter c: ");
   	c = reader.nextInt();
		
   	quad.setEquation(a,b,c);
   	quad.calcRoots();
   	quad.print();
   	System.out.println("\n\n\n");
   	
   	
   	System.out.print("Enter a: ");
   	a = reader.nextInt();
   	System.out.print("Enter b: ");
   	b = reader.nextInt();
   	System.out.print("Enter c: ");
   	c = reader.nextInt();
		
   	quad.setEquation(a,b,c);
   	quad.calcRoots();
   	quad.print();
   	System.out.println("\n\n\n");
   	
	}
}
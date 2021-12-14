import java.util.Scanner; 
import java.lang.Math.*;

public class Triangle {
    private int sideA, sideB, sideC;
    private double perimeter;
    private double theArea;

    public Triangle() {
       setSides(0,0,0);
       perimeter=0;
       theArea=0;
    }

    public Triangle(int a, int b, int c) {
       sideA = a;
       sideB = b;
       sideC = c;
    }


    public void setSides(int a, int b, int c) {
       sideA = a;
       sideB = b;
       sideC = c;
    }

    public void calcPerimeter( ) {
        perimeter = sideA + sideB + sideC;
    }

    public void calcArea( ){
        double s = perimeter / 2;
        theArea = Math.sqrt(s * (s-sideA) * (s - sideB) * (s - sideC));

    }

    public void print( ) {
        System.out.println();
        System.out.println(sideA + " " + sideB + " " + sideC);
        System.out.println("Area == " + theArea);
        System.out.println("\n\n");
    }	
}
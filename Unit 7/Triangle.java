import java.util.*;

public class Triangle {
    private int side1;
    private int side2;
    private int side3;

    public Triangle() {
        setSides(0, 0, 0);
    }

    public Triangle(int s1, int s2, int s3) {
        setSides(s1, s2, s3);
    }

    public void setSides(int s1, int s2, int s3) {
        side1 = s1;
        side2 = s2;
        side3 = s3;
    }

    public String getTriangleType() {
        
     
            
        if ((side1 == side2) && (side2 == side3)){
            return " equailataral";
        } else if ((side1 == side2) || (side2 == side3) || (side1 == side3)){
            return " isosclesis";
        } else{
            return " scalenece";
        }
 
        // implement this method using logical operators
       
    }
}
import java.util.Scanner;

public class FahrenheitToCelsius {
    public static void main(String args[]){
        Scanner reader = new Scanner(System.in);
        
        System.out.print("Enter your temperature :: " );
        double tempF = reader.nextDouble();
        
        System.out.println("\nVoid Method :: ");
        convertVoid(tempF);
        
        
        System.out.println("\nReturn Method :: " );
        double tempC = convertReturn(tempF);
        System.out.println(tempF 
                            + " degrees Fahrenheit == " 
                            + String.format("%.2f",tempC) 
                            + " degrees Celsius");
        
        
        
    }
    
    public static void convertVoid(double tempF){
        double tempC = (tempF - 32) * 5 / 9;
        System.out.println(tempF 
                            + " degrees Fahrenheit == " 
                            + String.format("%.2f",tempC) 
                            + " degrees Celsius");
    }
        
    
    public static double convertReturn(double tempF){
        return (tempF - 32) * 5 / 9;    
    }
    
}
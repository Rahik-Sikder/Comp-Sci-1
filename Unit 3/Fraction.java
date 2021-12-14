import java.util.Scanner;

public class Fraction {
    public static void main(String args[]){
        Scanner reader = new Scanner(System.in);
        
        int num1;
        int denom1;
        String operator;
        int num2;
        int denom2;
        int numAns;
        int denomAns;
        
        
        System.out.print("Enter Fraction Problem (ex: 2/3 + 3/4) --> ");
        String input = reader.nextLine();
        System.out.println();
        
        num1 = Integer.parseInt(input.substring(0,1));
        denom1 = Integer.parseInt(input.substring(2,3));
        num2 = Integer.parseInt(input.substring(6,7));
        denom2 = Integer.parseInt(input.substring(8,9));
        operator = input.substring(4,5);
        
        // calculations
        
        if (operator.equals("+")){
            denomAns = denom1 * denom2;
            numAns = (num1*denom2) + (num2*denom1);
            System.out.println(input + " = " + numAns + "/" + denomAns);
        } else if (operator.equals("-")){
            denomAns = denom1 * denom2;
            numAns = (num1*denom2) - (num2*denom1);
            System.out.println(input + " = " + numAns + "/" + denomAns);
        } else if (operator.equals("*")){
            denomAns = denom1 * denom2;
            numAns = num1 * num2;
            System.out.println(input + " = " + numAns + "/" + denomAns);
        } else if (operator.equals("/")){
            denomAns = denom1 * num2;
            numAns = denom2 * num1;
            System.out.println(input + " = " + numAns + "/" + denomAns);
        } else {
            System.out.println("ERROR");
        }
        
        
        
        
    }
}
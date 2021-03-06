
import java.util.*;

public class Methods
{
    /** @return the square of num
     *  @param num the number to be squared
     */
    //  square Method
        
    public int square(int num){
        return num * num;
    }

    /** @return the sum of num1, num2, and num3
     *  @param num1 first number in the sum
     *  @param num2 second number in the sum
     *  @param num3 third number in the sum
     */
    //  sumThree Method
    
    public int sumThree(int num1, int num2, int num3){
        return num1 + num2 + num3;
    }


    /** @return the average of num1 and num2
     *  @param num1 first number in average
     *  @param num2 second number in average
     */
    //  average Method
    
    public double average(double num1, double num2){
        return (num1 + num2) / 2;
    }


    /** @return the smaller value between num1 and num2
     *  @param num1 first number in minimum comparison
     *  @param num2 second number in minimum comparison
     */
    //  smaller Method
    
    public int smaller(int num1, int num2){
        if(num1 < num2){
            return num1;
        }
        return num2;
    }

    /** @return an integer random number in the range of [1..range] inclusive
     *  @param range the upper bounds of generated random number
     */
    //  randomInt Method
    
    public int randomInt(int upper){
        int rand = (int) (Math.random() * upper) + 1;
        return rand;
    }
    


    /** Determines if num is odd or even. If num is even returns the string "even";
     *  otherwise it returns the string "odd"
     *  @return the string "even" or the string "odd"
     *  @param num number used in comparison
     */
    //  evenOdd Method
    
    public String evenOdd(int num){
        if(num % 2 == 0){
            return "even";
        }
        
        return "odd";
    }


    /** Determines the letter grade for grade
     *  @return a string value of "A", "B", "C", or "F"
     *  @param grade the grade that needs to be converted into a letter grade
     */
    //  getLetterGrade Method
    
    public String getLetterGrade(int grade){
        if(grade >= 90){
            return "A";
        } 
        if (grade >= 80){
            return "B";
        }
        if (grade >= 70){
            return "C";
        }    
        return "F";
    }


    /** Prints the parameter name followed by the phrase
     *  " have a nice day!"
     *  @param name the name to be displayed
     */
    //  greeting Method
    
    public void greeting(String name){
        System.out.println(name + " have a nice day!");
    }


    /** @return the first letter from parameter str
     *  @param str string used to extract first letter from
     */
    // firstLetter Method

    public char firstLetter(String input){
        return input.charAt(0);
    }

    /** @return the last letter from parameter str
     *  @param str string used to extract last letter from
     */
    //  lastLetter Method
    
    public char lastLetter(String input){
        return input.charAt(input.length() - 1);
    }


    /** @return a substring of str that has first letter removed
     *  @param str string used to extract first letter from
     */
    //  removeFirst Method
    
    public String removeFirst(String input){
        return input.substring(1);
    }
    

    /** @return a substring of str that has last letter removed
     *  @param str string used to extract last letter from
     */
    //  removeLast Method

    public String removeLast(String input){
        return input.substring(0, input.length() - 1);
    }


    /** @return a string with str1, str2, and str3 merged together
     *  @param str1 first string to be merged
     *  @param str2 second string to be merged
     *  @param str3 third string to be merged
     */
    //  merge Method

    public String merge(String str1, String str2, String str3){
        return str1 + str2 + str3;
    }



    /** @return a string that is the first letter of parameter
     *   str repeated three times.
     *  @param str string used to extract first letter from
     */
    //  repeatFirst Method
    
    public String repeatFirst(String input){
        String firstLetter = String.valueOf( firstLetter(input) );
        return merge(firstLetter, firstLetter, firstLetter);
    }



    /** @return a string that is the last letter of parameter
     *   str repeated three times.
     *  @param str string used to extract last letter from
     */
    //  repeatLast Method
    
    public String repeatLast(String input){
        String lastLetter = String.valueOf( lastLetter(input) );
        return merge(lastLetter, lastLetter, lastLetter);
    }



}
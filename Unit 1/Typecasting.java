public class Typecasting {
    public static void main (String args[]) {
    
        /* Typecasting must be used when converting from a large to small data type
         * 
         * We also use typcasting for other things!
         */
         
        int num1 = 3;
        int num2 = 5;
        int num3 = 2;
        
        double avg = (double)( num1 + num2 + num3 ) / 3;
        // or you can do
        // double avg = ( num1 + num2 + num3 ) / 3.0;
        System.out.println(avg);
        
        
        // Rounding using typecasting
        double num = 1.7;
        num += .5;
        System.out.print((int) num);
        
        
    
    }
}

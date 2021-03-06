public class Conversion {
    public static void main(String args[]){
    
        // Declaring and initializing the variables
        
        double inch = 2.54;
        double yard = 0.9144;
        double mile = 1.609;
        double centimeter = 0.3937;
        double meter = 1.094;
        double kilometer = 0.6214;
        double lightYear = 9.464; // need to make this to the 12th power
                                  // not possible with double type
                                  
                                 
        // Printing out the variables
        
        System.out.println("         Units and Conversion Factors         ");
        System.out.println("----------------------------------------------");
        System.out.println("1 inch = " + inch + " centimeters");
        System.out.println("1 yard = " + yard + " meters");
        System.out.println("1 mile = " + mile + " kilometers");
        System.out.println("1 centimeter = " + centimeter + " inches" );
        System.out.println("1 meter = " + meter + " yards" );
        System.out.println("1 kilometers = " + kilometer + " miles" );
        System.out.println("1 light year = " + lightYear + "E12" + " kilometers" );
    
    }

}
public class Constants {
    public static void main (String args[]){
    
        // Constant variables cannot change in value after being initialized. 
        
        final int DAYS_IN_WEEK = 7;
        // for constant variables the naming convention is all caps with underscores being 
        // betweeen words
        
        // DATS_IN_WEEK += 1; gives error
        // cannot change value
    
        // int totalDays = DAYS_IN_WEEK * 775;
        // the issue is a convention problem. The problem is the 775 at the end. That's a 
        // magic number. As much as possible we try to not use literal variables and instead
        // store those literals in a variable
        
        int weeks = 775;
        int totalDays = DAYS_IN_WEEK * weeks;
        
    
    }
}
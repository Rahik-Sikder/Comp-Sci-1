public class MultipleReturn {
    public static void main(String args[]){
        
        MultipleReturn mult = new MultipleReturn();
        
        System.out.println(mult.getDayName(4));
    
    
    }
    
    public String getDayName(int num){
        if(num == 0)
            return "Sunday";
        if(num == 1)
            return "Monday";
        if(num == 2)
            return "Tuesday";
        if(num == 3)
            return "Wednesday";
        if(num == 4)
            return "Thurday";
        if(num == 5)
            return "Friday";
        if(num == 6)
            return "Saturday";
        if(num == 7)
            return "Sunday";
            
        return "Invalid Day of Week"; 
        
        // since return leaves the method immediately you don't have to include else
            
            
    }
}
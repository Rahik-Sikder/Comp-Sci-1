public class Substring {
    public static void main(String args[]){
        
        /* substring(int a, int b) OR substring(int a) OVERLOADED
         * Substring will return a section of a string starting at index a
         * and going up to but not including index b
         * If we only pass index a, we stop at the end of the string.
         * input: int
         * output: String
         */
        
        String word = "racecar";
        //             0123456
        
        // getting race from racecar
        String sub1 = word.substring(0,4);
        System.out.println(sub1);
        
        // getting car from racecar
        String sub2 = word.substring(4, 7);
        System.out.println(sub2);
        
        String sub3 = word.substring(0);
        
        String sub4 = word.substring(4);
        
        
        
        
    }
}
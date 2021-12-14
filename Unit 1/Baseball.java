public class Baseball {
    public static void main (String args[]){
    
        // 1
        int hits = 27;
        int atBats = 80;
        int roundedAvg = 0;
        double battingAvg = 0;
        
        // 2
        battingAvg = (double) hits / atBats;
       
        // 3
        battingAvg += .0005;
        
        // 4
        battingAvg*= 1000;
        roundedAvg = (int) battingAvg;
        
        // 5
        System.out.println("Hits = " + hits);
        System.out.println("At Bats = " + atBats);        
        System.out.println("-------------------------"); 
        System.out.println("Batting Average = " + roundedAvg);
        
    }
}
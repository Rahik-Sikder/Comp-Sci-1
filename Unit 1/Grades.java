public class Grades {
    public static void main (String args[]){
    
        // 1
        
        double dailyAvg = 88;
        double quizAvg = 74;
        double testAvg = 95;
        double sixWeeksAvg = 0;
    
        // 2
        int roundedAvg = 0;
        
        // 3
        sixWeeksAvg = (dailyAvg * .3) + (quizAvg * .2) + (testAvg * .5);
        
        // 4
        sixWeeksAvg += .5;
        roundedAvg = (int) sixWeeksAvg;
        
        // 5
        System.out.println("Daily Average = " + dailyAvg);
        System.out.println("Quiz Average = " + quizAvg);
        System.out.println("Test Average = " + testAvg);
        System.out.println("--------------------------");
        System.out.println("Six Weeks Average = " + roundedAvg);
        
    }
}
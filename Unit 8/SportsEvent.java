import java.util.*;
public class SportsEvent {
    // instance variables
    private double[] scores = new double[8];
    private Scanner reader = new Scanner(System.in);

    /* This method prompts the user to enter in 8 scores and stores
     * them in the array scores.
     */
    public void readScores() {
       for(int i = 1; i <= 8; i++){
           System.out.print("Judge " + i + " --> ");
           scores[i-1] = reader.nextDouble();  
       }
        
    }
    /* Determines which score in scores is the lowest
     * @return the lowest score in scores
     */
    public double lowest() {
        double lowest = scores[0];
        for(double x : scores){
            if(x < lowest)
                lowest = x;
        }
        return lowest;
    }
    /* Determines which score in scores is the highest
     * @return the highest score in scores
     */
    public double highest() {
        double highest = scores[0];
        for(double x : scores){
            if(x > highest)
                highest = x;
        }
        return highest;
    
    }
    /* Calculates the average of scores with the lowest and highest scores
     * thrown out.
     * @return the average
     */
    public double average() {
        double sum = 0;
        for(double x : scores){
            sum += x;
        }
        return sum / scores.length;
    }
    /* This method prints a summary report which includes the original list of
     * scores, the average of the scores, the lowest score, and the highest
     * score.
     */
    public void printSummary() {
        System.out.println("                Summary              ");
        System.out.println("-------------------------------------");
        System.out.println("Scores = " + Arrays.toString(scores));
        System.out.println("Lowest Score = " + lowest());
        System.out.println("Highest Score = " + highest());
        System.out.println("Average Score = " + String.format("%.1f",average()));
        
    }
    public static void main(String[] args) {
        SportsEvent app = new SportsEvent();
        app.readScores();
        app.printSummary();
    }
}
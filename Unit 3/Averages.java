public class Averages{
    public static void main(String args[]){
        
        int randNum = 0;
        int posCount = 0;
        int posSum = 0;
        int negCount = 0;
        int negSum = 0;
        double posAvg;
        double negAvg;
        
        int spaceCount = 0;
        
        for(int i = 0; i < 100; i++){
            randNum = (int) ( Math.random() * 2001) - 1000;
            
            if (randNum >= 0){
                posCount++;
                posSum += randNum;
            } else {
                negCount++;
                negSum += randNum;
            }
            
            // This is just formatting
            
            if (randNum == 1000){
                spaceCount += 4;
            } else if (randNum < 1000 && randNum > 99) {
                spaceCount += 3;
            } else if (randNum > 10){
                spaceCount += 2;
            } else if (randNum > -1){
                spaceCount += 1;
            } else if (randNum > -10){
                spaceCount += 2;
            } else if (randNum > -100){
                spaceCount += 3;
            }  else if (randNum > -1000){
                spaceCount += 4;
            } else {
                spaceCount += 5;
            }
            
            
            
            if(spaceCount % 50 <= 5 && spaceCount > 50){
                System.out.println();
                spaceCount = 0;
            }
            System.out.print(randNum + " ");
         
        }
    
        System.out.println("\n");
        posAvg = (Math.round((double) posSum / posCount) * 100) / 100;
        negAvg = (Math.round((double) negSum / negCount) * 100) / 100;
        
        
        System.out.println("          Summary           ");
        System.out.println("----------------------------");
        System.out.println("Positive Numbers     = " + posCount);
        System.out.println("Sum of Positives     = " + posSum);
        System.out.println("Average of Positives = " + posAvg);
        System.out.println("");
        System.out.println("Negative Numbers     = " + negCount);
        System.out.println("Sum of Negatives     = " + negSum);
        System.out.println("Average of Negatives = " + negAvg);
        
    }
}
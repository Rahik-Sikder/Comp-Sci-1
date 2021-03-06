    public class RPGFight{
        public static void main (String args[]){
        
        final int NUMBER_OF_HITS = 6;
        int hit1, hit2, hit3, hit4, hit5, hit6;
        double avgHit;
        int maxHit;
        int minHit;
        int xpGained;
        
        
        // making hits and xp
        hit1 = (int) (Math.random() * 21);
        hit2 = (int) (Math.random() * 21);
        hit3 = (int) (Math.random() * 21);
        hit4 = (int) (Math.random() * 21);
        hit5 = (int) (Math.random() * 21);
        hit6 = (int) (Math.random() * 21);
        xpGained = (int) (Math.random() * 126) + 5;
        
        
        // finding the max and min hit
        
        minHit = Math.min(Math.min(Math.min(hit1, hit2), hit3),
                            Math.min(Math.min(hit4, hit5), hit6));
                            // so ugly
                            
        maxHit = Math.max(Math.max(Math.max(hit1, hit2), hit3),
                            Math.max(Math.max(hit4, hit5), hit6));
                            // so ugly
        
        avgHit = (double) (hit1 + hit2 + hit3 + hit4 + hit5 + hit6) / NUMBER_OF_HITS;
        avgHit += .5;
        
        
        
        
        // Battle report
        
        System.out.println("You open the chamber door to see what lies beyond.");
        System.out.println("A demogorgon jumps out and attacks!");
        System.out.println("You deftly pull out your mighty blade and defend yourself: ");
        System.out.println();
        
        System.out.println("You hit the demogorgon for " + hit1 + " points of damage");
        System.out.println("You hit the demogorgon for " + hit2 + " points of damage");
        System.out.println("You hit the demogorgon for " + hit3 + " points of damage");
        System.out.println("You hit the demogorgon for " + hit4 + " points of damage");
        System.out.println("You hit the demogorgon for " + hit5 + " points of damage");
        System.out.println("You hit the demogorgon for " + hit6 + " points of damage");
        
        System.out.println();
        System.out.println("The demogorgon falls to the floor, lifeless.");
        System.out.println("Congratulations! You earned 15 points of experience.");
        
        
        // Battle summary
        
        System.out.println();
        System.out.println("Battle Summary");
        System.out.println("=================");
        System.out.println("Max hit: " + maxHit);
        System.out.println("Min hit: " + minHit);
        System.out.println("Hit average: " + (int) avgHit);
        
        
        
    }
}
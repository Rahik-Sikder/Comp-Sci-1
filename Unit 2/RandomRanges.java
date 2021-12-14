public class RandomRanges {
    public static void main (String args[]){
        
        // 1
        int rand1 = (int) (Math.random() * 26);
        
        // 2
        int rand2 = (int) (Math.random() * 3) + 1;
        
        // 3
        int rand3 = (int) (Math.random() * 51) + 50;
    
        // 4
        int rand4 = (int) (Math.random() * 10) - 10;
        
        // 5
        int rand5 = (int) (Math.random() * 201) - 100;
        
        // 6
        int rand6 = (int) (Math.random() * 26) + 65;
        System.out.println((char) rand6);
        
        // 7
        int step7placeholder = (int) (Math.random() * 1000);
        double rand7 = (double) step7placeholder / 1000;
        
        // 8 
        int rand8 = (int) (Math.random() * 10) + 1;
        rand8 *= 1000;
        
        // Outputing it all
        
        System.out.println("Random Ranges");
        System.out.println("=================");
        System.out.println("1. Range 0 to 25 = " + rand1); 
        System.out.println("2. Range 1 to 3 = " + rand2); 
        System.out.println("3. Range 50 to 100 = " + rand3); 
        System.out.println("4. Range -10 to -1 = " + rand4); 
        System.out.println("5. Range -100 to 100 = " + rand5); 
        System.out.println("6. Range A to Z = " + (char) rand6); 
        System.out.println("7. Range .1 to 1 = " + rand7); 
        System.out.println("8. Range 1000 to 10000 = " + rand8); 
        
        
    }
}
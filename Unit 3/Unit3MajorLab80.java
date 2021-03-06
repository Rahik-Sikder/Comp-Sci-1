import java.util.Scanner;

public class Unit3MajorLab80 {
    public static void main (String args[]){
        Scanner reader = new Scanner(System.in);
        
        int pileA = 3;
        int pileB = 3;
        int pileC = 3;
        
        boolean keepPlaying = true;
        
        System.out.println("--==* Nim *==--");
        System.out.println();
        
        while(keepPlaying){
            System.out.println("A: " + pileA + "\tB: " + pileB + "\tC: " + pileC);
            System.out.print("Choose a pile: ");
            String pile = reader.nextLine();
            System.out.print("How many will you take: ");
            int take = reader.nextInt();
            reader.nextLine();
            
            switch(pile) {
                case "A":
                    pileA -= take;
                    break;
                case "B":
                    pileB -= take;
                    break;
                case "C":
                    pileC -= take;
                    break;
                default:
                    System.out.println("Invalid selection");
            
            }
            
            System.out.println();
            
            if(pileA <= 0 && pileB <= 0 && pileC <= 0){
                keepPlaying = false;
            }
        }
    
        
        System.out.println("All the piles are empty! Well done!");
    
    }
}
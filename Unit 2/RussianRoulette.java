
import java.util.Scanner;

public class RussianRoulette{
    public static void main (String args[]){
    
        Scanner reader = new Scanner(System.in);
        
        // the menu
        System.out.println("Russian Roulette");
        System.out.println("=================");
        
        
        while (true){
            System.out.println("Do you want to play? y/n");    
            String input = reader.next();
            
            if(input.equalsIgnoreCase("y") || input.equalsIgnoreCase("yes")){
                
                System.out.println("How many rounds in the chamber?");
                int bulletsInChamber = reader.nextInt();
                
                runGame(reader, bulletsInChamber);
            } else {   
               System.out.println("=================");
               break;
            }
    }
       
        
        
    } 
    
    
    public static void runGame(Scanner reader, int bulletsInChamber){
        
        if(bulletsInChamber == 0){
            System.out.println("that's no fun");
            
            System.out.println("=====================================================");
            reader.nextLine();
            return;
        } else if (bulletsInChamber > 6 || bulletsInChamber < 0){
            System.out.println("there are only six chambers...");
            System.out.println("=====================================================");
            reader.nextLine();
            return;
        }
        
        boolean[] revolver = new boolean[6];
        boolean death = false;
        int loaded;
        int thePull;
   
       
        // reload the revolver 
        
        for (int i = 0; i < bulletsInChamber; i ++){
            loaded = (int) (Math.random() * 6);
            if(revolver[loaded]){
                i--;
            } else {
                revolver[loaded] = true;
            }
        }
        
        System.out.println("=====================================================");
        System.out.println("press enter to spin the barrel and pull the trigger");
        reader.nextLine();
        reader.nextLine();
        
        while(death == false){
            
            
            try{
                System.out.println(".");
                Thread.sleep(300);
                System.out.println(".");
                Thread.sleep(300);
                System.out.println(".");
                Thread.sleep(300);
            } catch(InterruptedException e){
                
            }

            thePull = (int) (Math.random() * 6);
            death = revolver[thePull];
            
            if(death == false) {
                System.out.println("*click*");
                System.out.println(safeVoiceLine() + " press enter...");
                reader.nextLine();
            }
         
        }
        
        System.out.println("Boom");
        
            System.out.println("=====================================================");
        
    }   
    
    public static String safeVoiceLine(){
    
        String[] voiceLines = new String[4];
        voiceLines[0] = "try your luck...";
        voiceLines[1] = "you've survived for now...";
        voiceLines[2] = "congrats, you got lucky...";
        voiceLines[3] = "you live to see another day...";
        
        return voiceLines[(int) (Math.random() * 4)];
    }
    
    
}
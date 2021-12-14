import java.util.Arrays;
public class MontyHall{
    public static void main(String args[]) {
        System.out.println("Wins without switching: " + montyHall(false, 1000));
        System.out.println("Wins with switching: " + montyHall(true,1000));
    }
    
    public static int montyHall(boolean shouldSwitch, int numTests){
        int winners = 0;
        
        //1. Make a loop that runs numTests times.
        
            //2. Create an array with length 3. 
            //Make a random number 0-2 for the winning door.
            //Set the winning door value to 10.
            
            
            //3. Create a random value 0-2 for the Contestants choice.
            
            
            //4.Use a loop to find the index of two values
            //the index of the first door containing a zero the player didnt choose 
            //   - this is the revealed door.
            //The index of the remaining door - this is the door we can switch to.
            
            
            //5. If the player should switch, change the contestantChoice 
            //   to the switch door index.
            
            //6. If the contestantChioce is the same index as the winning door,
            //   increase winners by 1
        

            
            
        for(int i = 1; i <= numTests; i++){
            int[] doors = new int[3];
            
            
            int winDoor = (int) (Math.random() * 3);
            doors[winDoor] = 10;
            
            int contestant = (int) (Math.random() * 3);
            
            int revDoor = 0;
            
            for(int j = 0; j <=2; j++){
                if(j != contestant && doors[j] != 10){
                    revDoor = j;
                    break;
                }
            }
            
            int switchDoor = 0;
            for(int j = 0; j <=2; j++){
                if(j != contestant && j != revDoor)
                    switchDoor = j;
            }
            
            
            if(shouldSwitch)
                contestant = switchDoor;
            
            if(contestant == winDoor)
                winners++;
                
        }    
            
        
        
        
        return winners;
    }
}
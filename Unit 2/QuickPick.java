public class QuickPick {
    public static void main (String args[]){
        

        System.out.println("Texas Lottery - Quick Pick");
        System.out.println("===========================");
        
        for(int i = 0; i < 6; i++){
            System.out.print( (int) (Math.random() * 50) + 1 ); 
            System.out.print(" ");
        }
    
        
        
    }
}
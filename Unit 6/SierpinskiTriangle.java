import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;

public class SierpinskiTriangle {
    
    private GraphicsContext gc;
    //These ints represent the three corners of the triangle
    private int x1, x2, x3;
    private int y1, y2, y3;
    //These ints represent the current point where a dot is drawn.
    private int currentX;
    private int currentY;
    
    //Create an instance variable for a Dot object.
    
    private Dot dot;
    
    public SierpinskiTriangle(GraphicsContext gc){
        this.gc = gc;
        x1 = 512;
        y1 = 109;
        x2 = 146;
        y2 = 654;
        x3 = 876;
        y3 = 654;
        currentX = 512;
        currentY = 382;
      
    }
    
    
    /** drawTriangle();
     * This method picks a random corner of the triangle and draws a new point halfway
     * between the current point and the chosen corner. Each time this method is called 
     * a new dot object is made. 
     */
    public void drawTriangle(){
        
        
        //1. Create two local int variables distX and distY. Initialize each as 0.
                
        int distX = 0;
        int distY = 0;
        
        //2. Instantiate the dot object at location (currentX, currentY)
        
        dot = new Dot(gc, currentX, currentY);
       
        //3. Create a random number 1-3.
        
        int rand = (int) (Math.random() * 3) + 1;
        
        /**4. This will choose a random corner of the triangle and finds the 
         * distance between the current point and the corner.
         * 
         * If the random number is 1, assign distX the difference of currentX and x1.
         * Find the distance between currentY and y1. 
         * Repeat for random values of 2 and 3 using x2,y2 and x3,y3.
         */
        
        
        if(rand == 1){
            distX = currentX - x1;
            distY = currentY - y1;
           // System.out.println("Rand 1");
        } else if(rand == 2){
            distX = currentX - x2;
            distY = currentY - y2;
           // System.out.println("Rand 2");
        } else if(rand == 3){
            distX = currentX - x3;
            distY = currentY - y3;
          //  System.out.println("Rand 3");
        } else {
            System.out.println("ERROR DIDN'T RUN");
        }
        
        //5. Assign a new value to currentX and currentY. 
        //The new value should be currentX - half the distance of X.
        
        currentX -= distX / 2;
        currentY -= distY / 2;
        
        
    }
    
    
    
}

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;

public class Tree extends Plant{
    
    //1. Write a constructor to pass the GraphicsContext object, x, and y to the superclass.
    protected Tree(GraphicsContext gc, int x, int y) {
        super(gc, x, y);
        drawTrunk();
        
    }
    
    
    /** drawTrunk()
     * This method draws the brown trunk of the tree. See the instructions for details.
     */
    
    public void drawTrunk(){
        gc.setFill(Color.BROWN);
        gc.fillRect(x+17, y+75, 16, 25);
    }
    
}
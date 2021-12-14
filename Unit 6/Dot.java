import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;

public class Dot {
    
    
    private int x;
    private int y;
    
    
    public Dot(GraphicsContext gc, int x, int y){
        this.x = x;
        this.y = y;
         
        drawDot(gc);
    }
    
    /** drawDot()
     * @param GraphicsContext object
     * @param int x
     * @param int y
     * This methods draws a "dot". You can do this by drawing a line from (x,y) to (x,y)
     */

    public void drawDot(GraphicsContext gc){
        gc.strokeLine(x,y,x,y);
    }
    
}
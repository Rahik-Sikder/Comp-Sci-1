import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;

public class Hand {

    public Hand(GraphicsContext gc, int time, Time t, Color color, int width){
        drawHand(gc, time, t, color, width);    
    }
    
    public void drawHand(GraphicsContext gc, int time, Time t, Color color, int width){
        int[] coords = t.getTimeCoords(time);
        gc.setLineWidth(width);
        gc.setStroke(color);
        gc.strokeLine(250,250, coords[0], coords[1]); // need to call TIme class
        
    }
        
        
}
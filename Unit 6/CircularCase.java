import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;
import javafx.scene.transform.Rotate;

public class CircularCase {
    
    protected GraphicsContext gc;
    
    
    public CircularCase(GraphicsContext gc){
        this.gc = gc;
        drawCirclularCase();
    }
    
    public void drawCirclularCase(){
        
        gc.setFill(Color.WHITE);
        gc.fillOval(100, 100, 300, 300);
        
        gc.setStroke(Color.GOLDENROD);
        gc.setLineWidth(5);
        gc.strokeOval(100, 100, 300, 300);
        
        
        gc.setFill(Color.DARKSLATEBLUE);
        gc.fillOval(247, 247, 6, 6);
        
    }
    
    
    

}
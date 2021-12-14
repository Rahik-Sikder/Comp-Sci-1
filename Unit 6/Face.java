import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;


public class Face{
    
    public Face(GraphicsContext gc){
        drawEyes(gc);
        
    }
    
    public void drawEyes(GraphicsContext gc){
        gc.setFill(Color.BLACK);
        gc.fillRect(175, 150, 50, 50);
        gc.fillRect(300, 150, 50, 50);
        gc.fillRect(180, 155, 50, 50);
        gc.fillRect(305, 155, 50, 50);
        
    }
    
}
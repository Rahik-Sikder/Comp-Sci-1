import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;

public class JackOLantern extends Pumpkin{
    
    
    public JackOLantern(GraphicsContext gc, Color bodyColor){
        super(gc, bodyColor);
        drawStem();
        new Face(gc);    
    }
    
    public void drawStem(){
        gc.setFill(Color.GREEN);
        gc.fillRect(225, 25, 50, 70);
    }
    
    
}
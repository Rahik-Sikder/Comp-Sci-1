import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;

public class Pumpkin{
    
    protected GraphicsContext gc;
    private Color bodyColor;
    
    
    public Pumpkin(GraphicsContext gc, Color bodyColor){
        this.gc = gc;
        this.bodyColor = bodyColor;
        drawBody();
    }
    
    public void drawBody(){
        gc.setFill(bodyColor);
        gc.fillOval(50,50,400, 300);
 
        
    }
    
}
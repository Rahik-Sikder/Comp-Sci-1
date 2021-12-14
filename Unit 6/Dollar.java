import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;

public class Dollar extends Currency{
        
    // Composition shows a "has a" relationship between two classes.
    // We use this by making objects.
    
    private Triangle t;
    
    
    public Dollar(GraphicsContext gc, int x, int y){
        super(gc, x, y);
        drawDollar();
        t = new Triangle(gc,x,y);
    }
    
    public void drawDollar(){
        gc.setFill(Color.WHITE);
        gc.fillOval(35 + x,0 + y,30,50);
    }
    
    
    
}   
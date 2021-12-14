import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;

public class Currency {
    
    protected GraphicsContext gc;
    protected int x;
    protected int y;
    
    
    protected Currency(GraphicsContext gc, int x, int y){
        this.gc = gc;
        this.x = x;
        this.y = y;
        drawCurrency();
    }
    
    public void drawCurrency(){
        gc.setFill(Color.GREEN);
        gc.fillRect(x, y,100,50);
    }
    
    
}
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;

public class Triangle{
    
    public Triangle(GraphicsContext gc, int x, int y){
        drawTriangle(gc,x,y);
    }
    
     public void drawTriangle(GraphicsContext gc, int x, int y){
        gc.setFill(Color.GOLD);
        // We can make a triangle by making a polygon.
        double[] xPoints = {50 + x, 75 + x, 25 + x};
        double[] yPoints = {10 + y, 45 + y, 45 + y};
        
        gc.fillPolygon(xPoints, yPoints, 3);
        
        
    }
}
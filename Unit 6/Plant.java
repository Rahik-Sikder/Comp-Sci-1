import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;

public class Plant {
    //1. Declare Instance variables for the GraphicsContext Object, x and y.
    
    protected GraphicsContext gc;
    protected int x;
    protected int y;
    
    
    //2. Write a constructor for the Plant class. The constructor should also call drawTreeTop.
    
    protected Plant(GraphicsContext gc, int x, int y){
        this.gc = gc;
        this.x = x;
        this.y = y;
        drawTreeTop();
    }
    
    
    /** drawTreeTop()
     * This method will draw a triangle from coordinate (x,y) using fillPolygon().
     * See the instructions for coordinates of each corner.
     */
    
    public void drawTreeTop() {
        double[] xPoints = {x+25,    x, x+50};
        double[] yPoints = {   y, y+75, y+75};
        int r = (int) (Math.random() * 120) + 1;
        int g = (int) (Math.random() * 75) + 180;
        int b = (int) (Math.random() * 110) + 1;
        
        gc.setFill(Color.rgb(r,g,b));
        gc.fillPolygon(xPoints, yPoints, 3);
        
    }
    
}
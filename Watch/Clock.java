import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;
import javafx.scene.transform.Rotate;

public class Clock extends CircularCase{
    
    protected GraphicsContext gc;
    
    
    public Clock(GraphicsContext gc){
        super(gc);
        this.gc = gc;
        drawTimeMarking();
    }

    public void drawTimeMarking(){
        
        
        final int MARK_LENGTH = 25;
        final int SHIFT_MAG = 60;
        
        gc.setStroke(Color.WHITE);
        gc.setLineWidth(5);
        
        
        
        // 12          x12  y12
        gc.strokeLine(250, 120, 250, 120 + MARK_LENGTH);
            
        // 3           x3   y3
        gc.strokeLine(380, 250, 380 - MARK_LENGTH, 250);
        
        // 6
        gc.strokeLine(250, 380, 250, 380 - MARK_LENGTH);
        
        // 9
        gc.strokeLine(120, 250, 120 + MARK_LENGTH, 250);    
        

        
        gc.setLineWidth(1);
        int[] cord;
        Time t = new Time();
        for(int i = 1; i <= 60; i++){
            cord = t.getTimeCoords(i);
            if(i % 5 == 0){
               gc.setLineWidth(5); 
            } else{
               gc.setLineWidth(2);
            }
            gc.strokeLine(cord[0], cord[1],cord[0], cord[1]);
        }
     
       
    }
    
    
    
    

}
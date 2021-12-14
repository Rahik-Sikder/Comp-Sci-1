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
        
        gc.setStroke(Color.BLACK);
        gc.setLineWidth(5);
        
        
        
        // 12          x12  y12
        gc.strokeLine(250, 120, 250, 120 + MARK_LENGTH);
            
        // 3           x3   y3
        gc.strokeLine(380, 250, 380 - MARK_LENGTH, 250);
        
        // 6
        gc.strokeLine(250, 380, 250, 380 - MARK_LENGTH);
        
        // 9
        gc.strokeLine(120, 250, 120 + MARK_LENGTH, 250);    
        
        /////////////////////////////////////////////////////
        
        // 1           x12              y12  
        gc.strokeLine(250 + SHIFT_MAG, 120 + MARK_LENGTH, 250 + SHIFT_MAG, 120 + MARK_LENGTH);
        
        // 2           x3                  y3
        gc.strokeLine(380 - MARK_LENGTH, 250 - SHIFT_MAG, 380 - MARK_LENGTH, 250 - SHIFT_MAG);
        
        
        // 4            x3               y3              
        gc.strokeLine(380 - MARK_LENGTH, 250 + SHIFT_MAG, 380 - MARK_LENGTH, 250 + SHIFT_MAG);
        
        // 5
        gc.strokeLine(250 + SHIFT_MAG, 380 - MARK_LENGTH, 250 + SHIFT_MAG, 380 - MARK_LENGTH);
        
        // 7
        gc.strokeLine(250 - SHIFT_MAG, 380 - MARK_LENGTH, 250 - SHIFT_MAG, 380 - MARK_LENGTH);
        
        // 8
        gc.strokeLine( 120 + MARK_LENGTH, 250 + SHIFT_MAG,120 + MARK_LENGTH, 250 + SHIFT_MAG);
        
        // 10
        gc.strokeLine(120 + MARK_LENGTH, 250 - SHIFT_MAG, 120 + MARK_LENGTH, 250 - SHIFT_MAG);
        
        // 11
        gc.strokeLine(250 - SHIFT_MAG, 120 + MARK_LENGTH, 250 - SHIFT_MAG, 120 + MARK_LENGTH);
        
          
        /*
        
        
        Putting a pin in this until I get everything else working
        It is supposed to draw the second hand
         
        gc.setLineWidth(1);
        
        int coordX;
        int coordY;
        int j;
      
        
        // You have one direction need to go 25
        // You have another needing to go 60
        
        
        // 12 to 1
        coordX = 250;
        coordY = 120;

        j = 1;
        for(int i = 1; i <=25; i *= 2){
            gc.strokeLine(coordX + j, coordY + i, coordX + j , coordY + i);
            j += 12;
        }
        
        
        // 1 to 2
        coordX = 250 + SHIFT_MAG;
        coordY = 120 + MARK_LENGTH;
        j = 1;
        for(int i = 1; i <=25; i *= 2){
            gc.strokeLine(coordX + i, coordY + j, coordX + i , coordY + j);
            j += 12;
        }
        
       */ 
        
        
    }
    
    
    

}
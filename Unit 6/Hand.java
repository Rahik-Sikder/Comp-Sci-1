import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;

public class Hand {

    public Hand(GraphicsContext gc, int time){
        
        drawHand(gc, time);    
    }
    
    public void drawHand(GraphicsContext gc, int time){
     //   gc.setStroke(Color.WHITE);
        gc.setLineWidth(2);
      //  gc.strokeLine(250,250, findX(time-1), findY(time-1));
        gc.setStroke(Color.RED);
        gc.strokeLine(250,250, findX(time), findY(time));
        
    }
    
    public int findX(int time){
        switch (time){
            case 1:
                return 250 + 60;
            case 2:
                return 380 - 25;
            case 3:
                return 380;
            case 4:
                return 380 - 25;
            case 5:
                return 250 + 60;
            case 6:
                return 250;
            case 7:
                return 250 - 60;
            case 8:
                return 120 + 25;
            case 9:
                return 120;
            case 10:
                return 120 + 25;
            case 11:
                return 250 - 60;
            case 12:
                return 250;
            default: 
                return 0;
        }
    }
    
    public int findY(int time){
        switch (time){
            case 1:
                return 120 + 25;
            case 2:
                return 250 - 60;
            case 3:
                return 250;
            case 4:
                return 250 + 60;
            case 5:
                return 380 - 25;
            case 6:
                return 380;
            case 7:
                return 380 - 25;
            case 8:
                return 250 + 60;
            case 9:
                return 250;
            case 10:
                return 250 - 60;
            case 11:
                return 120 + 25;
            case 12:
                return 120;
            default: 
                return 0;
        }     
    }
        
        
}
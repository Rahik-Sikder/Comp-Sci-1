import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;


public class Watch extends Clock{
    
    private int seconds;
    private int minutes;
    private int hours;
    
    public Watch(GraphicsContext gc, int time){
        super(gc);
        drawStraps();
        Time t = new Time();
        timeSet(time);
        Hand secondhand = new Hand(gc, seconds, t, Color.RED, 2);
        Hand minuteHand = new Hand(gc, minutes, t, Color.SILVER, 3);
        Hand hourHand = new Hand(gc, hours, t, Color.MIDNIGHTBLUE, 4);
        
    }
    
    public void timeSet(int time){
        seconds = time % 60; 
        
        
        minutes = (time % 3600) / 60;
        
        
        hours = ((time % 43200) / 3600) * 5 + (minutes / 12); 
        
    }
    
        
    
    public void drawStraps(){
        
        gc.setFill(Color.DARKRED);
        
        // Top Strap
        
        int rectY = 110;
        for(int i = 0; i + 190 < 220; i ++){
            if(i % 3 == 0){
                rectY--;
            }
            gc.fillRect(190 + i, 0, 1, rectY);
        }
        
        rectY++;
        for(int i = 0; i + 220 < 250; i ++){
            if(i % 9 == 0){
                rectY--;
            }
            gc.fillRect(220 + i, 0, 1, rectY);
        }
        
        
        for(int i = 0; i + 250 < 280; i ++){
            if(i % 9 == 0){
                rectY++;
            }
            gc.fillRect(250 + i, 0, 1, rectY);
        }
        
        
        rectY--;
        for(int i = 0; i + 280 < 310; i ++){
            if(i % 3 == 0){
                rectY++;
            }
            gc.fillRect(280 + i, 0, 1, rectY);
        }
        
        
        
        // Bottom Strap
        
        rectY = 390;
        for(int i = 0; i + 190 < 220; i ++){
            if(i % 3 == 0){
                rectY++;
            }
            gc.fillRect(190 + i, rectY, 1, 500 - rectY);
        }
        
        rectY--;
        for(int i = 0; i + 220 < 250; i ++){
            if(i % 9 == 0){
                rectY++;
            }
            gc.fillRect(220 + i, rectY, 1, 500 - rectY);
        }
        

        for(int i = 0; i + 250 < 280; i ++){
            if(i % 9 == 0){
                rectY--;
            }
            gc.fillRect(250 + i, rectY, 1, 500 - rectY);
        }
        
        rectY++;
        for(int i = 0; i + 280 < 310; i ++){
            if(i % 3 == 0){
                rectY--;
            }
            gc.fillRect(280 + i, rectY, 1, 500 - rectY);
        }
        
        
        
        
        // shhh, this isn't cheating I swear
        // comment this out and it'll still go around the watch but it won't be as smooth
        
        gc.setStroke(Color.SILVER);
        gc.setLineWidth(5);
        gc.strokeOval(100, 100, 300, 300);
        
        
    }
    
}
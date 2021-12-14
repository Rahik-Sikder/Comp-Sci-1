import java.util.Random;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.TextAlignment;
import javafx.scene.shape.*;
import javafx.stage.Stage;
import javafx.util.Duration;


public class WatchRunner extends Application{
     
    int time = 1;
    int seconds = 0;
    int minutes = 57; 
    int hours = 9;
    
    public void start(Stage stage) throws Exception {
        Canvas canvas = new Canvas(500, 500);
        GraphicsContext gc = canvas.getGraphicsContext2D();
        
        time = seconds;
        time += minutes * 60;
        time += hours * 3600;
    //This creates a timeline object, that will call run(gc) every 10 milliseconds - this creates the "loop"
        Timeline tl = new Timeline(new KeyFrame(Duration.millis(1000), e -> run(gc))); 

    //The timeline will repeat until program is closed. - This tells the loop to run indefinitely.
        tl.setCycleCount(Timeline.INDEFINITE); 

        stage.setScene(new Scene(new StackPane(canvas)));
        stage.show();
        tl.play();
    }
    
    //Write all changes to code in this method - you should treat this method like the body of a loop.
    //All code inside this method will repeat every 10 milliseconds.
    public void run(GraphicsContext gc){
        
        gc.setFill(Color.BLACK);
        gc.fillRect(0,0,500,500);
        

        new Watch(gc, time);
        time++;
            

    }

}
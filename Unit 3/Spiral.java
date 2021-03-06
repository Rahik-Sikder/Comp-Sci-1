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

public class Spiral extends Application{
    
    //instance Variables - create all variables here.
    private int width = 500;
    private int height = 500;
    private int degrees = 360;
    
    
    
    public void start(Stage stage) throws Exception {
        Canvas canvas = new Canvas(width, height);
        GraphicsContext gc = canvas.getGraphicsContext2D();
    
        //This creates a timeline object, that will call run(gc) every 10 milliseconds - this creates the "loop"
            
        
        Timeline tl = new Timeline(new KeyFrame(Duration.millis(10), e -> run(gc))); 
    
        //The timeline will repeat until program is closed. - This tells the loop to run indefinitely.
        tl.setCycleCount(Timeline.INDEFINITE); 

        stage.setScene(new Scene(new StackPane(canvas)));
        stage.show();
        tl.play();
    }
    
    //Write all changes to code in this method - you should treat this method like the body of a loop.
    //All code inside this method will repeat every 10 milliseconds.
   
    
    public void run(GraphicsContext gc){
        //When the degrees is past 360, create a random color and set the fill. Reset degrees to 0.
        
        gc.fillArc(50, 50, 200, 200, 0, degrees, ArcType.ROUND); 

        if (degrees == 360){
            degrees = 0;
            gc.setFill(Color.rgb((int) (Math.random() * 256),
                                 (int) (Math.random() * 256),
                                 (int) (Math.random() * 256)));
        } else {
            degrees++;
        }
        
        //Create an arc that draws from 0 to degrees. Then increase degrees by one.
        
    }
}
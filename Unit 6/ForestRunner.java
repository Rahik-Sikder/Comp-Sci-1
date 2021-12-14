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

public class ForestRunner extends Application{
     
    
    public void start(Stage stage) throws Exception {
        Canvas canvas = new Canvas(500, 500);
        GraphicsContext gc = canvas.getGraphicsContext2D();
    
    //This creates a timeline object, that will call run(gc) every 10 milliseconds - this creates the "loop"
        Timeline tl = new Timeline(new KeyFrame(Duration.millis(100), e -> run(gc))); 

    //The timeline will repeat until program is closed. - This tells the loop to run indefinitely.
        tl.setCycleCount(Timeline.INDEFINITE); 

        stage.setScene(new Scene(new StackPane(canvas)));
        stage.show();
        tl.play();
    }
    
    //Write all changes to code in this method - you should treat this method like the body of a loop.
    //All code inside this method will repeat every 10 milliseconds.
    public void run(GraphicsContext gc){
        //1. Create random values for x and y such that a tree will never be made off the canvas.
        
        int x = (int) (Math.random() * 451); 
        int y = (int) (Math.random() * 401); 
        
        //2. Create a tree object at location (x,y)
        Tree tree = new Tree(gc, x, y);
        
        
        //OPTIONAL - change the duration in millis in the start method above to slow down or speed up the program. 
        
    }
}
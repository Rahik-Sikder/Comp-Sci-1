import java.util.Random;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.*;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.text.*;
import javafx.scene.shape.*;
import javafx.stage.Stage;
import javafx.util.Duration;

public class MovingBall1 extends Application{
    
    //instance Variables
    private int width = 500;
    private int height = 500;
    private int ballX = 50;
    private int ballY = 50;
    private int dx = 2; //dx represents the direction and speed of the ball.
    
    
    public void start(Stage stage) throws Exception {
        Canvas canvas = new Canvas(width, height);
        GraphicsContext gc = canvas.getGraphicsContext2D();
        Timeline tl = new Timeline(new KeyFrame(Duration.millis(10), e -> run(gc,canvas))); //This creates a timeline object that will call run(gc) every 10 milliseconds.
        tl.setCycleCount(Timeline.INDEFINITE); //The timeline will repeat until program is closed.
        stage.setScene(new Scene(new StackPane(canvas)));
        stage.show();
        tl.play();
    }
    
    //Write all changes to code in this method.
    //Treat this method like the body of a loop.
    public void run(GraphicsContext gc, Canvas canvas){
        //This method clears the window
        gc.clearRect(0,0,canvas.getWidth(), canvas.getHeight());
        
        //Draw a 100x100 black ball at location ballX, ballY
        
        gc.fillOval(ballX, ballY, 100, 100);
        
        
        //increase ballX by dx
        ballX += dx;
        
        
        
        
        
    }
}
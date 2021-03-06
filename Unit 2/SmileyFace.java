

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.scene.shape.ArcType;
import javafx.stage.Stage;
import java.awt.BasicStroke;
import javafx.scene.text.Font;

public class SmileyFace extends Application{

    public static void main(String[] args) {
        launch(args);
    }
 
    @Override //DONT MAKE ANY CHANGES HERE
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Drawing Operations Test");
        Group root = new Group();
        Canvas canvas = new Canvas(500, 700);
        GraphicsContext gc = canvas.getGraphicsContext2D();
        drawShapes(gc);
        root.getChildren().add(canvas);
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }
    
    //Write all changes to code in this method.
    public void drawShapes(GraphicsContext gc){
        
        
        // head and hat
        gc.setFill(Color.GOLD);
        gc.fillOval(100, 200, 250, 250);
        
        gc.setFill(Color.BLACK);
        gc.fillRect(125,195, 200, 30); // hat brim
        gc.fillRect(150, 105, 150, 90); // hat
        
        
        int red = (int)(Math.random() * 256);
        int green =(int)(Math.random() * 256);
        int blue = (int)(Math.random() * 256);
        Color c = Color.rgb(red, green, blue);
        gc.setFill(c);
        
        gc.fillRect(150, 175, 150, 20); // hat color
        
        
        // face
        
        gc.setFill(Color.WHITE);
        gc.fillOval(150, 280, 40, 40); // eye one
        gc.fillOval(250, 280, 40, 40); // eye two
   
        gc.setFill(Color.BLACK);
        gc.fillOval(155, 295, 20, 20); // pupil one
        gc.fillOval(255, 295, 20, 20); // pupil two
        
      
        gc.strokeArc(150, 250, 150, 150, 200, 140, ArcType.OPEN); // mouth
        //gc.fillArc();
        
        gc.setFill(Color.RED);
        gc.fillArc(210, 375, 25, 50, 180, 180, ArcType.ROUND); // tounge
        
        gc.strokeLine(223, 400, 223, 415); // tounge line
        
        gc.setFill(c);
        gc.setFont(new Font("COMIC SANS MS", 50));
        gc.fillText("HAVE A NICE DAY", 25, 500);
        
        
    }
}
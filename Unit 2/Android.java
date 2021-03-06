

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.scene.shape.ArcType;
import javafx.stage.Stage;
import javafx.scene.shape.Shape;


public class Android extends Application{

    public static void main(String[] args) {
        launch(args);
    }
 
    @Override //DONT MAKE ANY CHANGES HERE
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Drawing Operations Test");
        Group root = new Group();
        Canvas canvas = new Canvas(500, 500);
        GraphicsContext gc = canvas.getGraphicsContext2D();
        drawShapes(gc);
        root.getChildren().add(canvas);
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }
    
    //Write all changes to code in this method.
    public void drawShapes(GraphicsContext gc){
        
        
        // color
        gc.setFill(Color.rgb(165, 198, 57));
        gc.setStroke(Color.rgb(165, 198, 57));
        gc.setLineWidth(4);
        
        // make the main body
        gc.fillRect(150, 150, 150, 125);
        
        gc.fillRect(175, 275, 100, 25);
        gc.fillArc(150, 250, 50, 50, 180, 90, ArcType.ROUND);
        gc.fillArc(250, 250, 50, 50, 270, 90, ArcType.ROUND);
        
        // arms
        gc.fillRect(100,150, 35, 100); // rect arm 1
        gc.fillArc(100, 135, 35, 35, 0, 180, ArcType.ROUND);
        gc.fillArc(100, 230, 35, 35, 180, 180, ArcType.ROUND);
        
        gc.fillRect(315,150, 35, 100); // rect arm 2
        gc.fillArc(315, 135, 35, 35, 0, 180, ArcType.ROUND);
        gc.fillArc(315, 230, 35, 35, 180, 180, ArcType.ROUND);
        
        // legs
        gc.fillRect(175, 300, 35, 50); // rect leg 1
        gc.fillArc(175, 330, 35, 35, 180, 180, ArcType.ROUND);
        
        
        gc.fillRect(240, 300, 35, 50); // rect leg 2
        gc.fillArc(240, 330, 35, 35, 180, 180, ArcType.ROUND);
        
        // head
        gc.fillArc(150, 70, 150, 145, 0, 180, ArcType.ROUND); // head shape
        
        
        gc.setFill(Color.WHITE);
        gc.fillArc(185, 100, 15, 15, 0, 360, ArcType.ROUND); // eye 1
        gc.fillArc(250, 100, 15, 15, 0, 360, ArcType.ROUND); // eye 2
        
        gc.strokeLine(170, 60, 200,100);
        gc.strokeLine(280, 60, 250,100);
        
    }
}
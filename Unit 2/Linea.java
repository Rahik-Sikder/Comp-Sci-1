

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.scene.shape.ArcType;
import javafx.stage.Stage;


public class Linea extends Application{

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
        
        gc.strokeLine(0,0,500,500); // draws a line between (0,0) and (500, 500)
        
        gc.strokeLine(0,500,500,0); 
        
    }
}


import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.scene.shape.ArcType;
import javafx.stage.Stage;


public class Arcs extends Application{

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
        
        /* strokeArc(x, y, width, height, starting degrees, degrees drawn, ArcType);
         * Drawns a portion of an oval
         */
        
        
        gc.strokeArc( 50, 50, 100, 100, 0, 90, ArcType.ROUND);
        
        gc.strokeArc(150, 50, 100, 100, 180, 180, ArcType.CHORD);
        
        
        // drawPacMan
        gc.setFill(Color.YELLOW);
        gc.fillArc(150, 200, 100, 100, 30, 300, ArcType.ROUND);
        
        
        
    }
}
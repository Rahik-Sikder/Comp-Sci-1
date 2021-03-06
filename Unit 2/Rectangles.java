

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.scene.shape.ArcType;
import javafx.stage.Stage;


public class Rectangles extends Application{

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
        
        /* strokeRect(x, y, width, height);
         * Draws a rectangle with top left corner at location (x, y)
         * 
         */
        
        
        
        gc.strokeRect(50,50, 100, 100); // square
        gc.strokeRect(200,50, 200, 100); // wide rectangle
        gc.strokeRect(100,200, 100, 200); // tall rectangle
       
        
        // dont need the outline, it will just fill it 
        gc.fillRect(50,50, 100, 100); 
        gc.fillRect(200,50, 200, 100); 
        gc.fillRect(100,200, 100, 200);
        
        
    }
}
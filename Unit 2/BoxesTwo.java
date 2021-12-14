

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.scene.shape.ArcType;
import javafx.stage.Stage;


public class BoxesTwo extends Application{

    public static void main(String[] args) {
        launch(args);
    }
 
    @Override //DONT MAKE ANY CHANGES HERE
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Boxes Two");
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
        
        Color[] colors = new Color[8];
        
        colors[0] = Color.AQUAMARINE;
        colors[1] = Color.CADETBLUE;
        colors[2] = Color.CRIMSON;
        colors[3] = Color.DARKMAGENTA;
        colors[4] = Color.DARKRED;
        colors[5] = Color.DEEPPINK;
        colors[6] = Color.INDIANRED;
        colors[7] = Color.NAVY;
        
        for(Color c : colors){
            
            int x = (int) (Math.random() * 401);
            int y = (int) (Math.random() * 401);            
            int sizeX = (int)(Math.random() * 81) + 20;        
            int sizeY = (int)(Math.random() * 81) + 20;        
            
            gc.setFill(c);
            gc.fillRect(x, y, sizeX, sizeY);
            
        }
        
    }
}
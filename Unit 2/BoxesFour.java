

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.scene.shape.ArcType;
import javafx.stage.Stage;


public class BoxesFour extends Application{

    public static void main(String[] args) {
        launch(args);
    }
 
    @Override //DONT MAKE ANY CHANGES HERE
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Boxes Four");
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
        
         for(int i = 0; i < 8; i++){
            
            int x = (int) (Math.random() * 401);
            int y = (int) (Math.random() * 401);            
            int red = (int)(Math.random() * 256);
            int green =(int)(Math.random() * 256);
            int blue = (int)(Math.random() * 256);
            int sizeX = (int)(Math.random() * 81) + 20;        
            int sizeY = (int)(Math.random() * 81) + 20;        
            
            gc.fillRect(x, y, sizeX, sizeY);
            Color c = Color.rgb(red, green, blue);
            gc.setFill(c);
            gc.fillRect(x, y, sizeX, sizeY);
            
            gc.setFill(Color.WHITE);
            gc.fillRect(x + 10, y + 10, sizeX - 20, sizeY - 20);
            
        }
        
        
    }
}


import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.scene.shape.ArcType;
import javafx.stage.Stage;


public class Colors extends Application{

    public static void main(String[] args) {
        launch(args);
    }
 
    @Override //DONT MAKE ANY CHANGES HERE
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Drawing Operations Test");
        Group root = new Group();
        Canvas canvas = new Canvas(650, 650);
        GraphicsContext gc = canvas.getGraphicsContext2D();
        drawShapes(gc);
        root.getChildren().add(canvas);
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }
    
    //Write all changes to code in this method.
    public void drawShapes(GraphicsContext gc){
        
        // 1st row
        gc.setFill(Color.RED);
        gc.fillOval(50, 50, 100, 100);
        
        gc.setFill(Color.BLUE);
        gc.fillOval(200, 50, 100, 100);
        
        gc.setFill(Color.MEDIUMTURQUOISE);
        gc.fillOval(350, 50, 100, 100);
        
        gc.setFill(Color.OLIVEDRAB);
        gc.fillOval(500, 50, 100, 100);
        
        // 2nd row
        gc.setFill(Color.SLATEGRAY);
        gc.fillOval(50, 200, 100, 100);
        
        gc.setFill(Color.GOLDENROD);
        gc.fillOval(200, 200, 100, 100);
        
        gc.setFill(Color.MEDIUMVIOLETRED);
        gc.fillOval(350, 200, 100, 100);
        
        gc.setFill(Color.LIGHTSALMON);
        gc.fillOval(500, 200, 100, 100);
        
        
        // 3rd row    
        gc.setFill(Color.FIREBRICK);
        gc.fillOval(50, 350, 100, 100);
        
        gc.setFill(Color.LAWNGREEN);
        gc.fillOval(200, 350, 100, 100);
        
        gc.setFill(Color.INDIANRED);
        gc.fillOval(350, 350, 100, 100);
        
        gc.setFill(Color.INDIGO);
        gc.fillOval(500, 350, 100, 100);
        
        
        // 4th row    
        Color c = Color.rgb(50, 100, 150);
        gc.setFill(c);
        
        gc.fillOval(50, 500, 100, 100);
        
        c = Color.rgb(150, 50, 100);
        gc.setFill(c);
        gc.fillOval(200, 500, 100, 100);      
        
        c = Color.rgb(100, 150, 50);
        gc.setFill(c);
        gc.fillOval(350, 500, 100, 100);

        for (int i = 0; i < 100; i++){
            // rgb - [0 - 255]
            int red = (int)(Math.random() * 256);
            int green =(int)(Math.random() * 256);
            int blue = (int)(Math.random() * 256);
            c = Color.rgb(red, green, blue);
            gc.setFill(c);
            
            // random oval
            // [0 - 550]
            
            int x = (int)(Math.random() * 551);
            int y = (int)(Math.random() * 551);
            
            gc.fillOval(x, y, 100, 100);
        }
        
        
       
        
    }
}
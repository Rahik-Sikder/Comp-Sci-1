

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.scene.shape.ArcType;
import javafx.stage.Stage;
import javafx.scene.text.Font;

public class Logo extends Application{

    public static void main(String[] args) {
        launch(args);
    }
 
    @Override //DONT MAKE ANY CHANGES HERE
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Drawing Operations Test");
        Group root = new Group();
        Canvas canvas = new Canvas(1000, 500);
        GraphicsContext gc = canvas.getGraphicsContext2D();
        drawShapes(gc);
        root.getChildren().add(canvas);
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }
    
    //Write all changes to code in this method.
    public void drawShapes(GraphicsContext gc){
        
        // Steam Logo
        
        // The grey circle
        
        gc.setFill(Color.rgb(42, 71, 94));
        gc.fillOval(50, 50, 250, 250);
        
        // Text
        
        gc.setStroke(Color.rgb(42, 71, 94));
        gc.setLineWidth(15);
        gc.setFont(new Font("FF Din OT Bold", 140));
        gc.strokeText("S T E A M", 350, 250);
        
        
        // poly1
        
            // poly1 1 points
            
            double[] poly1x = new double[4];
            double[] poly1y = new double[4];
            poly1x[0] = 40; poly1y[0] = 150;
            poly1x[1] = 40; poly1y[1] = 190;
            poly1x[2] = 150; poly1y[2] = 240;
            poly1x[3] = 150; poly1y[3] = 200;
            
        
        gc.setFill(Color.WHITE);
        gc.fillPolygon(poly1x, poly1y, 4);
        gc.fillOval(130, 200, 40, 40); // the cog's circle
            
        // cog1
        
        gc.setStroke(Color.WHITE);
        gc.setLineWidth(10);
        gc.strokeOval(118, 188, 65, 65); 
        
        
        // poly two
        
            // poly2 points
            double[] poly2x = new double[4];
            double[] poly2y = new double[4];
            poly2x[0] = 150; poly2y[0] = 185;
            poly2x[1] = 185; poly2y[1] = 205;
            poly2x[2] = 225; poly2y[2] = 180;
            poly2x[3] = 180; poly2y[3] = 145;
            
        
        gc.setFill(Color.WHITE);
        gc.fillPolygon(poly2x, poly2y, 4);
        
        
        // cog2
        
        gc.setStroke(Color.WHITE);
        gc.setLineWidth(17);
        gc.strokeOval(185, 95, 80, 80);
        
        // inside of cog
        
        gc.fillOval(201, 111, 48, 48);
       
        
        
        
    }
}
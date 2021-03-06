        
        
        import javafx.application.Application;
        import javafx.scene.Group;
        import javafx.scene.Scene;
        import javafx.scene.canvas.Canvas;
        import javafx.scene.canvas.GraphicsContext;
        import javafx.scene.paint.Color;
        import javafx.scene.shape.ArcType;
        import javafx.stage.Stage;
        
        
    public class Unit2MajorLab extends Application{
    
        public static void main(String[] args) {
            launch(args);
        }
     
        @Override //DONT MAKE ANY CHANGES HERE
        public void start(Stage primaryStage) {
            primaryStage.setTitle("Drawing Operations Test");
            Group root = new Group();
            Canvas canvas = new Canvas(1500, 1000);
            GraphicsContext gc = canvas.getGraphicsContext2D();
            drawShapes(gc);
            root.getChildren().add(canvas);
            primaryStage.setScene(new Scene(root));
            primaryStage.show();
        }
        
        
       
         final int SQ_SIZE = 300;
        
        public int plusSize(int size) {
            
            return SQ_SIZE + size;
        }
        
        
        //Write all changes to code in this method.
        public void drawShapes(GraphicsContext gc){
            
            // section it off
            // gc.strokeLine(750, 0, 750, 1000);
            // gc.strokeLine(0, 500, 1500, 500);
            
            // The cube
            
            final int SQ_X = 50;
            final int SQ_Y = 50;   
            final int SQ_DIFF = 50;
            final int SQ_X2 = SQ_X + SQ_DIFF;
            final int SQ_Y2 = SQ_Y + SQ_DIFF;
            
            
            gc.strokeRect(SQ_X, SQ_Y, SQ_SIZE, SQ_SIZE);
            gc.strokeRect(SQ_X2, SQ_Y2, SQ_SIZE, SQ_SIZE);
            
            // I tried to mess around and make it so I could then move the 
            // square around anywhere I wanted, but I'm running out of time
            // so I'll leave it like this. It still does what the Lab is 
            // supposed to. So just ignore the plusSize method.
            
            
            gc.strokeLine(SQ_X, SQ_Y, SQ_X2, SQ_Y2);
            gc.strokeLine(350,50,400,100);
            gc.strokeLine(50, 350, 100, 400);
            gc.strokeLine(350, 350, 400, 400);
            
            
            // sphere
            
            final int OVAL_Y = 100;
            final int OVAL_X = 900;
            final int OVAL_SIZE = 300;
            int ovalY = OVAL_Y;
            int ovalHeight = OVAL_SIZE;
            int ovalX = OVAL_X;
            int ovalWidth = OVAL_SIZE;
            
            
                // main circle
            gc.strokeOval(OVAL_X, OVAL_Y, OVAL_SIZE, OVAL_SIZE);
            
            
                // first ring
            ovalY += 38;
            ovalHeight -= 76;
            ovalX += 38;
            ovalWidth -= 76;
            gc.strokeOval(OVAL_X, ovalY, OVAL_SIZE, ovalHeight);
            gc.strokeOval(ovalX, OVAL_Y, ovalWidth, OVAL_SIZE);
            
                // second ring            
            ovalY += 38;
            ovalHeight -= 76;
            ovalX += 38;
            ovalWidth -= 76;
            gc.strokeOval(OVAL_X, ovalY, OVAL_SIZE, ovalHeight);
            gc.strokeOval(ovalX, OVAL_Y, ovalWidth, OVAL_SIZE);
            
                // thrid ring
            ovalY += 38;
            ovalHeight -= 76;
            ovalX += 38;
            ovalWidth -= 76;
            gc.strokeOval(OVAL_X, ovalY, OVAL_SIZE, ovalHeight);
            gc.strokeOval(ovalX, OVAL_Y, ovalWidth, OVAL_SIZE);
            
            
           
           
            // Triangle Specifics
                   
            
            int triX1 = 1125;
            int triY1 = 600;
            int triX2 = triX1 - 300;
            int triY2 = triY1 + 300;
            int triX3 = triX1 + 300;
            int triY3 = triY1 + 300;        
            int midX1 = (triX2 + triX3)/2;
            int midY1 = (triY2 + triY3)/2;
            int midX2 = (triX1 + triX3)/2;
            int midY2 = (triY1 + triY3)/2;
            int midX3 = (triX1 + triX2)/2;
            int midY3 = (triY1 + triY2)/2;
            
            
            
                /// main triangle
            gc.strokeLine(triX1, triY1, triX2,triY2);
            gc.strokeLine(triX1, triY1, triX3,triY3);
            gc.strokeLine(triX2, triY2, triX3,triY3);
            
            
            gc.strokeLine(triX1, triY1, midX1, midY1);
            gc.strokeLine(triX2, triY2, midX2, midY2);
            gc.strokeLine(triX3, triY3, midX3, midY3);
            
            
            
            // Random Lines Specifics
                
            final int BOX_SIZE = 400;
            final int BOX_X = 100;
            final int BOX_Y = 550;
            final int RAND_DOMAIN = BOX_SIZE - 1;
            final int RAND_RANGE = BOX_SIZE - 1;   
            Color c;
            int red;
            int blue;
            int green;
            int randX1;
            int randX2;
            int randY1;
            int randY2;
            
            gc.strokeRect(BOX_X, BOX_Y, BOX_SIZE, BOX_SIZE);
            
           
            
            for(int i = 0; i < 4; i++){
                red = (int) (Math.random() * 256);
                blue = (int) (Math.random() * 256);
                green = (int) (Math.random() * 256);
                c = Color.rgb(red, blue, green);
                gc.setStroke(c);
                
                randX1 = (int) (Math.random() * RAND_DOMAIN) + BOX_X + 1;
                randX2 = (int) (Math.random() * RAND_DOMAIN) + BOX_X + 1; 
                randY1 = (int) (Math.random() * RAND_RANGE) + BOX_Y + 1;
                randY2 = (int) (Math.random() * RAND_RANGE) + BOX_Y + 1;
                
                gc.strokeLine(randX1, randY1, randX2,randY2);
            }
   
            
            
        
    }
}
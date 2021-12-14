public class RectanglePerimeter {
    
    public void perimVoid(int length, int width){
        int perim =  2 * length + 2 * width;
        System.out.println("The perimeter is :: " + perim);
    }
    
    public int perimReturn(int length, int width){
        return 2 * length + 2 * width;
    }

}
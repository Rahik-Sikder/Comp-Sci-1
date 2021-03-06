public class Favorites {
    
    private String name;
    private String food;
    private String color;
    private String music;
    private String automobiles;
    private String sport;
    
    public Favorites(){ //default constructor
        name = "";
        food = "";
        color = "";
        music = "";
        automobiles = "";
        sport = "";
    
    }
    
    public Favorites(String name, String food, String color, String music, 
                     String automobiles, String sport){
        this.name = name;
        this.food = food;
        this.color = color;
        this.music = music;
        this.automobiles = automobiles;
        this.sport = sport;
    }
    
    public String toString(){
        return  "name: " + name +
                "\nfood: " + food +
                "\ncolor: " + color + 
                "\nmusic: " + music +
                "\nautomobiles: " + automobiles +
                "\nsport: " + sport;
                
    }   
}
public class Assignment {
    // instance variables
    private String name;
    private String type;
    private int score;
    
    // constructors
    public Assignment(){
        name = "";
        type = "";
    }
    
    public Assignment(String name, String type, int score){
        this.name = name;
        this.type = type;
        this.score = score;
    }
    
    // accessor methods
    
    public String getName(){
        return name;
    }
    
    public String getType(){
        return type;
    }
    
    public int getScore(){
        return score;
    }
    
    
    // mutator methods
    
    public void setName(String name){
        this.name = name;
    }
    
    public void setType(String type){
        this.type = type;
    }
    
    public void setScore(int score){
        this.score = score;
    }

    // other methods
    
    public String getLetterGrade(){
        if (score >= 90 && score <= 100)
            return "A";
        if (score >= 80 && score < 90)
            return "B";
        if (score >= 70 && score < 80)
            return "C";
        if (score >= 60 && score < 70)
            return "D";
        return "F";   
    }
    

}
public class Dog {
    // Accessor and mutator methods allow other classes to view and change instance variables.
     
    private String name;
    private String breed;
    private double age;
    private int numLegs;
    // private boolean isWrigslie; // HATE
     
    // constructors are run ONLY during instantiation 
    public Dog(){ // default constructor 
        name = "";
        breed = "";
    }
    
    public Dog(String name, String breed, double age, int numLegs){
        this.name = name;
        this.breed = breed;
        this.age = age;
        this.numLegs = numLegs;
    }
    
    // Accessor methods - these allows other classes to view instance variables
    // called "getters"
    
    public String getName(){
        return name;
    }
    
    public String getBreed(){
        return breed;
    }
    
    public double getAge(){
        return age;
    }
    
    public int getNumLegs(){
        return numLegs;
    }
    
    
    // Mutator methods - these allow other classes a limited way to change instance variables
    
    public void setName(String name){
        this.name = name;
    }
    
    public void setNumLegs(int numLegs){
        if(numLegs < 0)
            this.numLegs = 0;
        else 
            this.numLegs = numLegs;
    }   
    
    // this will overwrite the toString 
    // toString is a method that all classes use to return the memory reference of the
    // object
    public String toString(){
        return "Name: " + name +
               "\nBreed: " + breed +
               "\nAge: " + age +
               "\nLegs " + numLegs;
    }
    
}   
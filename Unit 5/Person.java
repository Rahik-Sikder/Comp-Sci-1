public class Person {
    
    // this class will demonstate making a person object with several constructor methods.
    // this class is a "blueprint" for the attributes that represent a person.
    
    private String name;
    private int age;
    private double weight;
    private double height;
    
    public Person(){ // this is the default constructor, it assigns default values
        name = "";  
        
          
    }
    
    
    public Person(String n){
        name = n;
    }
    
    
    public Person(String name, int age, double eeight, double height){
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.height = height;
    }
    
    
    public void printPerson(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Weight: " + weight);
        System.out.println("Height: " + height);
    }
    

}

public class AnimalRunner {
    public static void main(String arg[]){
        
        /* Inheritance is a concept that allows classes to share features
         * 
         * Occurs between a super(parent) and sub class(child). Subclass will "inherit" instance vars
         * and methods from superclass.
         * 
         * Shows an "is a" relationship between two classes. 
         * 
         * Examples:
         * 1. a dog is an Animal
         * 2. a ham and cheese sandwich is a Sandwich
         * 3. a tomato is a Fruit
         * 4. a car is a Vehicle
         * 5. a backpack is a Bag
         * 
         * 
         */
        
        
        
      //  Animal animal = new Animal(72, true, "a large cat");
      //  System.out.println(animal);
      //  animal.makeNoise();
        
        System.out.println();
        
        Turtle turty = new Turtle(10, true, "Turtle", "greenish?");
        System.out.println(turty);
        turty.makeNoise();
        
        
        
        
        
    }
}
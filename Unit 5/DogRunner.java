public class DogRunner{
    public static void main(String args[]){
    
        Dog dog = new Dog("Pigslie", "Jack Russel", 12.8, 4);
        
        System.out.println("Name: " + dog.getName());
        System.out.println("Breed: " + dog.getBreed());
        System.out.println("Age: " + dog.getAge());
        System.out.println("Number of Legs: " + dog.getNumLegs());
        
        dog.setName("Doggo");
        dog.setNumLegs(3);
        
        System.out.println();
        System.out.println("Name: " + dog.getName());
        System.out.println("Breed: " + dog.getBreed());
        System.out.println("Age: " + dog.getAge());
        System.out.println("Number of Legs: " + dog.getNumLegs());
        
        System.out.println();
        System.out.println(dog); // to invoke toString, print the name of object
        
        
        
    }
}


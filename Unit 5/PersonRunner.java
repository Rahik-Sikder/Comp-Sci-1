public class PersonRunner {
    public static void main(String args[]){
        
        Person defaultPerson = new Person();
        defaultPerson.printPerson();
        
        System.out.println();
        
        Person jim = new Person("Jim");
        jim.printPerson();
        
        System.out.println();
        
        Person jim2 = new Person("Jim2", 18, 100.5, 5.6);  
        jim2.printPerson();
    }
    
}
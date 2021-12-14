public class ArrayIntro {
    public static void main(String args[]){
        
        // Arrays are an object that allow us to store multiple values of the
        // same type under one identifier (name)
        // Arrays have a fixed length
        
        int[] nums = new int[3]; // This defines the length and will use default values
        
        nums[0] = 99;
        nums[1] = 14;
        
        System.out.println(nums[0]);
        System.out.println(nums[1]);        
        
        // hardcoding valuesinto array as we instantiate
        String[] names = {"Jimbo", "Pigslie", "Benjamin", "Corneeeelius"};
        
        names[0] = "BOB"; 
        
        for(String name : names){
            System.out.print(name + " ");
        }
        System.out.println();
        
        int length = names.length;
        // length is not a method, but a value belonging to the array object
        
        System.out.println(names[length - 1]);
        
    
    }
}
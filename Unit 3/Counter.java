public class Counter {
    public static void main (String args[]){
    
        // We can use a for loop to count how many times something
        // happens in our program
        
        String word = "hello";
        char let = 'l';
        
        // Write a for loop to count the number of 'l' inside the word.
        
        int counter = 0;
        for (int i = 0; i < word.length(); i++){
            if(word.charAt(i) == let){
                counter++;
            }
        }
        
        System.out.println(counter);
    }
}


import java.util.Scanner;

public class Histogram {
    
    static int[] nums = new int[50];
    static int size = 0;
    
    public static void main(String args[]){
        
        System.out.println("Input nums. Type -1 to stop typing in nums");
        readNums();
        System.out.println();
        System.out.print("Your list - [ ");
        for(int i = 0; i < size - 1; i++){
            System.out.print(nums[i] + ", ");
        }
        System.out.print(nums[size - 1] + "]");
        
        System.out.println();
        
        int[] numCount = new int[10];
        
        for(int i = 0; i < size; i++){
            numCount[nums[i]]++;
        }
        
        for(int i = 0; i < 10; i++){
            System.out.println(i + " - " + numCount[i]);
        }
        
        
    }
    
    public static void readNums() {
        Scanner reader = new Scanner(System.in);
        System.out.print("num " + size + " :: ");
        int input = reader.nextInt();
        if(input != -1){
            nums[size] = input;
            size++;
            readNums();
        }
        
    }
    
}
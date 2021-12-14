import java.util.Scanner;

public class Reverse {
    public static void main(String args[]){
        
        Scanner reader = new Scanner(System.in);
        
        int[] nums = new int[20];
        
        for(int i = 0; i < nums.length; i++){
            int index = i + 1;
            System.out.print("Num " + index + " --> ");
            nums[i] = reader.nextInt();
        }
        
        System.out.println();
        
        for(int x : nums){
            System.out.print(x + " ");
        }
        
        System.out.println("\n");
        
        for(int i = nums.length - 1; i >= 0; i--){
            System.out.print(nums[i] + " ");
        }
        
        
        
        
        
    }
}

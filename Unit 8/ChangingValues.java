import java.util.Arrays;

public class ChangingValues {
    public static void main(String args[]){
    
        int[] nums = new int[50];
        
        for(int i = 0; i < nums.length; i++){
            nums[i] = 5;
        }
        
        System.out.println(Arrays.toString(nums));
        
        for(int n : nums){
            n = 8;
        }
        // Enchanced for loop gives us a copy of each value
        // changing the copy does not change the original array
        
        
        System.out.println(Arrays.toString(nums));
        
        
        Arrays.fill(nums, 100);
        
        System.out.println(Arrays.toString(nums));
        
        
        System.out.println("Avg : " + avgArray(nums));
        
    
    }
    
    
    public static double avgArray(int[] nums){
        double sum = 0;
        for(int i : nums){
            sum += i;
        }
        
        return sum / nums.length;
    }
    
}
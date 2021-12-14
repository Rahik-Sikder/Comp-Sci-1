import java.lang.System;
import java.lang.Math;

public class ArrayFunHouse {
    //instance variables and constructors could be used, but are not really needed

    //getSum() will return the sum of the numbers from start to stop, including stop
    public static int getSum(int[] nums, int start, int stop) {
        
        int sum = 0;
        
        for(int i = start; i <= stop; i++){
            sum += nums[i];
        }
        
        return sum;
    }

    //getCount() will return number of times val is present
    public static int getCount(int[] nums, int val) {
        int counter = 0;
        for(int n : nums){
            if(n == val)
                counter++;
        }
        return counter;
    }


}
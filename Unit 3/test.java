public class test {
    public static void main (String args[]){
        int b = 1, sum = 0;
        
        while(b < 11)
        {
           b++;
           if(b % 2 == 1)
              sum = sum + b;
        }
        
        System.out.print(sum);
    }
}
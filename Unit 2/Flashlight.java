public class Flashlight {
    public static void main (String args[]){
    
        String str = "flashlight";
        // index      0123456789
        
        String flash = str.substring(0, 5);
        String light = str.substring(5);
        String ash = str.substring(2, 5);
        String flight = str.substring(0,1) + str.substring(5);
        String flag = str.substring(0,3) + str.substring(7,8);
        String fit = str.substring(0,1) + str.substring(6,7) + str.substring(9);
        String high = str.substring(4,5) + str.substring(6,9);
        String gas = str.substring(7,8) + str.substring(2,4);
        String fast = str.substring(0,1) + str.substring(2,4) + str.substring(9);
        String shaft = str.substring(3,5) + str.substring(2,3) + str.substring(0,1) + str.substring(9);
        
        System.out.println("Part 1");
        System.out.println("=================");
        System.out.println(flash);
        System.out.println(light);
        System.out.println(ash);
        System.out.println(flight);
        System.out.println(flag);
        System.out.println(fit);
        System.out.println(high);
        System.out.println(gas);
        System.out.println(fast);
        System.out.println(shaft);
        System.out.println();
        
        
        String lights = str.substring(5) + "s";
        String lighter = str.substring(5) + "er";
        String lightning = str.substring(5) + "ning";
        String enlightened = "en" + str.substring(5) + "ened";

        System.out.println("Part 2");
        System.out.println("=================");
        System.out.println(lights);
        System.out.println(lighter);
        System.out.println(lightning);
        System.out.println(enlightened);
        
    }
}
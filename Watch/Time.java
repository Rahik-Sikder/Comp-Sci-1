public class Time{

    public Time(){
       
       
    }
   

    // There is an imaginary circle about (250,250) with a radius of 130 (gc.strokeLine(120,120,260,260))
    // In order to get an approximation for the y value given the x value, use the methods below
    // Bc it's a square root it can technically only find the top half. But that's okay bc cicles are
    // symmetrical.
    // I can't run Java FX at home so I hope this works. If not then oh well.

    public static int getTopVal(int x){
        return (int) Math.round(-1 * (Math.sqrt((double) (130*130) - (x-250)*(x-250)  ) - 250 ));

    }
    public static int getBottomVal(int x){
        return 500 - (int) Math.round(-1 * (Math.sqrt((double) (130*130) - (x-250)*(x-250)  ) - 250 ));

    }


    public int[] getTimeCoords(int time){
         int[] cord = new int[2];
       
        // can't think of a better solution rn so im just typing out all the points
        switch(time){
            
            case 0:
                 cord[0] = 250; // 0
                 cord[1] = getTopVal(cord[0]);
                 break;        
                 
            case 1:
                 cord[0] = 262; //
                 cord[1] = getTopVal(cord[0]);
                 break;
            case 2:
                 cord[0] = 274; // 278
                 cord[1] = getTopVal(cord[0]);
                 break;
            case 3:
                 cord[0] = 286; // 290
                 cord[1] = getTopVal(cord[0]);
                 break;
            case 4:
                 cord[0] = 298; // 302
                cord[1] = getTopVal(cord[0]);
                 break;
            case 5:
                 cord[0] = 310; // 318
                 cord[1] = getTopVal(cord[0]);
                 break;
                 
                 
            case 6:
                 cord[0] = 319; // 9
                 cord[1] = getTopVal(cord[0]);
                 break;
            case 7:
                 cord[0] = 328; // 9
                 cord[1] = getTopVal(cord[0]);
                 break;
            case 8:
                 cord[0] = 337; // 9
                 cord[1] = getTopVal(cord[0]);
                 break;
            case 9:
                 cord[0] = 346; // 9
                 cord[1] = getTopVal(cord[0]);
                 break;
            case 10:
                 cord[0] = 355; // 9
                cord[1] = getTopVal(cord[0]);
                 break;
           
                 
            // markers are counting up from 15
            case 11:
                 cord[0] = 363; // -8
                cord[1] = getTopVal(cord[0]);
                 break;
            case 12:
                 cord[0] = 371; // -4
                 cord[1] = getTopVal(cord[0]);
                 break;
            case 13:
                 cord[0] = 376; // -2
                 cord[1] = getTopVal(cord[0]);
                 break;
            case 14:
                 cord[0] = 379; // -1
                 cord[1] = getTopVal(cord[0]);
                 break;
            case 15:
                 cord[0] = 380; // --
                 cord[1] = getTopVal(cord[0]);
                 break;
             
                 
                 
            case 16:
                 cord[0] = 379; //
                 cord[1] = getBottomVal(cord[0]);
                 break;
            case 17:
                 cord[0] = 376; // 278
                 cord[1] = getBottomVal(cord[0]);
                 break;
            case 18:
                 cord[0] = 371; // 290
                cord[1] = getBottomVal(cord[0]);
                 break;
            case 19:
                 cord[0] = 363; // 302
                 cord[1] = getBottomVal(cord[0]);
                 break;
            case 20:
                 cord[0] = 355; // 318
                 cord[1] = getBottomVal(cord[0]);
                 break;
                 
                 
            case 21:
                 cord[0] = 346; // 9
                 cord[1] = getBottomVal(cord[0]);
                 break;
            case 22:
                 cord[0] = 337; // 9
                 cord[1] = getBottomVal(cord[0]);
                 break;
            case 23:
                 cord[0] = 328; // 9
                 cord[1] = getBottomVal(cord[0]);
                 break;
            case 24:
                 cord[0] = 319; // 9
                 cord[1] = getBottomVal(cord[0]);
                 break;
            case 25:
                 cord[0] = 310; // 9
                 cord[1] = getBottomVal(cord[0]);
                 break;
           
                 
            // markers are counting up from 15
            case 26:
                 cord[0] = 298; // -8
                 cord[1] = getBottomVal(cord[0]);
                 break;
            case 27:
                 cord[0] = 286; // -4
                 cord[1] = getBottomVal(cord[0]);
                 break;
            case 28:
                 cord[0] = 274; // -2
                 cord[1] = getBottomVal(cord[0]);
                 break;
            case 29:
                 cord[0] = 262; // -1
                 cord[1] = getBottomVal(cord[0]);
                 break;
            case 30:
                 cord[0] = 250; // --
                 cord[1] = getBottomVal(cord[0]);
                 break;
                 
       
            case 31:
                 cord[0] = 238; // 0
                 cord[1] = getBottomVal(cord[0]);
                 break;
            case 32:
                 cord[0] = 226; // 0
                 cord[1] = getBottomVal(cord[0]);
                 break;
            case 33:
                 cord[0] = 214; // 0
                 cord[1] = getBottomVal(cord[0]);
                 break;
            case 34:
                 cord[0] = 202; // 0
                 cord[1] = getBottomVal(cord[0]);
                 break;
            case 35:
                 cord[0] = 190; // 0
                 cord[1] = getBottomVal(cord[0]);
                 break;
             
                 
            case 36:
                 cord[0] = 181; // 0
                 cord[1] = getBottomVal(cord[0]);
                 break;
            case 37:
                 cord[0] = 172; // 0
                 cord[1] = getBottomVal(cord[0]);
                 break;
            case 38:
                 cord[0] = 163; // 0
                 cord[1] = getBottomVal(cord[0]);
                 break;
            case 39:
                 cord[0] = 154; // 0
                 cord[1] = getBottomVal(cord[0]);
                 break;
            case 40:
                 cord[0] = 145; // 0
                 cord[1] = getBottomVal(cord[0]);
                 break;
                 
                 
            case 41:
                 cord[0] = 138; // 0
                 cord[1] = getBottomVal(cord[0]);
                 break;
            case 42:
                 cord[0] = 130; // 0
                 cord[1] = getBottomVal(cord[0]);
                 break;
            case 43:
                 cord[0] = 124; // 0
                 cord[1] = getBottomVal(cord[0]);
                 break;
            case 44:
                 cord[0] = 121; // 0
                 cord[1] = getBottomVal(cord[0]);
                 break;
            case 45:
                 cord[0] = 120; // 0
                 cord[1] = getBottomVal(cord[0]);
                 break;
             
                 
            case 46:
                 cord[0] = 121; // 0
                 cord[1] = getTopVal(cord[0]);
                 break;
            case 47:
                 cord[0] = 124; // 0
                 cord[1] = getTopVal(cord[0]);
                 break;
            case 48:
                 cord[0] = 130; // 0
                 cord[1] = getTopVal(cord[0]);
                 break;
            case 49:
                 cord[0] = 138; // 0
                 cord[1] = getTopVal(cord[0]);
                 break;
            case 50:
                 cord[0] = 145; // 0
                 cord[1] = getTopVal(cord[0]);
                 break;
                 
            case 51:
                 cord[0] = 154; // 0
                 cord[1] = getTopVal(cord[0]);
                 break;
            case 52:
                 cord[0] = 163; // 0
                cord[1] = getTopVal(cord[0]);
                 break;
            case 53:
                 cord[0] = 172; // 0
                 cord[1] = getTopVal(cord[0]);
                 break;
            case 54:
                 cord[0] = 181; // 0
                 cord[1] = getTopVal(cord[0]);
                 break;
            case 55:
                 cord[0] = 190; // 0
                 cord[1] = getTopVal(cord[0]);
                 break;
             
                 
            case 56:
                 cord[0] = 202; // 0
                 cord[1] = getTopVal(cord[0]);
                 break;
            case 57:
                 cord[0] = 214; // 0
                 cord[1] = getTopVal(cord[0]);
                 break;
            case 58:
                 cord[0] = 226; // 0
                 cord[1] = getTopVal(cord[0]);
                 break;
            case 59:
                 cord[0] = 238; // 0
                 cord[1] = getTopVal(cord[0]);
                 break;
            case 60:
                 cord[0] = 250; // 0
                 cord[1] = getTopVal(cord[0]);
                 break;        
                 
       
        }
           
       
        return cord;
   
    }
   
}
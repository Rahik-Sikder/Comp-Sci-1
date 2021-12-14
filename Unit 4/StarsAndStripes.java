public class StarsAndStripes{
   private void printTwentyStars(){
       System.out.println("********************");
   }

   private void printTwentyDashes(){
       System.out.println("--------------------");
   }

   public void printTwoBlankLines(){
       System.out.println();
       System.out.println();
   }

   public void printASmallBox(){
        printTwentyDashes(); // --
        printTwentyStars();  // **
        printTwentyDashes(); // --
        printTwentyStars();  // **
        printTwentyDashes(); // --
        printTwentyStars();  // **
        printTwentyDashes(); // --
   }

   public void printABigBox(){
       printASmallBox();
       printASmallBox();
   }
}

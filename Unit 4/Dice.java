public class Dice {
    public void printRolls(){
        // use the method rollDie 3 times in your implementation
        int roll1 = rollDice();
        int roll2 = rollDice();
        int roll3 = rollDice();
        System.out.println("Roll 1 :: " + roll1);
        System.out.println("Roll 2 :: " + roll2);
        System.out.println("Roll 3 :: " + roll3);
    }
    
    private int rollDice(){
        return (int) (Math.random() * 6) + 1;     
    }


}
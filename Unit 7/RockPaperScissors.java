import java.util.Scanner;
import static java.lang.System.*;
public class RockPaperScissors {
    
    private char playChoice;
    private char compChoice;
    private String winner;
    
    public RockPaperScissors() {
    
    }
    
    public RockPaperScissors(char player) {
        setPlayers(player);
        winner = determineWinner();
    }

    public void setPlayers(char player) {
        
        playChoice = player;
        
        int compRand = (int) (Math.random() * 3);
        switch(compRand){
            case 0: 
                compChoice = 'R';
                break;
            case 1:
                compChoice = 'P';
                break;
            case 2:
                compChoice = 'S';
                break;
            default:
                compChoice = '!';
        }
    }
    
    public String determineWinner() {

        String winner = "";
        String rockWins = "<<Rock breaks Scissors!>>";
        String paperWins = "<<Paper covers Rock!>>";
        String scissorWins = "<<Scissors cut paper!!>>";
        
        if(compChoice == playChoice){
            winner = "!Draw Game!";
        } else if(compChoice == 'R' && playChoice == 'S'){
            winner = "!Computer wins " + rockWins;            
        } else if(compChoice == 'S' && playChoice == 'P'){
            winner = "!Computer wins " + scissorWins; 
        } else if(compChoice == 'P' && playChoice == 'R'){
            winner = "!Computer wins " + paperWins; 
            
        } else if(playChoice == 'R' && compChoice == 'S'){
            winner = "!Player wins " + rockWins;            
        } else if(playChoice == 'S' && compChoice == 'P'){
            winner = "!Player wins " + scissorWins; 
        } else if(playChoice == 'P' && compChoice == 'R'){
            winner = "!Player wins " + paperWins; 
        } else {
            winner = "Something broke...";
        }
      
        return winner;
    }
    
    public String toString() {
        return "Player had " + playChoice +
                        "\nComputer had " + compChoice +
                        "\n" + winner;
    }
}
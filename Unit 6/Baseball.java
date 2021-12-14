public class Baseball extends SportsTeam {
    // instance variables
    private int homeruns;
    private int RBIs;
    private int errors;

    
    
    // default constructor
    public Baseball(String name) {
        super(name);
    }
    // second constructor
    public Baseball(String name, int gamesPlayed, int gamesWon, int gamesLost, int h, int r, int e) {
        super( name, gamesPlayed, gamesWon, gamesLost);
        homeruns = h;
        RBIs = r;
        errors = e;
    }
    // accessor method - getHomeRunsPerGame
    // calculates and returns the homeruns per game by
    // dividing number of homeruns by games played
    public double getHomeRunsPerGame() {
        return (double) homeruns / getGamesPlayed();
    }
    // accessor method - getRBIsPerGame
    // calculates and returns the RBIs per game by
    // dividing the number of RBIs by games played
    public double getRBIsPerGame() {
        return (double) RBIs / getGamesPlayed();
    }
    // accessor method - getErrorsPerGame
    // calculates and returns the errors per game by
    // dividing the number of errors by games played
    public double getErrorsPerGame() {
        return (double) errors / getGamesPlayed();
    }

    // toString method
    public String toString() {
        return super.toString() +
                "\nNumber of Homruns \t= " + homeruns +
                "\nNumber of RBIs \t\t= " + RBIs + 
                "\nNumber of error \t= " + RBIs + 
                "\nHomeruns per Game \t= " + getHomeRunsPerGame() +
                "\nRBIs per Game \t\t= " + getRBIsPerGame() +
                "\nErrors per Game \t= " + getErrorsPerGame();
    }
}
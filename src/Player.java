import java.util.List;
/**
 * @author Mirko Di Cristina
 * The class represents a player
 */
public class Player implements Comparable<Player> {

    String name;
    List<Game> games;
    League league;

    /**
     * A Constructor of Player
     * @param name name players
     * @param games List of games
     * @param league League of belonging
     */
    public Player(String name, List<Game> games, League league) {
        this.name = name;
        this.games = games;
        this.league = league;
    }

    /**
     * @return the score returns average obtained by the player in his games
     */
    public double getAverageScore() {
        double sum = 0;
        for (Game game : games) {
            sum += game.getFinalScore();
        }
        return sum / games.size();
    }

    @Override
    public String toString() {
        return "Player name: " + name + " - Games -> {" + games + "} " + " FinalScore:(" + String.format("%.2f",getAverageScore()) + ") League -> " + league;
    }

    /**
     * @param o the object to be compared
     * @return The method returns the comparison of another player's scores
     */
    public int compareTo(Player o) {
        return Double.compare(this.getAverageScore(), o.getAverageScore());
    }
}

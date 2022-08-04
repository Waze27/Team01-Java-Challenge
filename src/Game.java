/**
 * @author Soheil
 * I create a class Game that implement Comaparable with some method
 */
public class Game implements Comparable<Game> {

    int enemies;
    double score;

    /**
     * A Constructor of Games
     * @param enemies number of enemies
     * @param score   games  score
     */
    public Game(int enemies, double score) {
        this.enemies = enemies;
        this.score = score;
    }

    /**
     * each enemy killed have score
     * @return score of enemy killed
     */
    public double getFinalScore() {
        return enemies * score;
    }

    @Override
    public String toString() {
        return "Game{" +
                "enemies=" + enemies +
                ", score=" + score +
                '}';
    }

    /**
     * @param o to compare enemy score
     * @return The method the comparison of player final score
     */
    @Override
    public int compareTo(Game o) {
        return Double.compare(this.getFinalScore(), o.getFinalScore());
    }
}

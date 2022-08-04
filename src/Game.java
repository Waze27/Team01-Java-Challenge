/**
 * @author Soheil
 */
public class Game implements Comparable<Game> {

    int enemies;
    double score;


public Game(int enemies, double score) {
this.enemies = enemies;
this.score = score;
}

    /**
     * each enemy killed have score
     * @return score of enenmy killed
     */
    public double getFinalScore() {
return enemies*score;

}

 @Override
 public String toString() {
 return "Game{" +
 "enemies=" + enemies +
 ", score=" + score +
 '}';
 }

    /**
     *
     * @param o to compare enemy score
     * @return who have more score
     */
 @Override
 public int compareTo(Game o) {
 return Double.compare(this.getFinalScore(), o.getFinalScore());
 }
 }



public class Game extends Comparable {

    int enemies;
    double score;

    Game(int enemies, double score) {
        this.enemies = enemies;
        this.score = score;
    }

    public double GetScore() {
        double finaleScore = enemies * score;
        return finaleScore;
    }

    public boolean FinalScoreComparable(Game player1, Game player2) {
        if (player1.GetScore() > player2.GetScore()) {

            return true;
        } else {
            return false;
        }
    }

}
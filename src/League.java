import java.util.List;
import java.util.Random;

/**
 * @Author Mario Cotumaccio
 */

//Creating an enumeration League with ranking system
public enum League {

    Bronze,
    Silver,
    Gold,
    Platinum,
    Diamond;

    /**
     * @param p Is the player
     * @return The average score after a game
     */
    public boolean isPromotable(Player p) {
        return p.getAverageScore() > 150;
    }

    public boolean isDemotable(Player p) {
        return p.getAverageScore() < 50;
    }


    //These are functions that randomly generate the League
    private static final List<League> VALUES = List.of(values());
    private static final int SIZE = VALUES.size();
    private static final Random RANDOM = new Random();

    public static League randomLeague() {
        return VALUES.get(RANDOM.nextInt(SIZE));
    }
}
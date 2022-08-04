import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @author Mirko Di Cristina
 * @author Mario Cotumaccio
 * @author Anthony Elia
 * @author Soheil Yazdi
 * This class represents the players, their leagues and their scores
 */
public class Main {
    public static void main(String[] args) {

        List<Player> players = new ArrayList<>();
        Random random = new Random();

        SortableArray<Player> bronze = new SortableArray<>(Player.class, 100);
        SortableArray<Player> silver = new SortableArray<>(Player.class, 100);
        SortableArray<Player> gold = new SortableArray<>(Player.class, 100);
        SortableArray<Player> platinum = new SortableArray<>(Player.class, 100);
        SortableArray<Player> diamond = new SortableArray<>(Player.class, 100);

        int b = 0;
        int s = 0;
        int g = 0;
        int p = 0;
        int d = 0;

        // Generate a random names, games and leagues

        for (int i = 0; i < 100; i++) {
            int r3 = random.nextInt(1, 4);
            Player p1 = new Player(randomString(), randomGames(r3), League.randomLeague());
            players.add(p1);
            System.out.println(players.get(i).toString());

            // Generate of methods for player promotion or demotion

            if (p1.league.isPromotable(p1)) {
                players.get(i).league = p1.league.upgradeLeague(p1.league);
                System.out.println("Promote to new League! - Congratulation, now you are: " + players.get(i).league);
            } else if (p1.league.isDemotable(p1)) {
                players.get(i).league = p1.league.downgradeLeague(p1.league);
                System.out.println("Demote to new League! - now you are: " + players.get(i).league);
            } else {
                System.out.println("Stay in your League!");
            }

            switch (players.get(i).league) {
                case Bronze -> {
                    bronze.set(b, players.get(i));
                    b++;
                }
                case Silver -> {
                    silver.set(s, players.get(i));
                    s++;
                }
                case Gold -> {
                    gold.set(g, players.get(i));
                    g++;
                }
                case Platinum -> {
                    platinum.set(p, players.get(i));
                    p++;
                }
                case Diamond -> {
                    diamond.set(d, players.get(i));
                    d++;
                }
            }
        }

        System.out.println(" ----- Sorting League ----- ");

        // Sorting players by their leagues

        bronze.sort(b);
        silver.sort(s);
        gold.sort(g);
        platinum.sort(p);
        diamond.sort(d);

        System.out.println("Bronze league sorted: " + bronze.isSorted(b));
        for (int i = 0; i < b; i++) {
            System.out.println(bronze.array[i]);
        }
        System.out.println("Silver league sorted: " + silver.isSorted(b));
        for (int i = 0; i < s; i++) {
            System.out.println(silver.array[i]);
        }
        System.out.println("Gold league sorted: " + gold.isSorted(b));
        for (int i = 0; i < g; i++) {
            System.out.println(gold.array[i]);
        }
        System.out.println("Platinum league sorted: " + platinum.isSorted(b));
        for (int i = 0; i < p; i++) {
            System.out.println(platinum.array[i]);
        }
        System.out.println("Diamond league sorted: " + diamond.isSorted(b));
        for (int i = 0; i < d; i++) {
            System.out.println(diamond.array[i]);
        }
    }

    /**
     * The method is using to randomize player names
     * @return Returns a random name
     */
    static String randomString() {
        Random random = new Random();
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < 3; i++) {
            int index = random.nextInt(alphabet.length());
            char randomChar = alphabet.charAt(index);
            sb.append(randomChar);
        }
        return sb.toString();
    }

    /**
     * The method is using to randomize player's games
     * @return returns a series of random games
     */
    static List<Game> randomGames(int j) {
        Random random = new Random();
        List<Game> g1 = new ArrayList<>();

        for (int i = 0; i < j; i++) {
            int r1 = random.nextInt(1, 30);
            double r2 = random.nextDouble(0, 50);
            g1.add(new Game(r1, r2));
        }
        return g1;
    }
}


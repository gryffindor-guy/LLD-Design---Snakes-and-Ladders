import java.util.*;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numOfPlayers;
        ArrayList<Integer> snakeStarts = new ArrayList<>();
        ArrayList<Integer> ladderStarts = new ArrayList<>();;
        ArrayList<Integer> snakeEnds = new ArrayList<>();
        ArrayList<Integer> ladderEnds = new ArrayList<>();
        ArrayList<Snake> snakes = new ArrayList<>();
        ArrayList<Ladder> ladders = new ArrayList<>();
        Queue<Player> players = new LinkedList<>();

        int numOfSnakes = scanner.nextInt();
        for (int i = 0; i < numOfSnakes; i++) {
            snakeStarts.add(scanner.nextInt());
        }
        for (int i = 0; i < numOfSnakes; i++) {
            snakeEnds.add(scanner.nextInt());
        }

        int numOfLadders = scanner.nextInt();
        for (int i = 0; i < numOfLadders; i++) {
            ladderStarts.add(scanner.nextInt());
        }
        for (int i = 0; i < numOfLadders; i++) {
            ladderEnds.add(scanner.nextInt());
        }

        for (int i = 0; i < numOfSnakes; i++) {
            Snake snake = new Snake(snakeStarts.get(i), snakeEnds.get(i));
            snakes.add(snake);
        }
        for (int i = 0; i < numOfLadders; i++) {
            Ladder ladder = new Ladder(ladderStarts.get(i), ladderEnds.get(i));
            ladders.add(ladder);
        }
        numOfPlayers = scanner.nextInt();
        for (int i = 0; i < numOfPlayers; i++) {
            Player player = new Player(scanner.next());
            players.add(player);
        }
        int numOfDice = scanner.nextInt();
        int boardSize = scanner.nextInt();

        // Game Launch
        Game game = new Game(numOfPlayers, snakes, ladders, players, boardSize, numOfDice);
        game.prepareGame();
        game.startGame();

    }
    
}

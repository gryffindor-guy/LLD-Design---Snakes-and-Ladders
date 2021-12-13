import java.util.*;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numOfPlayers;
        ArrayList<Integer> snakeStarts;
        ArrayList<Integer> ladderStarts;
        ArrayList<Integer> snakeEnds;
        ArrayList<Integer> ladderEnds;
        ArrayList<String> players;
        ArrayList<Snake> snakes;
        ArrayList<Ladder> ladders;

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

    }
    
}

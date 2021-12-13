public class Game {
    private int numOfPlayers;
    private ArrayList<Snake> snakes;
    private ArrayList<Ladder> ladders;
    private Queue<Player> players;
    private Board board;
    private Dice dice;

    public Game(int numOfPlayers, ArrayList<Snake> snakes, ArrayList<Ladder> ladders, Queue<Player> players, int boardSize, int numOfDice) {
        this.numOfPlayers = numOfPlayers;
        this.snakes = snakes;
        this.ladders = ladders;
        this.players = players;
        this.board = new Board(boardSize);
        this.dice = new NDice(numOfDice, numOfDice * 6);
    }

    public void prepareGame() {
        board.prepareBoard(snakes, ladders);
    }
    public void startGame() {
        
    }
    public int getNumOfPlayers() {
        return this.numOfPlayers;
    }

}

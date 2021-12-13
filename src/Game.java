
import java.util.*;

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
    public boolean isGameOver() {
        return players.size() == 1;
    }
    public void startGame(){
        int rolledVal, oldPosition, newPosition, finishPoint;
        Player currPlayer;
        finishPoint = board.getNumberOfCells();
        while(!isGameOver()){

            currPlayer = players.poll();
            rolledVal = dice.generateRoll();
            oldPosition = currPlayer.getLocation();
            newPosition = oldPosition + rolledVal;

            if (newPosition > finishPoint) {
                System.out.println(currPlayer.getName() + " Rolled "+rolledVal +" could not move");
                players.add(currPlayer);
                continue;
            } else if (newPosition < finishPoint) {
                currPlayer.addToPath(newPosition);
                System.out.println("Player "+currPlayer.getName()+" rolled "+rolledVal+" and moved from "+oldPosition+" to "+newPosition);
                players.add(currPlayer);
            } else {
                System.out.println("Player "+currPlayer.getName()+" won the game.");
                currPlayer.addToPath(newPosition);
                currPlayer.printPath();
            }

            int jumpVal = board.getJumpValue(newPosition);
            while(jumpVal != -1){
                if(jumpVal < newPosition)
                    System.out.println("Oops! Swallowed by a snake, going down from "+newPosition+" to "+jumpVal);
                else
                    System.out.println("Hurray! Climbing ladder from "+newPosition+" to "+jumpVal);
                currPlayer.addToPath(jumpVal);
                newPosition = jumpVal;
                jumpVal = board.getJumpValue(newPosition);
            }
        }
        System.out.println("Game is over!");
    }
    public int getNumOfPlayers() {
        return this.numOfPlayers;
    }

}

import java.util.*;

public class Board {

    private int numberOfCells;
    private int startingPoint = 1;
    private Map<Integer, Integer> jumpers;

    public Board(int numberOfCells) {
        this.numberOfCells = numberOfCells;
        this.jumpers = new HashMap<>();
    }
    public int getNumberOfCells() {
        return this.numberOfCells;
    }

    public void prepareBoard(ArrayList<Snake> snakes, ArrayList<Ladder> ladders) {

        this.addSnakesToBoard(snakes);
        this.addLaddersToBoard(ladders);

    }
    public void addSnakesToBoard(ArrayList<Snake> snakes) {
        for(Snake currSnake : snakes) {
            jumpers.put(currSnake.getStartingPoint(), currSnake.getEndingPoint());
        }
    }
    public void addLaddersToBoard(ArrayList<Ladder> ladders) {
        for(Ladder currLadder : ladders) {
            jumpers.put(currLadder.getStartingPoint(), currLadder.getEndingPoint());
        }
    }
    public int getJumpValue(int location) {
        if (jumpers.containsKey(location)) {
            return jumpers.get(location);
        }
        return -1;
    }

}
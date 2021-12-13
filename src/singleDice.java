import java.util.concurrent.ThreadLocalRandom;

public class singleDice implements Dice {
    
    private int minValue = 1;
    private int maxValue = 6;

    public int getMinValue() {
        return this.minValue;
    }
    public int getMaxValue() {
        return this.maxValue;
    }
    public int generateRoll() {
        int randomNum = ThreadLocalRandom.current().nextInt(this.getMinValue(), max + 1);
    }
}

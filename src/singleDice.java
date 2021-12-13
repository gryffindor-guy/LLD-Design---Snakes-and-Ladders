import java.util.concurrent.ThreadLocalRandom;
import java.util.*;

public class SingleDice extends Dice {

    public SingleDice(int minValue, int maxValue) {
        this.setMinValue(minValue);
        this.setMaxValue(maxValue);
    }

    public int generateRoll() {
        return (int randomNum = ThreadLocalRandom.current().nextInt(this.getMinValue(), this.getMaxValue() + 1));
    }
}

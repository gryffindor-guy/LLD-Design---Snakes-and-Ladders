import java.util.*;
import java.util.concurrent.ThreadLocalRandom;


public class NDice extends Dice {

    public NDice(int minValue, int maxValue) {
        this.setMinValue(minValue);
        this.setMaxValue(maxValue);
    }

    public int generateRoll() {
        int randomNum = ThreadLocalRandom.current().nextInt(this.getMinValue(), this.getMaxValue() + 1);
        return randomNum;
    }
}

public class NDice extends Dice {

    public NDice(int minValue, int maxValue) {
        this.setMinValue(minValue);
        this.setMaxValue(maxValue);
    }

    public int generateRoll() {
        return (int randomNum = ThreadLocalRandom.current().nextInt(this.getMinValue(), this.getMaxValue() + 1));
    }
}

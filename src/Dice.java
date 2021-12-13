public abstract class Dice {
    private int minValue;
    private int maxValue;

    public int getMinValue() {
        return this.minValue;
    }
    public int getMaxValue() {
        return this.maxValue;
    }
    public void setMinValue(int minValue) {
        this.minValue = minValue;
    }
    public void setMaxValue(int maxValue) {
        this.maxValue = maxValue;
    }
    public int getNumberOfDices() {
        return this.minValue;
    }
    public abstract int generateRoll();
}

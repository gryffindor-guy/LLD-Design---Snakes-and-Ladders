public abstract class Jumper {
    private int startingPoint;
    private int endingPoint;

    public int getStartingPoint() {
        return this.startingPoint;
    }
    public int getEndingPoint() {
        return this.endingPoint;
    }
    public void setStartingPoint(int startPoint) {
        this.startingPoint = startPoint;
    }
    public void setEndingPoint(int endPoint) {
        this.endingPoint = endPoint;
    }
}

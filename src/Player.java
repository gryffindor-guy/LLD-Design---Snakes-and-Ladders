public class Player {

    private String name;
    private int location = 0;
    private ArrayList<Integer> path;
    private boolean winStatus = false;

    public Player(String name) {
        this.name = name;
        this.path = new ArrayList<>();
    }
    public int getLocation() {
        return this.location;
    }
    public String getName() {
        return this.name;
    }
    public boolean isWon() {
        return this.winStatus;
    }
    public void addToPath(int position) {
        this.path.add(position);
        this.location = position;
    }
    public void printPath() {
        for(Integer loc : this.path) {
            System.out.print(loc + " --> ");
        }
        System.out.println();
    }
}

public class Director extends Person {
    private int numberOfShows = 0;

    public Director() {

    }

    public void addShow() {
        this.numberOfShows++;
    }

    public int getNumberOfShows() {
        return numberOfShows;
    }
}

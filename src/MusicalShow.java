public class MusicalShow extends Show {
    protected final Person musicAuthor;
    protected final String librettoText;

    public MusicalShow(String title, int duration, Director director,
                       Person musicAuthor, String librettoText) {
        super(title, duration, director); // родитель
        this.musicAuthor = musicAuthor;
        this.librettoText = librettoText;
    }

    public void printLibrettoText() {
        System.out.println(librettoText);
    }
}

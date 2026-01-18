import java.util.ArrayList;

public class Show {
    private final String title;
    private final int duration;
    private final Director director;
    protected final ArrayList<Actor> listOfActors = new ArrayList<>();

    public String getTitle() {
        return title;
    }

    public Show(String title, int duration, Director director) {
        this.title = title;
        this.duration = duration;
        this.director = director;
        director.addShow();
    }

    @Override
    public String toString() {
        return title + ", режиссёр: " + director.getName() + " " + director.getSurname()
                + ", длительность: " + duration + " мин.";
    }

    public void printAllActors() {
        for (Actor actor : listOfActors) {
            System.out.println(actor);
        }
    }

    public void addNewActorInShow(Actor actor) {
        if (listOfActors.contains(actor)) {
            System.out.println("Такой актёр уже есть в спектакле.");
        } else {
            listOfActors.add(actor);
        }
    }

    public void replaceActor(Actor newActor, String surnameToReplace) {
        for (int i = 0; i < listOfActors.size(); i++) {
            if (listOfActors.get(i).getSurname().equals(surnameToReplace)) {
                if (listOfActors.contains(newActor)) {
                    System.out.println("Такой актёр уже есть в спектакле.");
                    return;
                }
                listOfActors.set(i, newActor);
                return;
            }
        }
        System.out.println("Актёр с фамилией " + surnameToReplace + " не найден.");
    }
}



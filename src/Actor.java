import java.util.Objects;

public class Actor extends Person {

    private double height;
    private int heightInt = (int) (getHeight() * 10);

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public String toString() {
        String genderStr = getGender() == Person.Gender.MALE ? "мужчина" : "женщина";
        return getName() + " " + getSurname() + " (" + getHeight() + "см, " + genderStr + ")";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Actor actor)) return false;
        return Math.abs(actor.getHeight() - getHeight()) < 0.1
                && getName().equals(actor.getName())
                && getSurname().equals(actor.getSurname())
                && getGender() == actor.getGender();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getSurname(), heightInt, getGender());
    }
}

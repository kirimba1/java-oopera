import java.util.Objects;

public class Actor extends Person {

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
        int heightInt = (int) (getHeight() * 10);
        return Objects.hash(getName(), getSurname(), heightInt, getGender());
    }
}

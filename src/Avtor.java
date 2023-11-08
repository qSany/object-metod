import java.util.Objects;

public class Avtor {
    private String name ;
    private String surName ;

    public Avtor(String name, String surName) {
        this.name = name;
        this.surName = surName;
    }

    public String getName() {
        return name;
    }

    public String getSurName() {
        return surName;
    }

    @Override
    public String toString() {
        return "Avtor" +
                "name='" + name + '\'' +
                ", surName='" + surName + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Avtor avtor = (Avtor) o;
        return Objects.equals(name, avtor.name) && Objects.equals(surName, avtor.surName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surName);
    }
}

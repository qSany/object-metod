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
}

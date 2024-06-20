package DZ.DZ_4.model;

public class Teatcher extends User  {
    protected String patronymic;

    public Teatcher(int id, String name, String lastName, String patronymic) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.patronymic = patronymic;
    }
    @Override
    public String toString() {
        return String.format("Teacher [id=%d, name=%s, lastName=%s, patronymic=%s]", id, name, lastName, patronymic);
    }
}

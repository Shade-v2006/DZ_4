package DZ.DZ_4.model;

import DZ.DZ_4.util.UserComparator;

public abstract class User extends UserComparator<User> implements Comparable<User> {

    protected int id;
    protected String name;
    protected String lastName;
    protected String patronymic;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getPatronymic(){
        return patronymic;
    }
    public void setPatronymic(String patronymic){
        this.patronymic = patronymic;
    }


    @Override
    public int compareTo(User o) {
        return compare(this, o);
    }
}

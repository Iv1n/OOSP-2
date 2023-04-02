package PP;

public abstract class People {
    String name;
    String dateBorne;
    String gender;

    public People(String name, String dateBorne, String gender) {
        this.name = name;
        this.dateBorne = dateBorne;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDateBorne() {
        return dateBorne;
    }

    public void setDateBorne(String dateBorne) {
        this.dateBorne = dateBorne;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}

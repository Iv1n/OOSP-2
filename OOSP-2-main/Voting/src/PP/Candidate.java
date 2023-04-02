package PP;

public class Candidate extends People {
    int id;

    public Candidate(String name, String dateBorne, String gender) {
        super(name, dateBorne, gender);
    }

    public Candidate(String name, String dateBorne, String gender, int id) {
        super(name, dateBorne, gender);
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public String getDateBorne() {
        return super.getDateBorne();
    }

    @Override
    public void setDateBorne(String dateBorne) {
        super.setDateBorne(dateBorne);
    }

    @Override
    public String getGender() {
        return super.getGender();
    }

    @Override
    public void setGender(String gender) {
        super.setGender(gender);
    }
}

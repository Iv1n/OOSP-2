package PP;

public class Users extends People {
    public Users(String name, String dateBorne, String gender) {
        super(name, dateBorne, gender);
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

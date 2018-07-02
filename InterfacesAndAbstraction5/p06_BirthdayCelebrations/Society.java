package p06_BirthdayCelebrations;

public abstract class Society implements IControl {
    private String id;
    private String birthDate;

    public String getId() {
        return id;
    }


    public String getBirthDate() {
        return birthDate;
    }


    public void setId(String id) {
        this.id = id;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    @Override
    public boolean idControl(String endingNums) {
        if (this.getId().endsWith(endingNums)) {
            System.out.println(this.getId());
            return true;
        }

        return false;
    }

    @Override
    public boolean birthDateControl(String year) {
        String[] birthYear = this.getBirthDate().split("/");

        if (birthYear[2].equals(year)) {
            System.out.println(this.getBirthDate());
        }

        return false;
    }
}

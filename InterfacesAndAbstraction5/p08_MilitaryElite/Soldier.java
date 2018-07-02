package p08_MilitaryElite;

public abstract class Soldier implements ISoldier{
    private Integer id;
    private String fisrtName;
    private String lastName;
    private Double salary;

    public Soldier(Integer id, String fisrtName, String lastName, Double salary) {
        this.id = id;
        this.fisrtName = fisrtName;
        this.lastName = lastName;
        this.salary = salary;
    }

    public Soldier(Integer id, String fisrtName, String lastName) {
        this.id = id;
        this.fisrtName = fisrtName;
        this.lastName = lastName;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFisrtName() {
        return fisrtName;
    }

    public void setFisrtName(String fisrtName) {
        this.fisrtName = fisrtName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }
}

package p08_MilitaryElite;

public class Spy extends Soldier implements ISpy {

    private String codeNumber;


    public Spy(Integer id, String fisrtName, String lastName, String codeNumber) {
        super(id, fisrtName, lastName);
        this.setCodeNumber(codeNumber);
    }

    public String getCodeNumber() {
        return codeNumber;
    }

    public void setCodeNumber(String codeNumber) {
        this.codeNumber = codeNumber;
    }

    @Override
    public String toString() {

            StringBuilder sb = new StringBuilder();
            sb.append("Name: ").append(this.getFisrtName()).append(" ").append(this.getLastName()).append(" ")
                    .append("Id: ").append(this.getId()).append("\n");
            sb.append("Code Number: ").append(this.getCodeNumber()).append("\n");

        return sb.toString();
    }
}

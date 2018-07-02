package p03_Ferarri;

public class Ferrari_488_Spider extends Ferrari implements I_Car{

    private static String model = "488-Spider" ;

    public Ferrari_488_Spider(Driver driver) {
        super(driver);
    }

    public String getModel() {
        return model;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.getModel()).append("/")
                .append(this.pushBrakes()).append("/")
                .append(this.pushGas()).append("/")
                .append(this.getDriver().getDriverName());
        return sb.toString();
    }
}

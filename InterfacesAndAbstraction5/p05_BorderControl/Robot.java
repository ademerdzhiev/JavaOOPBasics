package p05_BorderControl;

public class Robot extends Society {
    private String model;

    public Robot(String id, String model) {
        super(id);
        this.model = model;
    }

    public String getModel() {
        return model;
    }



}

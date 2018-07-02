package p06_BirthdayCelebrations;

public class Robot extends Society {
    private String model;

    public Robot(String id, String model) {
        this.setId(id);
        this.model = model;
    }

    public String getModel() {
        return model;
    }



}

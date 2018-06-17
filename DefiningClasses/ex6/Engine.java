package ex6;

public class Engine {
    private Integer engineSpeed;
    private Integer enginePower;

    public Engine(Integer engineSpeed, Integer enginePower) {
        this.engineSpeed = engineSpeed;
        this.enginePower = enginePower;
    }

    public Integer getEngineSpeed() {
        return engineSpeed;
    }

    public void setEngineSpeed(Integer engineSpeed) {
        this.engineSpeed = engineSpeed;
    }

    public Integer getEnginePower() {
        return enginePower;
    }

    public void setEnginePower(Integer enginePower) {
        this.enginePower = enginePower;
    }
}

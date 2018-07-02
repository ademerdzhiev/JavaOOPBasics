package p05_BorderControl;

public abstract class Society implements IControl {
    private String id;

    public Society(String id) {
        this.setId(id);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public boolean idControl(String endingNums) {
        if (this.getId().endsWith(endingNums)) {
            System.out.println(this.getId());
            return true;
        }

        return false;
    }
}

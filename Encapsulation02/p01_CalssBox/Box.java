package p01_CalssBox;

public class Box {
    private Double length;
    private Double width;
    private Double height;

    public Box(Double length, Double width, Double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public Double surfaceArea(){
        System.out.print("Surface Area - ");
        return  2*length*width + 2*length*height + 2*width*height;
    }

    public Double lateralArea() {
        System.out.print("Lateral Surface Area - ");
        return 2*length*height + 2*width*height;
    }

    public Double volume() {
        System.out.print("Volume - ");
        return length*width*height;
    }
}

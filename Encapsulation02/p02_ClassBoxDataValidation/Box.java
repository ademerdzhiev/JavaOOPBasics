package p02_ClassBoxDataValidation;

import com.sun.jdi.InvalidLineNumberException;

public class Box {
    private Double length;
    private Double width;
    private Double height;

    public Box(Double length, Double width, Double height) {
        this.setLength(length);
        this.setWidth(width);
        this.setHeight(height);
    }

    public Box() {

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

    private void setLength(Double length) {
        if(length > 0) {
            this.length = length;
        } else {
            throw  new IllegalArgumentException("Length cannot be zero or negative.");
        }
    }

    private void setWidth(Double width) {
        if (width > 0) {
            this.width = width;
        } else {
           throw new IllegalArgumentException("Width cannot be zero or negative.");
        }
    }

    private void setHeight(Double height) {
        if (height > 0) {
            this.height = height;
        } else {
            throw new IllegalArgumentException("Height cannot be zero or negative.");
        }
    }
}

package p04_ShoppingSpree;

public class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        if (name.equals("") || name.equals(" ") || name.contains(" ")) {
            throw new IllegalArgumentException("Name cannot be empty");
        }

        if (price < 0) {
            throw new IllegalArgumentException("Money cannot be negative");
        }
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}

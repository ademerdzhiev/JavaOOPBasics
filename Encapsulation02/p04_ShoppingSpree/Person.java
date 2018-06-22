package p04_ShoppingSpree;

import java.util.LinkedList;
import java.util.List;

public class Person {
    private String name;
    private double money;
    private List<Product> products;

    public Person(String name, Double money) {
        if (name.equals("") || name.equals(" ") || name.contains(" ")) {
            throw new IllegalArgumentException("Name cannot be empty");
        }

        if (money < 0) {
            throw new IllegalArgumentException("Money cannot be negative");
        }

        this.name = name;
        this.money = money;
        this.products = new LinkedList<>();
    }

    private void setMoney(double money) {
        this.money = money;
    }


    public void byuProduct (Product product) {
        double currentMoney = this.money - product.getPrice();
        if (currentMoney < 0) {
            System.out.printf("%s can't afford %s%n", this.name, product.getName());
        } else {
            products.add(product);
            System.out.printf("%s bought %s%n", this.name, product.getName());
            setMoney(currentMoney);
        }
    }

    public void getProducts() {
        if (products.isEmpty()) {
            System.out.printf("%s - Nothing bought %n", this.name);
        } else {
            String finalProductList = "";

            for (Product prod: this.products) {
                finalProductList = finalProductList + prod.getName() + ", ";
            }

            String productListToPrint = finalProductList.substring(0, finalProductList.length() -2);

            System.out.printf("%s - %s%n", this.name, productListToPrint);

        }


    }
}

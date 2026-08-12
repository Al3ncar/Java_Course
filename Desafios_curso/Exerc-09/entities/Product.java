package entities;

public class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        addPriceInProd(price);
    }

    public void addPriceInProd(double value) {
        price += value;
    }

    public double getPrice() {
        return price;
    }
}

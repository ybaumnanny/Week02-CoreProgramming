import java.util.*;

abstract class Product {
    private int productId;
    private String name;
    private double price;

    public Product(int productId, String name, double price) {
        this.productId = productId;
        this.name = name;
        this.price = price;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public abstract double calculateDiscount();

    public void displayDetails() {
        System.out.println("Product ID: " + productId);
        System.out.println("Name: " + name);
        System.out.println("Price: " + price);
    }
}

interface Taxable {
    double calculateTax();
    String getTaxDetails();
}

class Electronics extends Product implements Taxable {
    private static final double TAX_RATE = 0.18;
    private double discount;

    public Electronics(int productId, String name, double price, double discount) {
        super(productId, name, price);
        this.discount = discount;
    }

    @Override
    public double calculateDiscount() {
        return getPrice() * discount / 100;
    }

    @Override
    public double calculateTax() {
        return getPrice() * TAX_RATE;
    }

    @Override
    public String getTaxDetails() {
        return "Electronics Tax: " + calculateTax();
    }
}

class Clothing extends Product implements Taxable {
    private static final double TAX_RATE = 0.05;
    private double discount;

    public Clothing(int productId, String name, double price, double discount) {
        super(productId, name, price);
        this.discount = discount;
    }

    @Override
    public double calculateDiscount() {
        return getPrice() * discount / 100;
    }

    @Override
    public double calculateTax() {
        return getPrice() * TAX_RATE;
    }

    @Override
    public String getTaxDetails() {
        return "Clothing Tax: " + calculateTax();
    }
}

class Groceries extends Product {
    private double discount;

    public Groceries(int productId, String name, double price, double discount) {
        super(productId, name, price);
        this.discount = discount;
    }

    @Override
    public double calculateDiscount() {
        return getPrice() * discount / 100;
    }
}

public class ECommercePlatform {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();

        // Add products
        Electronics laptop = new Electronics(1, "Laptop", 50000, 10);
        Clothing shirt = new Clothing(2, "Jeans", 2000, 15);
        Groceries apple = new Groceries(3, "Mango", 200, 5);

        products.add(laptop);
        products.add(shirt);
        products.add(apple);

        // Calculate and print final price for each product
        for (Product product : products) {
            double discount = product.calculateDiscount();
            double tax = product instanceof Taxable ? ((Taxable) product).calculateTax() : 0;
            double finalPrice = product.getPrice() + tax - discount;

            product.displayDetails();
            System.out.println("Discount: " + discount);
            System.out.println("Tax: " + tax);
            System.out.println("Final Price: " + finalPrice);

            if (product instanceof Taxable) {
                Taxable taxable = (Taxable) product;
                System.out.println(taxable.getTaxDetails());
            }
        }
    }
}

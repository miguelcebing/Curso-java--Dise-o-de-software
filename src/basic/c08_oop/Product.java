package basic.c08_oop;

public class Product {
    //Atributos
    String name;
    double price;

    // Constructor
    public Product(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public double getDiscount(double discount) {
        double discountIs = price * discount;
        double newPrice = price - discountIs;
        System.out.println("Discount: " + newPrice  );
        return newPrice;

    }
}

package basic.c08_test_oop;

public class ProductExercise {
    //Atributos
    private double price;

    //Constructor
    public ProductExercise(double price) {
        this.setPrice(price);
    }

    //Settprice
    public void setPrice(double price) {
        if (price> 0){
            this.price = price;
        }else {
            System.out.println("The price is not commpatible");
        }
    }

    //metodo
    public double getPrice() {
        return price;
    }

}

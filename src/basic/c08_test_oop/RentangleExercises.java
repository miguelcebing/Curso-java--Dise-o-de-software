package basic.c08_test_oop;

public class RentangleExercises {
    //atributos
    private double base;
    private double height;

    //Constructor
    public  RentangleExercises(double base, double height) {
        this.base = base;
        this.height = height;
    }

    //Metodos

    public void setHeight(double height) {
        this.height = height;
    }
    public void setBase(double base) {
        this.base = base;
    }
    public double getHeight() {
        return height;
    }

    public double calculateArea() {
        return this.base * this.height;

    }

}

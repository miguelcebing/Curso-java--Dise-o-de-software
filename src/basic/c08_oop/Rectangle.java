package basic.c08_oop;

public class Rectangle {
    //atributos
    double base;
    double height;

    //Constructor
    public Rectangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    // metodos

    public double calculateArea() {
        double area = base*height;
        System.out.println("The area of the rectangle is " + area);
        return area;
    }

    public double calculatePerimeter() {
        double calculate = (base *2) + (height*2);
        System.out.println("The perimeter of the rectangle is " + calculate);
        return calculate;
    }
}

package basic.c08_oop;

public class Exercise2Shape {
    public static void main(String[] args) {
        var shape = new Exercise2Shape.Shape();
        var circle = new Shape.Circle();
        var rectangle = new Shape.Rectangle();
        circle.calculateArea(2);
        rectangle.calculateArea(7,6);


    }

    public static class Shape{
        public void calculateArea(double radius){
            double result = 3.1416 *(radius * radius);
            System.out.println(result);
        }

        public void calculateArea(double base, double height) {
            double result = base * height;
            System.out.println(result);


    }

    public static class Circle extends Shape{



    }

    public static class Rectangle extends Shape {



        }
    }

}


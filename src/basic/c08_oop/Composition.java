package basic.c08_oop;

public class Composition {
    public static void main(String[] args) {


        // composicion ("Tiene un")

        var car = new Car();
        car.engine.one();


    }
    public static class Engine{

        public void one(){
            System.out.println("one");
        }


    }
    public static class Car {
         final private Engine engine = new Engine();
        public void on(){
            engine.one();

        }
    }
}

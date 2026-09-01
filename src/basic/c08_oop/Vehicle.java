package basic.c08_oop;

public class Vehicle {
    public static void main(String[] args) {
        var car = new Car();
        car.honk();
        car.move();

    }

    public static class VehicleBase {
        public void move() {
            System.out.println("The vehicle is moving");
        }
    }
    public static class Car extends VehicleBase {
        public void honk(){
            System.out.println("The car is honking");
        }
    }
}



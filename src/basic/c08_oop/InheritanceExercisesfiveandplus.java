package basic.c08_oop;

import java.util.ArrayList;

public class InheritanceExercisesfiveandplus {
    public static void main(String[] args) {

        System.out.println("--- 1. Ejercicio de Shapes ---");
        Shape circle = new Circle(5.0);
        Shape rectangle = new Rectangle(4.0, 6.0);
        System.out.println("Área del círculo: " + circle.calculateArea());
        System.out.println("Área del rectángulo: " + rectangle.calculateArea());

        System.out.println("\n--- 2. Ejercicio de Bird y Eagle ---");
        Bird myEagle = new Eagle();
        myEagle.fly(); // Llama al original y luego añade lo propio con super.fly()

        System.out.println("\n--- 3. Ejercicio de Vehicles ---");
        Vehicle myCar = new Car();
        Vehicle myBike = new Bike();
        Vehicle myTruck = new Truck();

        myCar.describe();
        myBike.describe();
        myTruck.describe();

        System.out.println("\n--- 4. Ejercicio de ArrayList de Animales ---");
        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(new Dog());
        animals.add(new Cat());
        animals.add(new Bird());

        for (Animal animal : animals) {
            animal.makeSound();
        }
    }

    // ==========================================
    // 1. CLASE ABSTRACTA SHAPE
    // ==========================================
    public static abstract class Shape {
        public abstract double calculateArea();
    }

    public static class Circle extends Shape {
        private double radius;

        public Circle(double radius) {
            this.radius = radius;
        }

        @Override
        public double calculateArea() {
            return Math.PI * radius * radius;
        }
    }

    public static class Rectangle extends Shape {
        private double width;
        private double height;

        public Rectangle(double width, double height) {
            this.width = width;
            this.height = height;
        }

        @Override
        public double calculateArea() {
            return width * height;
        }
    }

    // ==========================================
    // 2. CLASE BIRD Y EAGLE (con super.fly())
    // ==========================================
    public static class Bird extends Animal {
        public void fly() {
            System.out.println("The bird is flying high.");
        }

        @Override
        public void makeSound() {
            System.out.println("Bird sound: Chirp chirp!");
        }
    }

    public static class Eagle extends Bird {
        @Override
        public void fly() {
            super.fly(); // Llama al método original del padre
            System.out.println("The eagle dives down to catch its prey with precision!");
        }
    }

    // ==========================================
    // 3. CLASE VEHICLE Y 3 SUBCLASES (describe)
    // ==========================================
    public static class Vehicle {
        public void describe() {
            System.out.println("This is a generic vehicle.");
        }
    }

    public static class Car extends Vehicle {
        @Override
        public void describe() {
            System.out.println("This is a car with 4 wheels and an engine.");
        }
    }

    public static class Bike extends Vehicle {
        @Override
        public void describe() {
            System.out.println("This is a bike with 2 wheels powered by pedals.");
        }
    }

    public static class Truck extends Vehicle {
        @Override
        public void describe() {
            System.out.println("This is a heavy truck used for cargo transportation.");
        }
    }

    // ==========================================
    // 4. CLASE BASE ANIMAL (para el ArrayList)
    // ==========================================
    public static class Animal {
        public void makeSound() {
            System.out.println("Some generic animal sound...");
        }
    }

    public static class Dog extends Animal {
        @Override
        public void makeSound() {
            System.out.println("Dog says: Wof wof!");
        }
    }

    public static class Cat extends Animal {
        @Override
        public void makeSound() {
            System.out.println("Cat says: Meow meow!");
        }
    }
}


package basic.c08_oop;

public class Abstractiontuto {
    public static void main(String[] args) {

        // Abstraccion

        //- Clase abstratca

        var animal = new Dog();
        animal.sleep();
        animal.sleep();
        var cat = new Cat();
        cat.sleep();
        cat.sound();

        //-Interface

    }

    //-clase abstracta
    public static  abstract class Animal {

        public abstract void sound();
        public void sleep(){
            System.out.println("Animal sleep");
        }
    }

    public static   class Dog extends Animal {
        @Override
        public void sleep(){
            System.out.println("Dog sleep");
        }

        @Override
        public void sound() {
            System.out.println("Dog sound");
        }
    }

    public static   class Cat extends Animal {
        @Override
        public void sound(){
            System.out.println("Cat sound");
        }

    }

    //-Interface

     public interface Flying{
        void fly();

    }

    public interface   Flying2{
        void fly2();
    }

    public static class Bird1 extends Animal implements Flying, Flying2{

        @Override
        public void fly2() {
            System.out.println("Bird1 fly2");
        }

        @Override
        public void fly() {
            System.out.println("Bird1 fly");
        }

        @Override
        public void sound(){
            System.out.println("Bird1 sound");
        }
    }

    public static class bat extends Animal implements Flying {

        @Override
        public void fly() {
            System.out.println("bat fly");
        }

        @Override
        public void sound(){
            System.out.println("Im batman");
        }
    }

}

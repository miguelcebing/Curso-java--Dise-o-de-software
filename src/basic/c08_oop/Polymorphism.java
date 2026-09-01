package basic.c08_oop;

public class Polymorphism {
    public static void main(String[] args) {

        // polimorfismo

        // - polimorfismo por herencia (Sobrescritura)

        var animal = new Animal();
        animal.sound();

        var dog = new Dog();
        dog.sound();

        //polimorfismo por sobrecarga

    }
    public static class Animal {

        public void sound(){
            System.out.println("Animal sound");
        }

    }
    public static class Dog extends Animal {
        @Override
        public void sound() {
            System.out.println("guaf ");
        }
    }
}

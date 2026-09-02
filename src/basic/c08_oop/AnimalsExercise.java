package basic.c08_oop;

public class AnimalsExercise {
    public static void main(String[] args) {
        var dog = new AnimalsExercise.Dog();
        var cat = new AnimalsExercise.Cat();
        var cow = new AnimalsExercise.Cow();
        dog.makeSound();
        cat.makeSound();
        cow.makeSound();

    }
    public static void showAnimalType(Animal animal) {
        animal.getType();
    }

    public static class Animal {
        public void makeSound(){
            System.out.println("Sounf of animal ");

        }

        public void getType() {
            System.out.println("Soy un animal genérico");
        }


    }
    public static class Dog extends Animal {
        @Override
        public void makeSound() {
            System.out.println("guaf");
        }
        @Override
        public void getType() {
            System.out.println("Tipe = Dog");
        }
    }
    public static class Cat extends Animal {
        @Override
        public void makeSound() {
            System.out.println("meaw");
        }
        @Override
        public void getType() {
            System.out.println("Tipe = Cat");
        }
    }
    public static class Cow extends Animal {
        @Override
        public void makeSound() {
            System.out.println("muuuuu ");
        }

        @Override
        public void getType() {
            System.out.println("Tipe = Cow");
        }
    }
}

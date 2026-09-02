package basic.c08_oop;

public class InheritanceTuto {
    public static void main(String[] args) {

        //Herencia ( es un )
        var animal = new Animal("animal");
        //animal.name = "mi animal";
        animal.eat();

        var dog = new Dog("mou",7);
        //dog.name = "dropy";
        dog.eat();

        var cat = new Cat("Chispas");
        //cat.name = "manchas";
        cat.eat();

        var bird = new Bird("Pokemon");
        //bird.name = "Pichoncito";
        bird.eat();
        bird.fly();


    }

    public static class Animal {

        final private String name;

        public Animal(String name) {
            this.name =name;
        }

        public void eat() {
            System.out.println("Animal eating with name " + name);
        }

        public void makeSound() {
            System.out.println("Animal eating sound");
        }

    }

    public static class Dog extends Animal {

        int age;
        public Dog(String name, int age) {
            super(name);
            this.age = age;
        }

        @Override
        public void eat() {
            super.eat();
        }

        public void makeSound() {
            System.out.println("wof ");
        }
    }

    public static class Cat extends Animal {

        public Cat(String name) {
            super(name);
        }

        @Override
        public void makeSound() {
            System.out.println("meow ");
        }

        // Si está vacía, solo necesita tener las llaves correctas de apertura y cierre
    }

    public static class Bird extends Animal {

        public Bird(String name) {
            super(name);
        }

        public void fly() {
            System.out.println("Bird flying");
        }
    }


}

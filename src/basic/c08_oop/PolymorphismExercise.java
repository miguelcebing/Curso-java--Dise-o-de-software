package basic.c08_oop;

public class PolymorphismExercise {
    public static void main(String[] args) {
        // 1. Crea una clase Animal con el método makeSound(). Luego crea subclases Dog, Cat y Cow que sobrescriban ese método con su sonido característico.
        var animal = new AnimalsExercise.Animal();
        animal.makeSound();
        var dog = new AnimalsExercise.Dog();
        dog.makeSound();
        var cow = new AnimalsExercise.Cow();
        cow.makeSound();
        var cat = new AnimalsExercise.Cat();
        cat.makeSound();

        // 2. Crea una clase Shape con el método calculateArea(). Luego implementa subclases Circle y Rectangle con sus propias fórmulas de área.
        var circle = new Exercise2Shape.Shape();
        circle.calculateArea(5);
        var rectangle = new Exercise2Shape.Shape();
        rectangle.calculateArea(5,6);

        // 3. Crea una clase Printer con varios métodos print() sobrecargados que acepten diferentes tipos de parámetros (String, int, double). Llama a cada uno desde main.
        var print = new Printer.PrinterExercise();
        print.print(5);
        print.print("Carechimbas todos");
        print.print(5.7);

        // 4. Crea una clase Greeter con dos métodos greet(): uno que salude con "Hello", y otro que reciba un nombre y salude con "Hello, [nombre]".

        var greet = new Greeter();
        greet.greet();
        greet.greet("miguelito");


        //  Crea una función showAnimalType(Animal animal) que reciba diferentes animales (Dog, Cat, Horse) para que cada una imprima su tipo con su propio getType() sobrescrito.
         dog.getType();
         cat.getType();
         cow.getType();

         // 10. Crea una clase Character con método attack(). Luego subclases Warrior, Mage y Archer que implementen ataques diferentes. En main, crea un array de Character y llama a attack() polimórficamente.

    }
}

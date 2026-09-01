package basic.c08_oop;

import basic.c08_test_oop.EmployeeExercise;

public class Inheritanceexercises {
    public static void main(String[] args) {
        // clase vehicle con metodo move() luego una subclase Car que herede de vehicle y agrega el metodo honk()

        var vehicle = new Vehicle(); // aqui esta lo de este punto

        // Clase person con atributo name y age, despues clase student que agregue el atributo grade y metodo study()
        var person = new PersonForExercise();// aqui esta lo de este punto

        // Clase animal con metodo makeSound(). Que dog diga wof y cat diga neow sobreescribiendo el metodo
        var mydog = new InheritanceTuto.Dog("Droopy",9);
        mydog.makeSound();
        var myCat = new InheritanceTuto.Cat("Katherine");
        myCat.makeSound();

        // CLase employee tiene atributos name y salary. manager hereda de Employee y agrega atributo departament
        var manager = new EmployeeExercise.Manager();

        //CLase abstracta Shape con metodo calculateArea(). luego implementar   metodo circle y rectangule
        // En la clase InharitanceExercisesFiveAndplus estan las pruebas

        // Clase bird con metodo fly(). luego crear eagle que sobreescriba fly() pero tambien llame al metodo original con super.fly
        // En la clase InharitanceExercisesFiveAndplus estan las pruebas

        //crear clase vehicle y 3 subclases: car, bike y truck cada una con un metodo describe() sobrescrito
        // En la clase InharitanceExercisesFiveAndplus estan las pruebas

        //crear ArrayList<Animal> que contenga instancias de dog cat y bird recorre la lista y llama makesound()
        // En la clase InharitanceExercisesFiveAndplus estan las pruebas


    }
}

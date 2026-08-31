package basic.c08_oop;

public class Class {
    public static void main(String[] args) {

        var person = new Person("Miiguel", 28);

        //person.name = "Miguel";
        //person.age = 18;

        person.sayHello();

        person.name = "Felipe";

        System.out.println("I am " + person.name + "I'm   " + person.age + " years old");

        var person2 = new Person("Felipe", 18);
        person2.sayHello();

    }
}


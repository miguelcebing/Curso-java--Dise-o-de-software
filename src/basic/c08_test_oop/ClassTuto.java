package basic.c08_test_oop;

import basic.c08_oop.Person;

public class ClassTuto {
    public static void main(String[] args) {

        var person = new Person("Miiguel", 28);

        //person.name = "Miguel";
        //person.age = 18;

        person.sayHello();

        person.name = "Felipe";

        System.out.println("I am " + person.name + "I'm   " + person.getAge() + " years old and my id is "+ person.getId() );

        System.out.println(person.getId());

        person.setAge(38);
        System.out.println(person.getAge());

        var person2 = new Person("Felipe", 18);
        person2.sayHello();

    }
}


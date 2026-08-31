package basic.c08_oop;

public class Person {

    //Atributos

    String name;
    int age;

    // Constructor
    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    //Metodos

    public void sayHello(){
        System.out.println("Hello i am " + name + " i am " + age +"years old");
    }

}


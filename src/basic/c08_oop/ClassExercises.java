package basic.c08_oop;

import java.util.ArrayList;

public class ClassExercises {
    public static void main(String[] args) {
        // crear clase Book con atributos y mostrarlos y crar el constructor
        var book = new Book("Mil Años de soledad ", "Grabiel Gracia marquez");
        book.getTittle();

        //Crear una clase Dog y un metodo que imprime su sonido
        var dog = new Dog("ladrido vea");
        dog.getbark();

        //Clase car y sus atributos

        //Clase Student con atributo score y metodo que diga si aprobo (>= 60)
        var student = new Student(61);
        student.getScore();

        // Clase backAccount con atributos balance y metodo deposit() que sume el saldo
        var backAccount = new BackAccount(67);
        backAccount.deposit(35.2);

        // Clase rectangle con metodos para calcular el area y perimetro
        var rectangle = new Rectangle(5, 5);
        rectangle.calculateArea();
        rectangle.calculatePerimeter();

        // Clase Worker que reciba nombre y salario y un metodo para mostrar salario
        var worker = new Worker("miguel", 576.587);
        worker.showSalary();

        // Crear varios objetos person y guardarlos en un array list
        var person1 = new Person("Felipe", 18);
        var person2 = new Person("julian", 25);
        var person3 = new Person("Marian", 18);

        ArrayList<Person> listPeople = new ArrayList<>();
        listPeople.add(person1);
        listPeople.add(person2);
        listPeople.add(person3);

        for (Person p : listPeople){
            p.sayHello();
        }

        // Clase product y un metodo que aplica un descuento sobre su precio
        var product = new Product("milk", 5000);
        product.getDiscount(0.10);

    }
}

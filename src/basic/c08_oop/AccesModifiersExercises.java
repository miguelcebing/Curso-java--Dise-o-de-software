package basic.c08_oop;

import basic.c08_test_oop.*;

public class AccesModifiersExercises {
    public static void main(String[] args) {
        //Crear clase person y hacer privados atributos name y age y usar metodos getName, setName, getAge, setAge pa asignar los valores y mostrarlos en otra clase
        var person = new PersonForExercise(19, "Miguel");
        System.out.println("hello my name is" + person.getName() + "and I'm "+ person.getAge() + " years old");

        // Crear clase producto con atributo privado price y añadir el metodo setPrice(double price) que solo permita precios mayores a cero
        var product = new ProductExercise(-145);
        System.out.println( "The price product is "+product.getPrice());

        //Crear clase BanckAccount con el atributo privado balance e implementar metodos deposit(double amount) y withdraw( double amount) que validen las cantidades correctamente
        var banckAccount = new BankAccountExercise(58);
        System.out.println("se agrego money in the account" + banckAccount.deposit(159));
        System.out.println("the money in the account is " + banckAccount.withdraw(122));

        // Crear clase libro con atributo privado tittle se va a poder leerlo atraves de un getTittle() pero no modificarlo (sin settittle)
        var book = new BookExercise("las mentiras de tu ex");
        System.out.println("The book is " + book.getTitle());

        // Crear clase Temperature con atributo  privado celsius con metodo getcelsius(double celsius) y solo acepta valores entre -100 y 100
        var temperature = new TemperatureExercise(30);
        System.out.println("the temperature is " + temperature.getCelsius(156));

        //Clase user con atributos privados username y password implementa los metodos setUserName(string userName), setPassword (String Password)
        var user = new  UserExercise("MiguelitoKawaiUWU","123");
        user.SetUserName("MiguelitoKawaiUWU");
        user.SetPassword("123");
        System.out.println("The checkPassword result is: "+ user.checkPassword("123"));

        //Clase employee con atributo privado salary con metodo raiseSalary(double percent) que solo permita aumentos positivos
        var employee = new EmployeeExercise(22);
        employee.raiseSalary(50);
        System.out.println(employee.getSalary());

        //Clase rectangle con atributos privados width, height, agregar setters que calcule el area
        var rectangle = new RentangleExercises(2,5);
        System.out.println("the area of rectangle is "+ rectangle.calculateArea());

        // Clase student con atributo priv grade, con metodos como setGrade e isPassed() que retorna true si la nota es >= 60
        var student = new StudentExercises(66);
        System.out.println(student.isPassed());

        //Clase car con atributo priv speed con metodos accelerate(int amount) y que aumente la velocidad (maximo 180) y brake (int amount) y reduzca ña velocidad (minimo 0)
        var car = new CarExercise(181);
        car.accelerate(182);
        car.brake(50);
        System.out.println(car.getSpeed());






    }
}

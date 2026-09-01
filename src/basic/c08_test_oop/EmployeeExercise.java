package basic.c08_test_oop;

public class EmployeeExercise {
    //Atributos
    double salary;

    //Constructor
    public EmployeeExercise(double salary) {
        this.salary = salary;
    }

    //Metodos

    public void raiseSalary(double percent) {
        if (percent >= 0) {
            this.salary += (this.salary * percent / 100);
        } else {
            System.out.println("Salary is incompatible percent");
        }
    }

    public double getSalary() {
        return this.salary;
    }
}






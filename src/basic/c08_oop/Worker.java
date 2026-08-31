package basic.c08_oop;

public class Worker {
    //Atributos
     String name;
     double salary;

     // Constructor
     public Worker(String name,double salary){
         this.name=name;
         this.salary=salary;
     }

     // Metodos

    public double showSalary(){
         System.out.println("Salary is: " + salary);
        return salary;
    }


}

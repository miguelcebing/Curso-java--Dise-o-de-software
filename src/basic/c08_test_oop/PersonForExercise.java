package basic.c08_test_oop;

public class PersonForExercise {
    //atributos
    private int age;
    private String name;

    //Constructor
    public PersonForExercise(int age, String name) {
        this.age = age;
        this.name = name;

    }

    // Metodo
    public void sayHello() {
    System.out.println("Hello my name is " + name +"and my  I'm " + age +  "years old");
    }

    //getter
    public  int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    // setters
    public void setAge(int age){
        if (age > 0){
            this.age = age;
        }else{
            System.out.println("Age can't valide");
        }
    }
    public void setName(String name) {
        this.name = name;
    }

}

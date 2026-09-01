package basic.c08_oop;

public class Person {

    //Atributos

    public String name;
    private int age;
    final private String id;

    // Constructor
    public Person(String name, int age){
        this.name = name;
        this.setAge(age);
        this.id = name;

    }

    //Metodos

    public void sayHello(){
        System.out.println("Hello i am " + name + " i am " + age +"years old" + "ang my id is" + id);
    }

    // ejemplo de un Getter
    public int getAge(){
        return age;
    }

    public String getId(){
        return id;
    }

    // Ejemplo de un setter
    public void setAge(int age){
        if (age > 0){
            this.age = age;
        }else{
            System.out.println("Age can't valide");
        }
    }


}


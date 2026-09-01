package basic.c08_oop;

public class PersonForExercise {
    public static void main(String[] args) {
        var student = new Student1();
        student.name = "miguel";
        student.age = 18;
        student.study2();
    }

    public static class Person1 {
        String name;
        int age;



    }
    public static class Student1 extends Person1 {
        String grade;

        public void study2(){
            System.out.println("Maldita Carrera me estas matando ");
        }

    }
}

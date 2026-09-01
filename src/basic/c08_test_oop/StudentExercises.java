package basic.c08_test_oop;

public class StudentExercises {
    //Atributos
    double grade;

    //Constructor
    public StudentExercises(double grade) {
        this.grade = grade;
    }

    //Metodos

    public void setGrade(double grade) {
        this.grade = grade;
    }

    public boolean isPassed() {
        if (this.grade >= 60) {
            System.out.println("the student pass");
            return true;
        } else {
            System.out.println("the student not pass");
        }
        return false;
    }
}

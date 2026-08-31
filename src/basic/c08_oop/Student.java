package basic.c08_oop;

public class Student {
    //atributos
    double score;

    //Contructor
    public  Student(double score) {
        this.score = score;
    }

    //Metodo
    public   void getScore() {
        if (score >=60){
            System.out.println("The student aprrobe the curse ");

        }
        else {
            System.out.println("The student  not aprrobe the curse ");

        }

    }
}

package basic.c08_oop;

public class Book {

    // Atributos
    String tittle;
    String author;

    //Constructor
    public Book(String tittle, String author) {
        this.tittle = tittle;
        this.author = author;
    }

    //metodo

    public void getTittle() {System.out.println("The title is: " + this.tittle + "And the author is: " + this.author);
    }
}

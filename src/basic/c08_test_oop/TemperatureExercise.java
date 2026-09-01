package basic.c08_test_oop;

public class TemperatureExercise {
    //Atributos
    private double celsius;

    // Constructor
    public TemperatureExercise(double celsius) {
        this.getCelsius(celsius);
    }
    //metodos
    public double getCelsius(double celsius) {
        if (celsius >= -100 && celsius <= 100) {
            this.celsius = celsius; // Si está en rango, lo guarda
        } else {
            System.out.println("The celsius is out of range");
        }
        return celsius;
    }



}

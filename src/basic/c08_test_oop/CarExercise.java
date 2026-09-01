package basic.c08_test_oop;

public class CarExercise {
    private int speed;

    // Constructor
    public CarExercise(int speed) {
        this.speed = speed;
    }

    //metodos
    public void accelerate(int amount) {
        this.speed += amount;
        if (this.speed > 180) {
            this.speed = 180; // Si se pasa de 180, lo dejamos estancado en el tope
        }
    }

    // Metodo para frenar / reducir velocidad
    public void brake(int amount) {
        this.speed -= amount;
        if (this.speed < 0) {
            this.speed = 0; // Si baja de 0, lo frenamos por completo en 0
        }
    }

    // Un getter rápido por si necesitas imprimir la velocidad después
    public int getSpeed() {
        return this.speed;
    }

}

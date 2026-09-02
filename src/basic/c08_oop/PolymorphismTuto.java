package basic.c08_oop;

public class PolymorphismTuto {
    public static void main(String[] args) {

        // polimorfismo

        // - polimorfismo por herencia (Sobrescritura)

        var animal = new Animal();
        animal.sound();

        var dog = new Dog();
        dog.sound();

        //polimorfismo por sobrecarga()
        var calculate = new Calculator();
        calculate.sum(3,5);
        calculate.sum(3.4,5.2);

    }
    // polimorfismo por herencia (sobreesctirura)
    public static class Animal {

        public void sound(){
            System.out.println("Animal sound");
        }

    }
    public static class Dog extends Animal {
        @Override
        public void sound() {
            System.out.println("guaf ");
        }
    }
    // Polimorfismo poe sobrecarga (sobrecarga de metodos )

    public static class Calculator {
        public int sum(int a, int b){
            return a+b;
        }

        public int sum(int a, int b, int c){
            return a+b+c;
        }

        public double sum(double a, double b){
            return a+b;
        }
    }

}


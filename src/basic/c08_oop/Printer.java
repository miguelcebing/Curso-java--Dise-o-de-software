package basic.c08_oop;


public class Printer {
    public static void main(String[] args) {
        var printer = new PrinterExercise();
        printer.print(6);
        printer.print("Carechimbas todos");

    }

        public static class PrinterExercise{
            public String print(String a){
                return "Printing " + a;
            }

            public double print(double a){
                return  a;
            }

            public int print (int a){
                return  a;
            }
        }


}

package basic.c02_JavaHome;

public class OperationsExercises {
    public static void main(String[] args) {
        // variable con cada operacion aritmetica
        var a = 2 + 2;
        System.out.println(a);

        var b = 2 - 2;
        System.out.println(b);

        var c = 2 * 2;
        System.out.println(c);

        var d = 2 / 2;
        System.out.println(d);

        var e = 2 % 2;
        System.out.println(e);

        // variable cada tipo de asignacion

        int number = 10;

        number = 5;
        System.out.println(number);

        number += 6;
        System.out.println(number);

        number -= 6;
        System.out.println(number);

        number *= 2;
        System.out.println(number);

        number /= 2;
        System.out.println(number);

        number %= 2;
        System.out.println(number);

        // impresion de 3 comparaciones verdaderas

        System.out.println(3 == 3);

        System.out.println(3 * 4 > 6);

        System.out.println(2 * 2 < 6);

        // Impresion de 3 comparciones falsas

        System.out.println(2 / 2 > 6);
        System.out.println(2 % 2 != 0);
        System.out.println(2 / 2 == 0);

        // operador logico and

        System.out.println(5>0 && 10>6);

        // operador logico or

        System.out.println(25>5 || 3<1);

        // combinarlos
        System.out.println((5 > 3 && 2 > 4) || (10 == 10));

        // una negacion
        System.out.println(!(5>2));

        // Impresion 3 ejercicios de unitarios

        int x = 5;
        x++;
        System.out.println(x);
        x--;
        System.out.println(x);
        ++x;
        System.out.println(x);

        // Combinar operadores aritmeticos, comparacion y logicos

        System.out.println ((5+6)>=(5+1) && (5<10) );



    }
}

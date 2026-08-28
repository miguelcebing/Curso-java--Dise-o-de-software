package basic.c7_funtions;

import java.util.ArrayList;
import java.util.Arrays;

public class FuntionsExercises {
    public static void main(String[] args) {

        // funcion que imprime te doy la bienvenida a el curso de java desde 0
        printGreeting();

        // funcion que reciba un nombre como parametro y salude a la persona
        printGreetingToPerson("miguel");

        // Funcion que recibe 2 numeros enteros y devuelva su resta
        operation(10,2);

        // Funcion que calcule el cuadrado de un numero (n+n)
        numbersquared(5);

        // funcion que reciba un numero y diga si es par o impar
        numberParOrImpar(3);

        // funcion que reciba una edad y retorne si es mayor de edad = true y false en caso de lo contrario
        thePersonIsAdult(22);

        // Funcion que recibe una cadena y dice su longitud
        stringLength("mami tiene hambre uwu");

        //metodo que recibe un array de enteros que calcula su media y lo retorna
        int numAvarege[] = {1,2,3};
        numberAvarege( numAvarege);

        // metodo que reciba un numero y retorna su factorial
        numberFactorial(5);

        // FUncion que reciba un Arraylist y lo recorra mostrando cada elemento
        var users = new ArrayList<>(Arrays.asList("miguel@gmail.com","raulito@gmail.com","hachi@gmail.com"));
        browseList(users);


    }

    public static void printGreeting(){
        System.out.println("welcome to java curse from zero");
    }

    public static void printGreetingToPerson(String name){
        System.out.println("welcome to java curse from "+name);
    }
    public static int operation(int a, int b){
        System.out.println ("the result is" + (a-b));
    return a-b;
    }
    public static int numbersquared(int a){
        System.out.println ("the result is"+(a*a));
        return a*a;
    }
    public static boolean numberParOrImpar( int a){
        if (a%2==0){
            System.out.println ("the number is par");
            return true;
        }
        else {
        System.out.println ("the number is impar");
                return false;}

    }
    public static boolean thePersonIsAdult(int a){
        if (a>= 18){
            System.out.println("the person is adult ");
            return true;
        }
        else {
            System.out.println("The person is not adult");
            return false;
        }
    }
    public static String stringLength(String str){
        System.out.println("the string length is"+str.length());
        return str;
    }
    public static double numberAvarege(int [] numAvareg) {
        double suma = 0;

        for (int n: numAvareg){
            suma += n;
        }
        System.out.println("The Avatege is "+ (suma/numAvareg.length));
        return suma/numAvareg.length;
    }
    public static int numberFactorial(int number){
        int number2 = 1;
        for (int i = 1; i <= number; i++){
            number2 *= i;
        }
        System.out.println("The factorial is "+number2);
        return number2;
    }
    public static void browseList(ArrayList<String> list){
        for (String users:list){
            System.out.println(users);
        }
    }



}



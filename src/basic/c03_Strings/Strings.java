package basic.c03_Strings;

import java.util.Locale;

public class Strings {

    public static void main(String[] args) {

        //Cadenas de texto

        String name = "miguel";
        var surname = new String ("elip");

        // operaciones basicas

        //concatenaciones
        System.out.println (name + " "+surname);

        //length/ longitud
        System.out.println (name.length());

        //charAt / obtener caracter
        System.out.println (name.charAt(name.length()-1));

        //Substring / una subcadena
        System.out.println (name.substring(2));
        System.out.println (name.substring(0,2));

        // Mayusculas y minisculas

        System.out.println (name.toUpperCase());
        System.out.println (name.toLowerCase());

        System.out.println (name);

        // comprobar si tiene algo

        System.out.println ("hello, java".contains("lo"));

        System.out.println ("hello, java".toUpperCase().contains("lo"));

        // Comparacion
        System.out.println (name.equals("miguel"));

        System.out.println (name.equalsIgnoreCase("MIguel"));

        // == vs equals

        var a = "miguel";
        var b = "miguel";
        var c = new String("miguel");

        System.out.println (a == c);
        System.out.println (a == b);

        System.out.println(a.equals(b));

        // trim
        System.out.println("  Hello,  My name is miguel  ".trim());
        System.out.println ("  Hello,  My name is miguel  ");

        // Replace / reemplazar
        System.out.println("  Hello,  My name is miguel  ".replace("miguel","Felip"));

        //format
        var age= 18;
        System.out.println(String.format("Hello. %s, i am  %d  ",name, age));



    }
}

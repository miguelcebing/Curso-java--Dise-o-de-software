package basic.c5_structures;

import java.util.HashSet;

public class Set {
    public static void main (String[] args){

        //Declaracion y creacion
        HashSet<String> names = new HashSet<String>();
        var numbers = new HashSet<Integer>();

        // Tamaño

        System.out.println(names.size());

        //Añadir elementos

        names.add("miguel");
        names.add("Felip");
        names.add("Rafael");
        names.add ("Bayoleth");
        System.out.println(names.size());

        numbers.add(1);
        numbers.add(2);
        numbers.add(3);

        //Eliminar

        names.remove("miguel");
        System.out.println(names.size());

        //Acceder a los elementos
        /* Chavalin pues no se puede pq no hay orden
         lo mismo pasa para modificarlos*/

        //Buscar elementos
        System.out.println(names.contains("miguel"));
        System.out.println(names.contains("Bayoleth"));

        System.out.println(names);
        names.add("miguel");
        names.add("miguel");
        names.add("miguel");
        System.out.println(names);

        // Trabajo por conjuntos

        //names.addAll(numbers); Error por incompatibilidad de datos

        var countries = new HashSet<String>();
        countries.add("Spain");
        countries.add("Mexico");
        countries.add("Argentina");

        names.addAll(countries);
        System.out.println(names);

        names.removeAll(countries);
        System.out.println(names);

        names.retainAll(countries);
        System.out.println(names);


    }
}

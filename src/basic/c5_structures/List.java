package basic.c5_structures;

import java.util.ArrayList;

public class List {

    public static void  main (String [] args){

        // Declaracion y creacion
        ArrayList<String> names = new ArrayList<>();
        var number = new ArrayList<Integer>();

        //tamaño
        System.out.println(names.size());

        // añadir elemento

        names.add("miguel");
        names.add("Felip");
        names.add("Rafael");
        System.out.println(names.size());


        // Acceder a los elementos

        System.out.println(names.getFirst());
        System.out.println(names.get(1));
        System.out.println(names.getLast());

        //Modificar
        names.set(2, "rafaelito");
        System.out.println(names.getLast());

        //Eliminar

        names.remove(2);
        //System.out.println(names.get(2)); seria un error, pues el 2 ya no existe

        //Buscar elementos

        System.out.println(names.contains("miguel"));

        // Limpiar Arrayslit
        names.add("miguelino");
        System.out.println(names);
        names.clear();
        System.out.println(names.size());








    }
}

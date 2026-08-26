package basic.c5_structures;

import java.util.HashMap;
import java.util.HashSet;

public class Map {
    public static void main(String[] args) {

        //Declaracion y creacion
        HashMap<String,String> names = new HashMap<>();
        var numbers = new HashMap<Integer,String>();

        //tamaño
        System.out.println(names.size());

        //Añadir elemento

        names.put("miguel","miguelgmail.com");
        names.put("Felip","Felipgmail.com");
        names.put("rafael","rafaelgmail.com");
        System.out.println(names.size());
        System.out.println(names);

        // Acceder a los elementos
        names.get("miguel");
        System.out.println(names.get("miguel"));
        System.out.println(names.get("rafae"));// acceder a clase que no esta dentro = null


        // Verificar elementos

        System.out.println(names.containsKey("miguel"));
        System.out.println(names.containsKey("Felip"));

        System.out.println(names.containsValue("rafaelgmail.com"));

        //Eliminar elementos
        System.out.println(names.remove("miguel"));
        System.out.println(names.remove("Felip"));
        System.out.println(names);

        //Limpiar el Hashmap
        names.clear();
        System.out.println(names);

        //modificacion de elementos
        names.put("rafael","rafaelgmail.com");
        System.out.println(names);

        names.put("rafael","rafael1gmal.com");

        names.put("Felip","Felipgmail.com");
        System.out.println(names);

        names.replace("Felip","Felip1gmail.com"); // Reemplaza el valor si existe
        System.out.println(names);

        names.putIfAbsent("miguel","miguelgmail.com"); // Reemplaza el valor si existe
        System.out.println(names);

        //otras operaciones

        System.out.println(names.isEmpty());
        var values = names.values();
        System.out.println(values);

















    }
}

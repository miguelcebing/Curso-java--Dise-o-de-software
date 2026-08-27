package basic.c5_structures;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Structuresexercises {
    public static void main(String[] args) {

        // Crear un Array con 5 valores e imprimir la longitud

        String  [] arrays = {"Miguel", "Felip", "Felipe", "Raulito","Ruben"};
        System.out.println(arrays.length);

        // modificar un elemento del Array e imprimir el indice antes y despues
        System.out.println(arrays[0]);
        System.out.println(arrays[1]);
        System.out.println(arrays[2]);
        System.out.println(arrays[3]);
        System.out.println(arrays[4]);

        arrays[4] = "Bayoleth";
        arrays [0] = "Tomasito";
        arrays [2] = "Jose";
        System.out.println(arrays[0]);
        System.out.println(arrays[1]);
        System.out.println(arrays[2]);
        System.out.println(arrays[3]);
        System.out.println(arrays[4]);

        //Crear un array list vacio
        var list = new ArrayList<Integer>();
        System.out.println(list.size());

        // Agregar 4 valores al list y eliminar uno
        list.add(01);
        list.add(02);
        list.add(03);
        list.add(04);
        System.out.println(list.size());
        System.out.println(list);

        list.remove(3);
        System.out.println(list.size());
        System.out.println(list);

        // Crear un hashset con 2 valores diferentes
        HashSet<String> set = new HashSet<String>();
        System.out.println(set.size());
        set.add("Miguel");
        set.add("Felipe");
        System.out.println(set.size());
        System.out.println(set);

        //Agregar al Hashset un valor repetido y valor no repetido
        set.add("Raulito");
        set.add("Miguel");
        System.out.println(set.size());
        System.out.println(set);

        //eliminar los elemtos del Hashset
        set.remove("Miguel");
        System.out.println(set);

        // Crear un Hashmap donde clave = nombre y valor = numero de telefono
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        map.put("miguel", 3344);
        map.put("Felipe", 5566);
        map.put("Raulito", 6767);
        System.out.println(map.size());
        System.out.println(map);

        // modificar un contacto y eliminar otro

        map.replace("miguel", 9988);
        System.out.println(map);

        map.remove("Raulito");
        System.out.println(map);

        // Dado el Array transformarlo a Arraylist a continuacion a un Hashset y finalmente a un Hashmap con clave y valores iguales
        String[] arrayUltimate = {"sandro","sandra","miguel"};

        ArrayList<String> listUltimate = new ArrayList<>(Arrays.asList(arrayUltimate));
        System.out.println(listUltimate);

        HashSet<String> setUltimate = new HashSet<>(listUltimate);
        System.out.println(setUltimate);

        HashMap<String, String> mapUltimate = new HashMap<>();
        for (String element : setUltimate) {
            mapUltimate.put(element, element);
        }
        System.out.println(mapUltimate);


    }
}

package basic.c06_loops;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class LoopsExercises {
    public static void main(String[] args) {
        // imprimir numeros del 1 al 10 usando while
        int number = 1;
        while (number <=10){
            System.out.println(number);
            number++;

        }
        // usar do while pa mostrar los valores de un Array

        String array [] = {"corazon", "de", "melon"};
        var i = 0;
        do {
            System.out.println(array[i]);
            i ++;

        } while (i < array.length);

        // multiplos de 5 de 1 al 50 con for

        for ( int number1 = 5; number1 <= 50; number1 += 5){
            System.out.println(number1);
        }

        // Recorrer un array de 5 numeros e imprimir la suma total
        Integer digito [] = {1,2,3,4,5};
        int sum = 0;
        for (Integer numbe:digito){
            sum += numbe;
        }
        System.out.println(sum);

        // usar for que recorra un array y mostrar sus valores
        String array2 []={"papa", "Dio", "Ayuda"};
        for (int o = 0;o < array2.length; o++){
            System.out.println(array2[o]);
        }

        // usar for each pa recorrer un haspmap y hashset

        HashSet<Integer> set = new HashSet<>(); // con el set

        set.add(1);
        set.add(2);
        set.add(3);

        for (Integer numbe:set){
            System.out.println(numbe);

        }

        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(10,20);
        map.put(40,30);

        for(Map.Entry<Integer, Integer> entry:map.entrySet()) {
            System.out.println(entry.getValue());
            System.out.println(entry.getKey());
        }

        // Imprimir del 10 al 1 con for

        for (int b = 10;b >= 1; b --){
            System.out.println(b);

        }
        // usar continue para saltar los multiplos del 3 del 1 al 20

        for (int x = 1;x <= 20; x++){
            if(x % 3== 0 ) {
                continue;
            }
            System.out.println(x);

        }

        // usar break para detener un bucle al encontrar un numero negativo en un arrive

        Integer valores [] = {1,2,3,-1,6,8,9,10};
        for  (Integer numerito:valores){
            if(numerito <0){
                break;
            }
            System.out.println(numerito);
        }

        // programa que calcule el factorial de un numero dado

        int fucknum = 5;
        int crassyresult = 1;

        for (int e = 1;e<=fucknum;e++){
            crassyresult *= e;
        }
        System.out.println(" the factorial crassy number is" + crassyresult);
    }


}

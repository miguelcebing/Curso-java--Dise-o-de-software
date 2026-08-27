package basic.c06_loops;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Loops {
    public static void main(String[] args) {

        //Loops

         // - for

        for (int index = 0;index< 5; index ++){
            System.out.println("Hello World");
        }

        String [] names = {"miguel", "Samuel","javier"};
        for (int index = 0;index< names.length; index ++){
            System.out.println(names[index]);
        }

        // for-each, recorrer asi la list o el Arrays
        for (String name: names ){
            System.out.println(name);
        }

        HashSet <Integer> numbers = new HashSet<>(); // con el set

        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        for (Integer number:numbers){
            System.out.println(number);
        }

        HashMap <String,String> emails = new HashMap<>();
        emails.put("miiguel", "miguelgmail.com");
        emails.put("javier", "javiergmail.com");
        emails.put("samuel", "samuelgmail.com");

        for (Map.Entry <String, String >email: emails.entrySet()){
            System.out.println(email.getValue());
            System.out.println(email.getKey());

        }

        // - while
        int index = 0;
        while(index < 5){
            System.out.println("Hello World");
            index ++;

        }
        index = 0;
        while(index < names.length){
            System.out.println(names[index]);
            index ++;
        }

        index = 0;
        boolean find = false;
        while(!find){
            System.out.println(names[index]);
            if(names[index].equals("javier")){
            find = true;
            }
            index +=2;
        }

        // -do -while
        index = 0;
        do{
            System.out.println("Hello word");
            index ++;
        } while (index < 0);

        // control de bucles

        //-break

        for ( String name: names){
            if ( name.equals("javier")) {
                break;
            }
            System.out.println(name);

        }

        // - Continue

        for (int i = 0;i< 5; i ++){
            if(i== 3){
                continue;
            }
            System.out.println("Hello World");
        }





    }
}

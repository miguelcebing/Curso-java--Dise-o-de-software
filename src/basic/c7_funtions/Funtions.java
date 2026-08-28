package basic.c7_funtions;

import java.util.ArrayList;
import java.util.Arrays;

public class Funtions {
    public static void main(String[] args) {

        //Funciones

        for (int index = 0; index < 5; index++) {
            sendEmail();
        }

        sendEmail();
        sendEmailToUser("miguel.gmail.com");
        sendEmailToUser("javiergamail.com", "javier");

        var users = new ArrayList<>(Arrays.asList("miguel@gmail.com","raulito@gmail.com","hachi@gmail.com"));
        sendEmailToUser(users);

        var state = sendEmailWithState("miguel@gmail.com");
        System.out.println(state);

        System.out.println(sendEmailWithState(""));
    }


         // funcion sin parametros y retornos

    public  static void sendEmail(){
        System.out.println("se envia el emailll");

    }

    // funcion con parametros

    public  static void sendEmailToUser(String email){
        System.out.println("se envia el emailll a" + email);
    }

    // sobrecarga de funciones

    public  static void sendEmailToUser(String email, String name ){
        System.out.println("se envia el emailll a " + name +"(" +email);
    }

    public  static void sendEmailToUser(ArrayList<String> emails){
        for (String email : emails){
            sendEmailToUser(email);
        }
    }
    // funciones con retorno
    public  static boolean sendEmailWithState(String email){
        if (email.isEmpty()){
            return false;
        }
        System.out.println("se envia el email a " + email);
        return true;
    }

}

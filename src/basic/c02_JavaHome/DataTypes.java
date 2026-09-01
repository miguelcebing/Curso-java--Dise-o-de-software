package basic.c02_JavaHome;

public class DataTypes  {
    public static void main(String[] args) {

        //Tipos de datos que hay ( los primitivos)

        int myInt = 18;
        System.out.println(myInt);

        double myDouble = 28.5;
        System.out.println(myDouble);
        // float, long, byte tambien pueden ser usados en estos numeros

        char myChar = 'a';
        System.out.println(myChar);

        boolean myBoolean = true;
        myBoolean = false;
        System.out.println(myBoolean);

        // El string es una clase no dato primitivo
        String myString = "Hello java ";
        System.out.println(myString);

        // tipos de dato en complilacion, en clase

        System.out.println(myString.getClass().getSimpleName());
        /* los tipos de datos primitivos tienen su equivalente
        * en clases, pero pa saber su tipo de datos podemos usar
        * getclas*/


    }
}

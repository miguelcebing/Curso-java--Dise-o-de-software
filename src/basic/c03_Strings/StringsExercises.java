package basic.c03_Strings;
    public class StringsExercises {
        public static void main(String[] args) {
            // concatenacion
            var citty = "paris";
            var country = "France";

            System.out.println(citty + " " + country);

            //longitud
            System.out.println(citty.length());

            // primer y ultimo caracter de la cadena

            System.out.println("Hello this is my activity in the curse of java ".charAt(0));
            System.out.println(citty.charAt(citty.length()-1));

            // mayus y minus de un string
            System.out.println(citty.toLowerCase());
            System.out.println(citty.toUpperCase());

            //comprobar si hay una palabra en mi cadena de texto
            System.out.println("Stheban sometimes is gay but is my friend ".contains("gay"));

            // formatear un string con un entero

            int date = 2018;
            System.out.println(String.format("%s win the world cup in %d",country,date));

            // eliminar espacios inicio y final jejej
            System.out.println("   My friends group is so funny    ".trim());

            // sustituir espacios en blanco por guion
            System.out.println("The college is so important for the life".replace(" ","-"));

            // strings iguales
            System.out.println(citty.equals(country));

            // 2 strings misma longitud

            System.out.println(citty.length() == country.length());

            // end :D




    }
}

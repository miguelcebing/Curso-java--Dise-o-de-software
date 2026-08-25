package basic.c5_structures;
public class Arrays {
    public static void main(String[] args) {
        // Array  declaracion y creacion
        int[] numbers = new int[3];
        System.out.println(numbers);
        {

            String[] names = {"miguel", "sara", "filip"};

            //acceso

            System.out.println(numbers[0]);
            System.out.println(names[0]);

            System.out.println((new String [3])[0]);

            //modificar datos
            numbers [0] = 1;
            numbers [1] = 10;

            System.out.println(numbers[0]);
            System.out.println(names[1]);

            //numbers[3] = 2; error

            System.out.println(names[2]);
            names [2] = "miguel.ceballosraa ";
            System.out.println(names[2]);

            System.out.println(names.length);
            names[2] = null;
            System.out.println(names[2]);
            System.out.println(names.length);

            //numbers[2] = null; error

            boolean [] booleans = new boolean[5];
            System.out.println(booleans[4]);








        }
    }
}

package basic.c04_conditionals;
class ConditionalsExercises {
      public static void main(String[] args) {
       // edad de un usuario y si puede votar
       var age = 22;

       if(age>=18){
        System.out.println("The user can vote.");
       }
       else{
        System.out.println("The user can't vote.");
       }

       //declarar 2 numeros y decir si son iguales o cual es mayor

       var number1 = 10;
       var number2 = 20;

       if(number1 == number2){
        System.out.println("the numbers are the same");
       }
       else if (number1 > number2){
        System.out.println("the numbers are not the same, and number1 is greater than number2");
       }
       else{
        System.out.println("the numbers are not the same, and number2 is greater than number1");
       }

       //dado un numero verificar si es positivo, negativo o cero

       var num = 0;

       if (num>0){
        System.out.println("the number is positive");
       }
       else if (num<0){
        System.out.println("the number is negative");
       }
       else{
        System.out.println("the number is zero");
       }

       // programa que dice si es par o impar
       var programnum = 426;
       if (programnum % 2 == 0) {
        System.out.println("the program number is pair");
       }else{
         System.out.println("the program number is odd");
        }
       //verificar si un numero esta entre 1-100

       var programnum2 = 10;
       if (programnum2>=1 && programnum2 <= 100) {
        System.out.println("the number is in the  1-100 range");
       }
       else{
        System.out.println("the number is out the  1-100 range");
       }

       // una variable con el dia de la semana (1-7) con switch
       var day = 5;
       switch (day) {
        case 1:
         System.out.println("Monday");
         break;
        case 2:
         System.out.println("Tuesday");
         break;
        case 3:
         System.out.println("wednesday");
         break;
        case 4:
         System.out.println("thursday");
         break;
        case 5:
         System.out.println("friday");
         break;
        case 6:
         System.out.println("saturday");
         break;
        case 7:
         System.out.println("sunday");
         break;
        default:
         System.out.println("That number is not a week day ");
       }

       // sistema de notas de 0-100
       var note = 80;
       if (note>=0 && note<= 60) {
        System.out.println("you has failed the course");
       }
        else if (note > 60 && note <= 90) {
         System.out.println("you has approve the course");
       }
        else if (note >90 && note <= 100) {
         System.out.println("you has approve and excel the course");
       }

       // programa que determine si puedo entrar al cine, al menos 15 años o ir acompañado

       var userAge = 10;
        boolean isAccompanied = false;

        if (userAge>= 15 || isAccompanied){
         System.out.println("you can go into the cinema");
        }
        else {
         System.out.println("you can't go into the cinema");
        }

        // programa que diga si es vocal o consonante

       char letter ='c';
        if (letter=='a'|| letter=='e'||letter=='i'|| letter=='o'|| letter=='u'){
         System.out.println("This letter is a vocal");
       }
        else {
         System.out.println("This letter is a consonant");
       }

        // a,b y c y mostrar cual es mayor de las 3
       var a = 15;
        var b = 20;
        var c = 25;

        if (a>b && a>c){
         System.out.println("a is  the largest");
        }
        else if (b>a && b>c){
         System.out.println("b is  the largest");
        }
        else if (c>a && c>b){
         System.out.println("c is  the largest");
        }

       }
      }


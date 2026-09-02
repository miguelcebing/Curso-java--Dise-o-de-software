package basic.c08_oop;

public class CharacterFinalExercise {
    public static void main(String[] args) {
        Character[] characters = {
          new Warrior(),
                new Mage(),
                new Archer()
        };

        for (Character c : characters) {
            c.attack();
        }

    }
    public static class Character {
        public void attack(){
            System.out.println("The increible warner attack ");

        }
    }
    public static class Warrior extends Character {
        @Override
        public void attack() {
            System.out.println("Ataca con la espadita vea ");
        }
    }

    public static class Mage extends Character {
        @Override
        public void attack() {
            System.out.println("Ataca con la magia de la amistad vea ");
        }
    }

    public static class Archer extends Character {
        @Override
        public void attack() {
            System.out.println("Ataca con flechas proyectadas con las canciones de alvarito days ");
        }
    }
}


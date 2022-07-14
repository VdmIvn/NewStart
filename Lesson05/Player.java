package Lesson05;

public class Player {

    public static void doTest() {
        System.out.println("Hello!");
    }
    //поля класса
    String name;
    int hp = 100;
    int str;
    int coins;
    int score;
    int exp;
    Coordinates coordinates = new Coordinates();
    Weapon weapon = new Weapon();

    void moveUp() {
        coordinates.y -= 1;
        System.out.println(name + " move");
    }

    void moveRight() {
        coordinates.x += 1;
        System.out.println(name + " move right");
    }

    void decreaseHealth(int incomingDamage) {
        hp -= incomingDamage;
        System.out.println(name + " decrease self health on " + incomingDamage);
        System.out.println(name + " have health point is " + hp);
    }

    void attack() {
        System.out.println(name + " attack with " + str * 5);
    }

    void getNewLvl(int valueCoins, int valueScore) {
        coins += valueCoins;
        score += valueScore;
        exp += score * coins;
    }


    class Weapon {
        int attack;
        String type;

        void repairSelf() {
            System.out.println(type + " repair self");
        }
    }

}

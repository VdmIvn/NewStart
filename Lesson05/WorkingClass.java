package Lesson05;

import Lesson05.HomeWork.Employee;

public class WorkingClass {
    public static void main(String[] args) {


        /*Player player1 = new Player();
    player1.name = "Vadim";
    player1.hp = 250;
    player1.coordinates.x = 15;
    player1.coordinates.y = 12;

    player1.weapon.type = "Sword";
    player1.weapon.attack = 20;

        System.out.println("Player name " + player1.name);
        System.out.println("Player HP " + player1.hp);

        player1.moveRight();
        player1.moveUp();

        System.out.println("Player Coordinates: [" + player1.coordinates.x + "][" + player1.coordinates.y + "]");*/


        Employee [] employees = new Employee[5];

        employees[0] = new Employee("Vadim", "tester", "ivt@mail.ru", "114-23-56", 900, 32);
        employees[1] = new Employee("Yana", "petsitter", "kyana@tut.by", "132-14-08", 200, 26);
        employees[2] = new Employee("Petrova Olga Ivanovna", "administrator", "opetrova@gmail.com", "324-45-67", 1200, 45);
        employees[3] = new Employee("Ivanov Oleg Petrovich", "driver", "oivanov@yandex.ru", "566-45-78", 700, 50 );
        employees[4] = new Employee("Olgina Inna Andreevna", "seller", "innusik@gmail.com", "123-34-56", 500, 20);

        for(Employee test : employees) {
            if (test.getAge() > 40) {
                test.printInfo();
                System.out.println();
            }

        }




    }
}

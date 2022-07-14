package Lesson02;

public class HomeWork_2 {


    public static void main(String[] args) {

    }

    // 1 задание
    public static boolean checkSum(int a, int b) {
        int sum = a + b;
        boolean check;
        if (sum >= 10 && sum <= 20) {
            check = true;
        } else {
            check = false;
        }
        return check;
    }

    // 2 задание
    public static void checkNum(int num) {
        if (num < 0) {
            System.out.println("Your number is negative!");
        } else {
            System.out.println("Your number is positive!");
        }
    }

    // 3 задание
    public static boolean checkNumBool(int num) {
        boolean numType;
        if (num < 0) {
            numType = true;
        } else {
            numType = false;
        }
        return numType;
    }

    //  4 задание
    public static void printString(String print, int count) {
        for(int i = 0; i < count; i++) {
            System.out.println(print);
        }
    }

    // 5 задание
    public static boolean yearType(int year) {
        boolean yearType;
        if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            yearType = true;
        } else {
            yearType = false;
        }
        return yearType;
    }
}






package Lesson03;

import java.util.Arrays;

public class HomeWork_3<statiс> {


    public static void main(String[] args) {

        int[] array1 = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        System.out.println(Arrays.toString(changeArray(array1)));

        int[] array2 = new int[100];
        System.out.println(Arrays.toString(fillArray(array2)));

        int[] array3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};

        int[][] array4 = {{1, 2, 3}, {4, 3, 2}, {6, 5, 5}};
        fillArrayDiagonal(array4);


    }
    //  1 задание
        public static int[] changeArray(int[] array) {

            for (int i = 0; i < array.length; i++) {
                if(array[i] == 0) {
                    array[i]++;
                } else {
                    array[i]--;
                } }
                return array;
        }

    //  2 задание
    public static int[] fillArray(int[] array) {

        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }
        return array;
    }

    //  3 задание
    public static int[] multiplyArrayNum(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if(array[i] < 6) {
                array[i] = array[i] * 2;
            }
        }
        return array;
    }

    //  4 задание
    public static void fillArrayDiagonal(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; i++) {
                if (i == j) {
                    array[i][j] = 1;
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }


    //  5 задание
    public static int[] fillArray(int len, int initialValue) {
        int[] array = new int[len];
        for(int i = 0; i < array.length; i++) {
            array[i] = initialValue;
        }
        return array;
    }

    //  6 задание
    public static void findMinAndMaxFromArray(int[] array) {
        int min = 0;
        int max = 0;
        for (int i : array) {
            if(array[i] < min) {
                min = array[i];
            } else if (array[i] > max){
                max = array[i];
            }
        }
        System.out.println("Min value is: " + min + "\n" + "Max value is: " + max);
    }

            
        }




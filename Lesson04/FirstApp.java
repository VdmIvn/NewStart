package Lesson04;

import java.util.Random;
import java.util.Scanner;

public class FirstApp {

    public static Random random = new Random();
    public static Scanner scanner = new Scanner(System.in);

    public static char player = '@';
    public static char coin = '$';


    public static int playerHP = 100;
    public static int playerStr = 15;
    public static int playerCoins = 0;
    public static int playerScore = 0;
    public static int playerExp = 0;
    public static int playerX;
    public static int playerY;

    public static final int PLAYER_MOVE_UP = 8;
    public static final int PLAYER_MOVE_DOWN = 2;
    public static final int PLAYER_MOVE_RIGHT = 6;
    public static final int PLAYER_MOVE_LEFT = 4;

    public static int mapSizeMax = 7;
    public static int mapSizeMin = 3;
    public static char emptyCell = '_';

    public static char enemy = 'E';
    public static int enemyHP;
    public static int enemyStr;
    public static int enemyValueMin = 20;
    public static int enemiesCount;


    public static int mapHeight;
    public static int mapWidth;
    public static char[][] map;

    public static int gameLvl = 0;




    public static void main(String[] args) {

        String new = "for commit";


    createMap();
    createPlayer();
    spawnEnemies();
    printMap();
    movePlayer();



    }

        public static void createMap() {
            mapWidth = randomValue(mapSizeMin, mapSizeMax);
            mapHeight = randomValue(mapSizeMin, mapSizeMax);
            map = new char[mapHeight][mapWidth];
        }

        public static void printMap() {
            for (int y = 0; y < mapHeight; y++) {
                for (int x = 0; x < mapWidth; x++) {
                    System.out.print(map[y][x] + "|");
                }
                System.out.println();
            }

            for (int y = 0; y < mapHeight; y++) {
                for (int x = 0; x < mapWidth; x++) {
                    map[y][x] = emptyCell;
                }
            }
            System.out.println("mapWidth = " + mapWidth + " | mapHeight = " + mapHeight + " has been created");
        }

        public static void createPlayer() {
        playerX = randomValue(0, mapWidth - 1);
        playerY = randomValue(0, mapHeight - 1);
        map[playerY][playerX] = player;
            System.out.println("Player has been created in [" + (playerX + 1) + " : " + (playerY + 1) + "]");
        }

        public static void movePlayer() {
        int playerDestination;

            System.out.println("Enter your destination: " + "\n" + "UP(" + PLAYER_MOVE_UP + ")" + "\n"
                    + "DOWN(" + PLAYER_MOVE_DOWN + ")" + "\n"
                    + "RIGHT(" + PLAYER_MOVE_RIGHT + ")" + "\n"
                    + "LEFT(" + PLAYER_MOVE_LEFT + ")");
            playerDestination = scanner.nextInt();        }


        public static void spawnEnemies() {
        enemiesCount = (mapHeight + mapWidth) / 2;

        int enemyPosX;
        int enemyPosY;

        for(int i = 1; i <= enemiesCount; i++) {
            do {
                enemyPosY = random.nextInt(mapHeight);
                enemyPosX = random.nextInt(mapWidth);
            } while (isEmptyCell(enemyPosX, enemyPosY));
                map[enemyPosY][enemyPosX] = enemy;
            }
            System.out.println("Enemies have been created");
        }

        public static int randomValue(int min, int max) {
            return min + random.nextInt(max - min + 1);
        }

        public static boolean isPlayerAlive() {
        return playerHP < 0;
        }

        public static boolean isEmptyCell(int x, int y) {
                return map[y][x] == emptyCell;
        }
}
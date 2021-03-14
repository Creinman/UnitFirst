import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

class Main {
    public static final int SIZE = 3;
    public static void main(String[] args) {
        System.out.println("Programm started: \n");
        int[][] matrix = new int[SIZE][SIZE];
        Random random = new Random();
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                matrix[i][j] = random.nextInt(256);
            }
        }
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                System.out.format("%4d", matrix[i][j]);
            }
            System.out.println();
        }
        int[][] rotateMatrix = new int[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                rotateMatrix[i][j] = matrix[SIZE - 1 - j][i];
            }
        }
        System.out.println("rotateMatrix:");
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                System.out.format("%4d", rotateMatrix[i][j]);
            }
            System.out.println();
        }
    }
}

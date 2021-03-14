import java.util.*;
import org.unit.jupiter.api.Test;

import org.junit.Assert;
import static org.junit.Assert.*;


class TestMatrix {
    public static final int SIZE = 3;

    @org.junit.jupiter.api.Test
    public void testConcat_validArgument_success() {
        // given:
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
        // when:
        int[][] newRotateMatrix = new int[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                rotateMatrix[i][j] = matrix[SIZE - 1 - j][i];
            }
        }
        // then:
        Assertions.assertArrayEquals(newRotateMatrix, rotateMatrix);
    }
}

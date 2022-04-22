package week13;

import week13.multipleDimensionalArrays.PrintUtils;

public class Homework13 {

    public static int[][] triangle(int n) {

        int [][] p;
        p = new int[n + 1][];
        p[0] = new int[1];
        p[0][0] = 1;
        p[1] = new int[2];
        p[1][0] = 1;
        p[1][1] = 1;

        for (int row = 2; row <= n; row++) {
            p[row] = new int[row + 1];
            p[row][0] = 1;
            p[row][row] = 1;
            for (int col = 1; col < row; col++) {
                p[row][col] = p[row - 1][col] + p[row - 1][col - 1];
            }
        }
        return p;
    }

    public static void main(String[] args) {
        PrintUtils.printIntMatrix(triangle(5));
    }
}

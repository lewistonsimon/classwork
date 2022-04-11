package week13;

import shapes.Triangle;
import week13.multipleDimensionalArrays.PrintUtils;

public class Homework13 {

    public static int[][] Triangle(int n) {

        int [][] p;
        p = new int[n + 1][];
        p[0] = new int[1];
        p[0][0] = 1;
        p[1] = new int[2];
        p[1][0] = 1;
        p[1][1] = 1;

        for (int row = 2; p[row][0] == n; row++) {
            p[row][0] = 1;
            p[row][1] = p[row - 1][0] + p[1][1];
            p[row][p.length - 1] = 1;
            System.out.println(p);

        }



        for (int row = 0; row < p.length; row++) {
            for (int col = 0; col < p[row].length; col++) {
                System.out.print(p[row][col] + " ");
            }


        }

        return p;
}

    public static void main(String[] args) {

        PrintUtils.printIntMatrix(Triangle(5));
    }
}


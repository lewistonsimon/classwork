package week13;

import week13.multipleDimensionalArrays.PrintUtils;

public class TwoDimensionalArrays {

    public static int[][] problemOne() {
        int[][] theArray = new int[3][4];
        for (int count = 0; count <= 3; count++) {
            theArray[0][count] = count;
            for (int row = 1; row <=2; row++) {
                for (int col = 0; col <= 2; col++) {
                    theArray[row][col] = theArray[row - 1][col + 1] + 1;
                }
            }
        }
        System.out.println("The length is " + theArray.length);
        System.out.println("The length is " + theArray[2].length);
        return theArray;
    }

    public static void main(String[] args) {
        PrintUtils.printIntMatrix(problemOne());
    }
}


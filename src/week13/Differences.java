package week13;

import week13.multipleDimensionalArrays.PrintUtils;

public class Differences {

    public static int[][] successiveDifferences(int[] myArray) {
        int[][] newArray = new int[myArray.length][];
        newArray[0] = new int[myArray.length];
        for (int i = 0; i <= myArray.length - 1; i++) {
            newArray[0][i] = myArray[i];
        }

        for (int row = 1; row <= myArray.length - 1; row++) {
            newArray[row] = new int[newArray[0].length - row];
            for (int col = 0; col < myArray.length - row; col++) {
                newArray[row][col] = newArray[row - 1][col + 1] - newArray[row - 1][col];
            }
        }
        return newArray;
    }

    public static void main(String[] args) {
        int[] test = {2,9,28,65,126};
        PrintUtils.printIntMatrix(successiveDifferences(test));
    }
}


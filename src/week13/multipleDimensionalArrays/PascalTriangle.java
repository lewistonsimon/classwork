package week13.multipleDimensionalArrays;

public class PascalTriangle {

    public static int[][] pascalTri(int n) {

        int[][] triangle = new int[2][];
        triangle[0] = new int[1];
        triangle[0][0] = 1;
        triangle[1] = new int[2];
        triangle[1][0] = 1;
        triangle[1][1] = 1;


        return triangle;
    }

    public static void main(String[] args) {
        PrintUtils.printIntMatrix(pascalTri(5));
    }
}


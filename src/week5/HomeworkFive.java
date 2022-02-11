package week5;

import java.util.Arrays;

public class HomeworkFive {
    public static void main(String[] args) {
        int[] intArray = {4, 1, 3};
        String[] stringArray = {"hi", "bye", "mymymy!"};
        double[] doubleArray = new double[5];

        doubleArray[0] = intArray[1];
        doubleArray[1] = 1.5;

        int[] otherIntArray = intArray;
        int[] anotherIntArray = Arrays.copyOf(intArray, intArray.length);

        boolean arraysEqualOne = (anotherIntArray == intArray);
        boolean arraysEqualTwo = (Arrays.equals(anotherIntArray,  intArray));
        intArray[1] += intArray[2];

//        System.out.println(stringArray[2].length());
//        System.out.println(stringArray[stringArray.length - 1])
//        System.out.println(doubleArray[1] + stringArray[2]);
//        System.out.println(intArray[(int) doubleArray[1]]);
        System.out.println(intArray[1]);
        System.out.println(stringArray[1]);
    }
}

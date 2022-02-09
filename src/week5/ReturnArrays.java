package week5;

import java.util.Arrays;

public class ReturnArrays {

    public static int[] createArrayOfLargerElements(int[] array1, int[] array2)
    {
        int[] newArray = new int[array1.length];

        for (int count = 0; count < array1.length; count++)
        {
            if (array1[count] > array2[count])
                newArray[count] = array1[count];
            else newArray[count] = array2[count];
        }

        return newArray;
    }

    public static void main(String[] args) {
        int[] test1 = {2, 25, 4, 6};
        int[] test2 = {5, 16, 4, 57};

        System.out.println(Arrays.toString(createArrayOfLargerElements(test1, test2)));
    }

}

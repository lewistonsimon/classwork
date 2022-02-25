package week6;

import java.util.Arrays;

public class HomeworkSix {
    public static boolean betweenBoundaries(float low,
                                            float high, int [] numbers) {
        boolean result = false;
        for (int i = 0; i <= numbers.length - 1; i++)
        {
            if (numbers[i] > low)
            {
                if (numbers[i] < high)
                {
                    result = true;
                }
                else
                {
                    return false;
                }

            }
            else {
                return false;
            }
        }
        return result;
    }


    public static void main(String[] args) {
        int[] myArray = {3, 3, 5, 3, 12};
        System.out.println(betweenBoundaries(1, 20, myArray));

    }
}


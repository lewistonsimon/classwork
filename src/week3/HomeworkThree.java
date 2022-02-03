package week3;

import java.util.Scanner;

public class HomeworkThree {
    public static void numbers() {
        int sum_in_range = 0;
        boolean done = false;
        while (!done)
        {
            Scanner input = new Scanner(System.in);
            System.out.print("Please enter an integer or q to quit: ");
            String user_input = input.nextLine();
            if (user_input.equals("q"))
            {
                done = true;
            }
            else if (Integer.parseInt(user_input) > 10 && Integer.parseInt(user_input) < 15)
            {
                sum_in_range++;
            }
        }
        System.out.println("Number in range is " + sum_in_range);
    }
    public static void main(String[] args) {
        numbers();
    }
}






















//public class HomeworkThree {
//    public static String problemfour(String first, String second, int n) {
//        String example = first + second.repeat(n);
//        System.out.println(example);
//        return example;
//    }
//
//    public static void main(String[] args) {
//        problemfour("Hi", "Lo", 10);
//    }
//}






//public class HomeworkThree {
//    public static boolean problemfive(String s1, String s2, String s3) {
//        boolean answer;
//        int result = s1.compareTo(s2);
//        int secondResult = s2.compareTo(s3);
//        if (result < 0 && secondResult < 0)
//        {
//            answer = true;
//        }
//        else if (result > 0 && secondResult > 0)
//        {
//            answer = true;
//        }
//        else
//        {
//            answer = false;
//        }
//        return answer;
//    }
//
//    public static void main(String[] args) {
//        problemfive("hard", "man", "rock");
//    }
//}


//    public static void printRows2(int maxRows, int maxCols)
//        {
//            for (int i = 1; i <= (maxCols * maxRows); i++)
//            {
//                System.out.print("*");
//                if (i % maxCols == 0)
//                {
//                    System.out.println();
//                }
//            }
//
//        }
//
//    public static void main(String[] args) {
//            printRows2(3,4);
//        }
//}










































//    public static int func1(int x, String y) {
//        return 0;
//
//    }
//    public static String func2(String x, int y) {
//        return " ";
//    }
//
//    public static void main(String[] args) {
//        int a = 3;
//        String b = "hi";

//        func1(2 * a, a + b);
//        func2(a, b);
//        func2(func2(b, a), int a)
//        func1(b.length(), func2("Hi", 2.0 * a));
//        func2(b + func1(5, b), func1(a, b) + func1(a/2, b));



package week8;

import java.util.ArrayList;

// Problem 5
public class HomeworkEight {
public static void printNumbers(int n) {
        if (n <= 0)
        System.out.println();
        else {
        System.out.print(n + " ");
        printNumbers(n-1);
        }
        }



public static int multiplyNumbers(int n) {
        if (n <= 0) return 0;
        else if (n == 1) return 1;
        else return n * multiplyNumbers(n-1);
        }

public static void main(String[] args) {
        printNumbers(6);
        System.out.println(multiplyNumbers(6));

        }

}












// Problem 4
//public class HomeworkEight {
//    public static int mystery(ArrayList<String> strings, String target, int position){
//        if (position < strings.size()) {
//            if (strings.get(position).equals(target))
//                return position;
//            else
//                return mystery(strings, target, position + 1);
//        } else
//            return -1;
//    }
//
//}
















// Problem 3
//    public static String reverseString(String inString) {
//        if (inString.length() <= 1)
//        {
//            return inString;
//        }
//        else
//        {
//            String first = inString.substring(0, 1);
//            String last = inString.substring(inString.length() - 1);
//            String middle = inString.substring(1,inString.length() - 1);
//            System.out.println(last + middle + first);
//            return last + reverseString(middle) + first;
//        }
//    }
//
//    public static void main(String[] args) {
//        System.out.println(reverseString("abcdef"));
//    }
//}

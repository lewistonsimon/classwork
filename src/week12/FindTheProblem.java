package week12;

import java.util.ArrayList;
import java.util.List;

public class FindTheProblem {

    public static void insertString(List<String> lst, String element ) {
        for (int i = 0; i < lst.size(); i++ )  {
            if (i % 2 == 0) {
                lst.add(i, element);
            }
//            lst.add(i, element);
        }
    }
    public static void main(String[] args) {
        // Add a small string in front of every word in the ArrayList
        ArrayList<String> words = new ArrayList<String>();
        words.add("four");
        words.add("score");
        words.add("and");
        words.add("seven");
        words.add("years");
        words.add("ago");
        System.out.println("Before " + words);
        insertString(words, "~");
        System.out.println("After " + words);
    }
}


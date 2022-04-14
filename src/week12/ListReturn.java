package week12;

import java.util.ArrayList;
import java.util.List;

public class ListReturn {

    public static List<Integer> problemSix(List<Integer> test, int n) {
        for (int item = test.size() - 1; item >= n; item--) {
            test.remove(item);
        }
        return test;
    }

    public static void main(String[] args) {
        List<Integer> myList = new ArrayList<>();
        myList.add(1);
        myList.add(3);
        myList.add(8);
        myList.add(-1);
        myList.add(5);
        myList.add(1);
        myList.add(4);
//        System.out.println(problemSix(myList,0));
        System.out.println(problemSix(myList,3));

    }
}
